import javax.security.auth.callback.CallbackHandler;

public class Pra {
    public static void main(String[] args) {
        String str = "Race, Car";
        System.out.println(isItPalindrome(str));
    }
    public static boolean isItPalindrome(String param){
        param = param.toLowerCase();

        int i = 0;
        int j = param.length() - 1;
        while(i < j){
            Character left = param.charAt(i);
            Character right = param.charAt(j);

            if(!Character.isLetterOrDigit(left)){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(right)){
                j--;
                continue;
            }
            if(left != right){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
