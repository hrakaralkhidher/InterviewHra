public class TheSumOfDigitsInString {
    public static void main(String[] args) {
        //write a code where it finds the sum of the digits inside the a String
        // ex: j4a4v1 should be 9;

        System.out.println(SumOfDigits("b8A7v6"));
//        System.out.println(SumofNums("j4a4v1"));

    }
    public static int SumOfDigits (String param){
        int sum = 0;

        char[] ch1 = param.toCharArray();
        for (char each: ch1){
            if(Character.isDigit(each)){
                sum += Integer.valueOf(""+each);
            }
        }
        return sum;
    }
    public static int SumofNums(String param){
        //write a code where it returns the sum of digits inside a String for example am2tw12ar3fj11 should equla 28

        int Total = 0;
        for(int i = 0 ; i < param.length(); i++){
            char c = param.charAt(i);
            if(Character.isDigit(c)){
                Total = Total+c;
            }
            }
        return Total;
        }

    }

