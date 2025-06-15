
import collections.LinkedListPractice;
import util.Matrix;

public class Main {
    
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        int[][] a = {
            {1,2,3}
        };
        try {
          matrix.addition(a, a);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
