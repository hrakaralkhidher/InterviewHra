import java.util.LinkedHashSet;
import java.util.Set;

public class TC {

    public class UniqueLetters {
        public static void main(String[] args) {
            // Test the uniqueLetters method
            String myString = "balloon";
            System.out.println(uniqueLetters(myString)); // Output: "balon"
        }

        public static String uniqueLetters(String s) {
            Set<Character> mySet = new LinkedHashSet<>(); // LinkedHashSet to maintain order

            for (char c : s.toCharArray()) {
                if (Character.isLetter(c)) {
                    mySet.add(c);
                }
            }

            // Concatenate the unique letters into a String
            String result = "";
            for (Character uniqueChar : mySet) {
                result += uniqueChar;
            }

            return result;
        }
    }

}