
import util.Numbers;

public class Main {
    
    public static void main(String[] args) {
        Numbers n= new Numbers();
        fun(20);
    }

    static void fun(int value) {

        int size = 0, number = 1;

        while(size * size < value) size++;

        int left = 0, right = size - 1, top = 0, bottom = size - 1;

        int[][] result = new int[size][size];

        while(value >=number) {

            for(int i=left;i<=right && number<=value;i++) {
                result[top][i] = number++;
            }
            top++;

            for(int i=top;i<=bottom && number<=value;i++) {
                result[i][right] = number++;
            }
            right--;

            for(int i=right;i>=left && number<=value;i--) {
                result[bottom][i] = number++;
            }
            bottom--;

            for(int i=bottom;i>=top && number<=value;i--) {
                result[i][left] = number++;
            }
            left++;
        }

        for(int[] row:result) {
            for(int col:row) {
                System.out.printf("%3d ", col);
            }
            System.out.println();
        }

    }

}
