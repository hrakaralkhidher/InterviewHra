import java.util.Scanner;

public class ReverseStringsWays {
    public static void main(String[] args){
       String name = "Hrakar";

        System.out.println("reversed Version: "+reverseUsingForloop(name));
        line();
        System.out.println("Reverse using String Buffer>>>> "+StringBuilderreverese("jermy"));
        line();
        System.out.println("using StringBuilder to reverse a String>>>>> "+StringBuilderreverese("Hrakar"));
        line();
        System.out.println("Reverse String use the Regular way with forLopps: "+RegularWay(name));
        line();
        System.out.println("using foreach to reverse a String>>>>. "+ForEachReverse("Angle"));

    }

    public static String StringBuilderreverese(String param){
        StringBuilder sb = new StringBuilder(param);
        sb.reverse();
        return sb.toString();
    }

    public static String StringBufferReverse(String param){
        return new StringBuffer(param).reverse().toString();
    }

    public static String ForEachReverse(String param){
        char[]MyCharArray = param.toCharArray();
        String ReversedString = "";
        for(char mychar: MyCharArray){
            ReversedString = mychar + ReversedString;
        }
        return ReversedString;

    }

    public static String RegularWay(String param1){
        char[] MyCharArray = param1.toCharArray();
        String ReversedString = "";
        for (int i = 0; i < MyCharArray.length; i++) {
//            "Hrakar"
//                    H
//                rH
//                   arH
            ReversedString = MyCharArray[i] + ReversedString;
        }
        return ReversedString;
    }
    public static String reverseUsingForloop(String param){
        String rev="";
        for (int i = 0; i < param.length(); i++) {
            rev=param.charAt(i)+rev;
        }
        return rev;
    }
    public static void line(){
        System.out.println("_______________________________________");
    }

}