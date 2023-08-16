import java.util.HashSet;
import java.util.Set;

public class panagram {
    public static void main(String[] args) {
        String inputString = "The quick brown fox jumps over the lazy dog.";
        boolean result = isPangram(inputString);
        System.out.println(result);  // Should print true
    }
        public static boolean isPangram(String s) {
            String alphabet = "abcdefghijklmnopqrstuvwxyz";

            // Convert the input string to lowercase to handle uppercase letters as well
            s = s.toLowerCase();

            // Create a set to store the unique letters in the input string
            Set<Character> letters = new HashSet<>();

            // Iterate through the characters in the input string
            for (char c : s.toCharArray()) {
                if (Character.isLetter(c)) {
                    letters.add(c);
                }
            }

            // Check if the set of letters is equal to the set of all alphabet characters
            return letters.size() == 26;
        }
    }

