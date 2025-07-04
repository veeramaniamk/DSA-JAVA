package util;

public class Numbers {

    public int[] fibonacci(int length) {
        int[] result = new int[length];

        int first = 0, second = 1;

        for(int i = 0;i<length;i++) {

            result[i] = first;
            int third = first + second;
            first = second;
            second = third;

        }

        return result;
    }

}