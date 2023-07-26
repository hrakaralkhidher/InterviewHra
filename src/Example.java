public class Example {
    public static void main(String[] args) {
        // write a method where you can reverse a number

        int a = 145;
        System.out.println(reverse(a));
    }

    public static int reverse(int num) {
        String str= Integer.toString(num);
        String rev = "";
        for(int i = str.length()-1; i >= 0; i --){
            rev = rev + str.charAt(i);
        }
        return Integer.parseInt(rev);
    }
}
//    public static int reverse (int num){
//        int rev = 0;
//        while (num !=0){
//            rev = (rev * 10) + (num % 10);// trying to get the remainder
//            num = num / 10; // getting rid of the remainder
//        }
//        return rev;
//    }
