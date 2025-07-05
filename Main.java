
import util.Numbers;

public class Main {
    
    public static void main(String[] args) {
       AdditionMatrix additionMatrix = new AdditionMatrix();

        int[][] a = {{1,2,3}, {4,5,6}};
        int[][] b = {{1,2,3}, {4,5,6}};

       try{
        int[][] re = additionMatrix.matrixAddition(a, b);

        for(int i=0;i<re.length;i++) {
            for(int j=0;j<re[i].length;j++) {
                System.out.print(re[i][j]+" ");
            }
            System.out.println();
        }

       } catch(Exception e) {
         System.out.println(e.getMessage());
       }

       
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
