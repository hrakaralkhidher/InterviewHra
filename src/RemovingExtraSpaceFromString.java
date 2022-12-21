import java.util.StringTokenizer;

public class RemovingExtraSpaceFromString {
    public static void main(String[] args) {
        //Remove Extra space in the String
        String input = "Try    to    remove  extra   spaces.";
        StringTokenizer substr = new StringTokenizer(input, " ");
        StringBuffer SB = new StringBuffer();

        while(substr.hasMoreElements()){
            SB.append(substr.nextElement()).append(" ");
        }
        System.out.println("Actual String: "+input);
        System.out.println("Processed String: "+SB.toString().trim());
    }
}
