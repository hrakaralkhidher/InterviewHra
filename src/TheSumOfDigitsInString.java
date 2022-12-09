public class TheSumOfDigitsInString {
    public static void main(String[] args) {
        //write a code where it finds the sum of the digits inside the a String
        // ex: j4a4v1 should be 9;

        System.out.println(SumOfDigits("j4a4v1"));



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
}
