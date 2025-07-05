
public class AdditionMatrix {

    public int[][] matrixAddition(int[][] sample, int[][] second) throws RuntimeException {

        if(sample.length != second.length) {
            throw new RuntimeException("Row values are not matching");
        }

        if(sample[0].length != second[0].length) {
            throw new RuntimeException("Column values are not matching");
        }

        int[][] result = new int[sample.length][sample[0].length];

        for(int i=0;i<sample.length;i++) {

            for(int j=0;j<sample[i].length;j++) {

                result[i][j] = sample[i][j] + second[i][j];

            }

        }

        return result;

    }

}