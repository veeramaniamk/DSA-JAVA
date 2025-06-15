package util;

public class Matrix {



    public void addition(int[][] a, int[][] b) throws Exception {

        if(a.length == 0 || b.length == 0) throw new IllegalStateException("Empty Matrix Found");

        boolean itIsPossibleToCalculate = true;
        int firstMatrixRowCount = a.length;
        int secondMatrixRowCount = 0;
        int firstMatrixColumnCount = 0;
        int secondMatrixColumnCount = 0;

        System.err.println("a.length -> "+ firstMatrixRowCount + " a[0].length -> " + a[0].length);

        for(int i=0;i<firstMatrixRowCount;i++) {
            System.err.println( "dd "+a[i].length);
            if(a[0].length!=a[i].length) throw new IllegalStateException("First matrix column values are not same");
        }

        for (int index = 0; index < b.length; index++) {
            
        }

    }
    
}
