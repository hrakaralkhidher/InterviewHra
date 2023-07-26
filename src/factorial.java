public class factorial {
    public static void main(String[] args) {

        // what is the factorial sum of the given number?
        // 1 2 3 4 5 6 7 8 9 10
        int number = 18;
//        System.out.println(facto(number));
        System.out.println("--------------------------------");

        int number1 = 10;
        int factorialSum = 1;
        for (int i = 1; i <= number1; i++) {
            factorialSum = factorialSum * i;
        }
        System.out.println("Factorial of " + number1 + " is " + factorialSum);
    }
}
//    public static long facto(long param){

//         long = 1;
//        for(int i = 1;i <= param; i++){
//            long = long * i;
//        }
//        return long;
//    }
//}
