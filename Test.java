import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.*;

public class Test {

    private static final int REQUEST_COUNT = 1000;

    public static void main(String[] args) throws Exception {

        String apiUrl = "http://3.111.211.34:8080/themes";

        ExecutorService executor = Executors.newFixedThreadPool(REQUEST_COUNT);

        CountDownLatch startGate = new CountDownLatch(1);
        CountDownLatch endGate = new CountDownLatch(REQUEST_COUNT);

        HttpClient client = HttpClient.newHttpClient();

        for (int i = 0; i < REQUEST_COUNT; i++) {

            final int id = i;

            executor.submit(() -> {
                try {

                    // Wait until all threads are ready
                    startGate.await();

                    HttpRequest request = HttpRequest.newBuilder()
                            .uri(URI.create(apiUrl))
                            .header("Content-Type", "application/json")
                            .GET()
                            .build();

                    HttpResponse<String> response =
                            client.send(request,
                                    HttpResponse.BodyHandlers.ofString());

                    System.out.println(
                            "Request " + id +
                                    " Status: " + response.statusCode());

                } catch (Exception e) {
                    System.out.println(
                            "Request " + id +
                                    " Failed: " + e.getMessage());
                } finally {
                    endGate.countDown();
                }
            });
        }

        System.out.println("All threads ready...");
        Thread.sleep(3000);

        long startTime = System.currentTimeMillis();

        // Release all 1000 threads
        startGate.countDown();

        endGate.await();

        long endTime = System.currentTimeMillis();

        System.out.println("Completed in "
                + (endTime - startTime) + " ms");

        executor.shutdown();
    }
}