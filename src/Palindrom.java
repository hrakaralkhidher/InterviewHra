public class Palindrom {
    public static void main(String[] args) {
// ways to do check if the string is palindrom or not
        System.out.println(isitPalindrome("RaCeCar"));

    }

    public static boolean isPalindrom(String str) {
        if (str == null)
            return false;
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString().equals(str);

    }

    public static boolean isitPalindrome(String param1) {
        param1 = param1.toLowerCase();
        int left = 0;
        int right = param1.length() - 1;

        while (left < right) {
            if (param1.charAt(left) != param1.charAt(right)) {
                return false; // Characters don't match, not a palindrome
            }
            left++;
            right--;
        }
        return true; // All characters match, it is a palindrome
    }

    // Best way to do a palindrome problem for an iterviewe
    public static boolean isItPalindorme(String param) {
        param = param.toLowerCase();

        int i = 0;
        int j = param.length() - 1;
        while (i < j) {
            Character right = param.charAt(i);
            Character left = param.charAt(j);
            if (!Character.isLetterOrDigit(i)) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(j)) {
                j--;
                continue;
            }
            if (left != right) {
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
}
