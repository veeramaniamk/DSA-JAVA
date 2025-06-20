package util;

import exception.MatrixException;

public class Matrix {

    public int[][] addition(int[][] a, int[][] b) throws Exception {

        if(a.length == 0 || b.length == 0) throw new IllegalStateException("Empty Matrix Found");

        int firstMatrixRowCount = a.length;
        int secondMatrixRowCount = b.length;
        int firstMatrixColumnCount = a[0].length;

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

        int[][] result = new int[firstMatrixRowCount][firstMatrixColumnCount];

        for(int i=0;i<firstMatrixRowCount;i++) {

            for(int j=0;j<a[i].length;j++) {
                result[i][j] = a[i][j] + b[i][j];
            }

        }

        return result;
    }

    public int[][] multiplication(int[][] a, int[][] b) throws MatrixException {

        if(a.length == 0 || b.length == 0 || a[0].length ==0 || b[0].length == 0) throw new MatrixException("Empty Matrix Found");

        int aRows    = a.length;
        int aColumns = a[0].length;
        int bRows    = b.length;
        int bColumns = b[0].length;

        if(aColumns != bRows) throw new MatrixException("Given matrix not posible for multiplication");

        int[][] result = new int[aRows][bColumns];

        for(int i=0;i<a.length;i++) {

            for(int j=0;j<a[i].length;j++) {

                for(int k=0;k<b[j].length;k++) {

                    result[i][j] = result[i][j] + (a[i][k] * b[k][j]);

                }

            }

        }

        return result;
    }
    
}
