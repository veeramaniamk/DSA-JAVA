
import util.Matrix;

public class Main {
    
    public static void main(String[] args) {
        
        Matrix matrix = new Matrix();

        String string = "";


        int[][] a = {
           {1, 2, 3},
            {4, 5, 6}
        };

        int[][] b = {
             {7, 8},
            {10, 11},
            {13, 14}
        };

        int size = 0, value = 5;
        
        while(size * size < value) {
            size++;
        }

        System.out.println(size);

        try {
          int[][] mat = matrix.generateSpiralMatrix(1000);
          for (int[] row : mat) {
            for (int val : row) {
                System.out.printf("%3d ", val);
            }
            System.out.println();
          }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }


}
