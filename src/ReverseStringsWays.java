import java.util.Scanner;

public class ReverseStringsWays {
    public static void main(String[] args){
       String name = "Hrakar";

        System.out.println("reversed Version: "+reverseUsingForloop(name));
        line();
        System.out.println("Reversing String Using the String Buffer: "+ReverseUsingStringBuffer(name));
        line();
        System.out.println("Reverssing String Using String Builder"+USingStringBuilder(name));
        line();
        System.out.println("Reverse String use the Regular way with forLopps: "+RegularWay(name));
        line();
        System.out.println("The is the Regular way Reversing the String Using the ForEachLoops: "+RegularEayWithForEach(name));

    }

    public static String USingStringBuilder(String param1){
        StringBuilder SB = new StringBuilder(param1);
        SB.reverse();
        return SB.toString();
    }
    public static String ReverseUsingStringBuffer(String str){
        return new StringBuffer(str).reverse().toString();
    }
    public static String RegularEayWithForEach(String param1){
        char[] MyCharArray = param1.toCharArray();

        String ReveresedString ="";

        for (char MyChar:MyCharArray) {
            //MyChar = MyCharArray[i] no this is for the for lop
            ReveresedString = MyChar + ReveresedString;
        }
        return ReveresedString;
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