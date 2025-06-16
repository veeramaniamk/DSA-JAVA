package util;

public class Matrix {

    public void addition(int[][] a, int[][] b) throws Exception {

        if(a.length == 0 || b.length == 0) throw new IllegalStateException("Empty Matrix Found");

        boolean itIsPossibleToCalculate = true;
        int firstMatrixRowCount = a.length;
        int secondMatrixRowCount = b.length;
        int firstMatrixColumnCount = a[0].length;
        int secondMatrixColumnCount = b[0].length;

        System.err.println("a.length -> "+ firstMatrixRowCount + " a[0].length -> " + a[0].length);

        for(int i=0;i<firstMatrixRowCount;i++) {
            if(a[0].length!=a[i].length) throw new IllegalStateException("First matrix column values are not same");
        }

        for (int index = 0; index < b.length; index++) {
            if(b[0].length!=b[index].length) throw new IllegalStateException("Second matrix column values are not same");
        }

        if(firstMatrixRowCount != secondMatrixRowCount) throw new IllegalStateException("Given matrix row values are not matching");

        for(int i=0;i<firstMatrixRowCount;i++) {
            if(a[i].length!=b[i].length) throw new IllegalStateException("First and Second matrix column values are not matching");
        }

        

    }
    
}
