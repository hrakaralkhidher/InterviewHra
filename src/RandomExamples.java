public class RandomExamples {
    public static void main(String[] args) {
        // write all the methods you know to reveres a String?
        String StringBuffer= "Hello People";
        System.out.println(StringBufferReversed(StringBuffer));
        line();
        String S1tringBuilder = "Hrakar";
        System.out.println(StringBuilder(S1tringBuilder));
        line();
        String ForEach = "REversed";
        System.out.println(ForEachRev(ForEach));

    }
    public static String ForEachRev (String param1){
        char[] MyCharArray = param1.toCharArray();
        String Reverse = "";
        for (char MyChar: MyCharArray) {
            Reverse = MyChar + Reverse;
        }
        return Reverse;
    }
    public static String StringBuilder(String param1){
        StringBuilder SB = new StringBuilder(param1);
        SB.reverse();
        return SB.toString();
    }
    public static String StringBufferReversed(String param1){
        return new StringBuffer(param1).reverse().toString();
    }
    public static void line(){
        System.out.println("*************************");
    }
}
