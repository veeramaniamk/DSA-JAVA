

import java.util.ArrayList;
import java.util.List;

public class Practice {

    static String reverse(String str) throws Exception {

        if(str==null  || str.isBlank()) throw new Exception("Invalid string value");

        StringBuilder value = new StringBuilder(str);
        value.reverse();

//        for(int i = str.length()-1;i>=0;i--) {
//            value.append(str.charAt(i));
//        }

        return value.toString();
    }

    static boolean palindrome(String str) throws Exception {
        return reverse(str).equals(str);
    }

    static int largestNumberInArray(int[] arr) throws Exception {

        if(arr==null || arr.length==0) throw new Exception("Invalid array");

        int value = arr[0];

        for(int a:arr) {
            if(value<a) {
                value = a;
            }
        }

        return value;
    }

    static int secondLargestNumberInArray(int[] arr) throws Exception  {

        if(arr==null || arr.length==0) throw new Exception("Invalid array");

        int max = arr[0];
        int secondMax = arr[0];

        for(int a:arr) {
            if(max<a) {
                secondMax = max;
                max = a;
            } else if (secondMax<a && max!=a) {
                secondMax = a;
            }
        }

        return secondMax;
    }

    static int[] moveZerosLastInArray(int[] a) throws Exception{

        if(a==null || a.length==0) {
            throw new Exception("Invalid array");
        }

        int[] value = new int[a.length];
        int index = 0;
        for (int j : a) {
            if (j != 0) {
                value[index++] = j;
            }
        }
        while(index<a.length) {
            value[index++] = 0;
        }
        return value;
    }

    static int[] moveZerosFirstInArray(int[] a) {
        int[] value = new int[a.length];

        int index = a.length - 1;

        for(int i=index;i>=0;i--) {
            if(a[i]!=0) {
                value[index--] = a[i];
            }
        }

        while(index>=0) {
            value[index--] = 0;
        }

        return value;
    }

    static int[] twoSum(int[] nums, int target) {
        int[] value = new int[2];

        for(int i=0;i<nums.length;i++) {
            for(int j=0;j<nums.length;j++) {
                if(i!=j && nums[i] + nums[j] == target) {
                    value[0] = j;
                    value[1] = i;
                }
            }
        }

        return value;
    }

}
