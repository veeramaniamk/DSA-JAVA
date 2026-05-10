public class Practice {

    static String reverse(String str) throws Exception {

        if(str==null  || str.isBlank()) throw new Exception("Invalid string value");

        StringBuffer value = new StringBuffer(str);
        value.reverse();

//        for(int i = str.length()-1;i>=0;i--) {
//            value.append(str.charAt(i));
//        }

        return value.toString();
    }

}
