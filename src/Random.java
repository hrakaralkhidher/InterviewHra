import java.util.StringTokenizer;

public class Random {
    public static void main(String[] args) {
        //reverse a String
        String name = "hrakar";
        System.out.println(ForEach(name));

        //String buffer rev
        System.out.println(StringBufferRev(name));
    }
    public static String ForEach(String param1){
        char[] MyCharArray = param1.toCharArray();
        String rev = "";
        for (char MyChar:MyCharArray) {
            rev = MyChar + rev;
        }
        return rev;
    }
    public static String StringBufferRev(String param1){
        return new StringBuffer(param1).reverse().toString();
    }

}
