
import collections.LinkedListPractice;
import util.Matrix;

public class Main {
    
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        int[][] a = {
            {1,2,3}
        };
        try {
          int[][] mat = matrix.addition(a, a);
          for(int i=0;i<mat.length;i++) {

            for(int j=0;j<mat[i].length;j++) {
                System.out.print("i=" + i +"+"+ "j=" + j + "--" + mat[i][j] + " ");
            }
            System.out.println();
          }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
