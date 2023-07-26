public class IsPrimeNumberOrNot {
    public static void main(String[] args) {
// some Prime numbers are 2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97
        int number = 17;
        System.out.println(isPrime(number));

    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 0 and 1 are not prime numbers
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {//prime number is a number that is only divisible by 1 and itself without leaving a remainder.
                return false; // divisible by a number other than 1 and itself
            }
        }
        return true; // if number is prime it will return true
    }
}
