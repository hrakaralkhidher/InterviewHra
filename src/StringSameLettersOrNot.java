import java.util.Arrays;

public class StringSameLettersOrNot {
    //check if the String is made out of the same letters or not
    //for example(abc is cba return true if abs and bbc this should be false
    public static void main(String[] args) {

        System.out.println("IfSameOrNot(\"abc\",\"cab\") = " + IfSameOrNot("abc", "cab"));
        System.out.println("IfSameOrNot(\"abc\",\"cab\") = " + IfSameOrNot("abc", "bac"));
        System.out.println("IfSameOrNot(\"abc\",\"cab\") = " + IfSameOrNot("abc", "bbc"));
    }
    public static boolean IfSameOrNot(String a, String b){
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String a1="",a2="";
        for(char each: ch1){
            a1 +=each;
        }
        for (char each: ch2){
            a2 += each;
        }
            return a1.equals(a2);
    }
}
