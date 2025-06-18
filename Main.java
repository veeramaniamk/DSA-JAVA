
import util.Matrix;

public class Main {
    
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        int[][] a = {
            {1,2,3}
        };

        int[][] b = {
            {1,2,3}, {22,1,2}
        };
        try {
          int[][] mat = matrix.addition(a, b);
          for(int i=0;i<mat.length;i++) {

            for(int j=0;j<mat[i].length;j++) {
                System.out.print("i=" + i +"+"+ "j=" + j + "--" + mat[i][j] + " ");
            }
            System.out.println();
          }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
