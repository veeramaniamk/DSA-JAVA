
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

        // try {
        //   int[][] mat = matrix.generateSpiralMatrix(1000);
        //   for (int[] row : mat) {
        //     for (int val : row) {
        //         System.out.printf("%3d ", val);
        //     }
        //     System.out.println();
        //   }
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }

        spiral(25);
        
    }

    static void spiral(int a) {

        int size = 0;
        while(size * size > a) {
            size++;
        }

        int left = 0, right = size - 1;
        int top = 0, bottom = size - 1;
        int number = 1;

        int[][] result = new int[size][size];

        while(number<=size) {

            for(int i=left;i<=right && number<=size;i++) {
                result[left][i] = number++;
            }
            top++;

            for(int i=top;i<=bottom && number<=size;i++) {
                result[i][right] = number++;
            }
            right--;

            for(int i=right;i>=left && number<=size;i--) {
                result[bottom][i] = number++;
            }
            bottom--;

            for(int i=bottom;i>=top && number<=size;i--) {
                result[left][i] = number++;
            }
            left++;

        }

        int[][] mat = result;
          for (int[] row : mat) {
            for (int val : row) {
                System.out.printf("%3d ", val);
            }
            System.out.println();
          }

    }


}
