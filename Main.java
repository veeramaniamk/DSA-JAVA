
import util.Matrix;

public class Main {
    
    public static void main(String[] args) {
        
        Matrix matrix = new Matrix();

        int[][] a = {
           {1, 2, 3},
            {4, 5, 6}
        };

        int[][] b = {
             {7, 8},
            {10, 11},
            {13, 14}
        };

        try {
          int[][] mat = matrix.transpose(b);
          for(int i=0;i<mat.length;i++) {

            for(int j=0;j<mat[i].length;j++) {
                System.out.print(
                    i+""+j+"-"+mat[i][j]+" "
                );
            }
            System.out.println();
          }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
