

public class ArmStrongNumbers {
    public static void main(String[] args) {
        int sum = 0;// to sum the digits
        int digit;// to store each digit
        int temp; // temporary variable to store number
        int number = 370; // number to determine if its armstrong or not
        temp = number;// assign the number to temp
        while (temp > 0){// will run to process each digit
            digit = temp % 10;//calculate the remainder of temp
            sum = sum + (digit*digit*digit);
            temp = temp / 10;
        }
        if (number == sum)
            System.out.println(number + " is an armstrong number");

        System.out.println("*********************************************");

        System.out.println(isArmstrongNumber(153));
    }
    //Another way to do armstrong numbers
    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length();

        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }

        return sum == originalNumber;
    }
}
