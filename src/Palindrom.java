public class Palindrom {
    public static void main(String[] args) {
// ways to do check if the string is palindrom or not
        System.out.println(isItPalindrome("level"));

    }

    public static boolean isPalindrom(String str){
        if(str == null)
            return false;
            StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString().equals(str);

    }
    public static boolean isItPalindrome(String param1) {
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

}
