
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

}
