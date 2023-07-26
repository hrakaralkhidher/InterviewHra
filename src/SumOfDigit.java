public class SumOfDigit {
    public static void main(String[] args) {
        int number = 1346; // for ex adding all those digits to eachother 1 + 3 + 4 + 6 = 14
        int sum = 0;
        while (number > 0){
            sum += number %10;
            number = number / 10;
        }
        System.out.println(sum);
    }
}
