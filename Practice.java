

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

    static boolean palindrome(String str) throws Exception{
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

}
