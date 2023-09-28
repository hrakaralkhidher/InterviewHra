public class fibonacci {
    public static void main(String[] args) {
//write a method to calculate the fibonnaci
        // in order to do fibonnaci we need two numbers to starts and thats a and b
        int a = 0;//starting number
        int b = 1;//second starting number
        for (int i = 2; i <= 20; i++) {// reason we start the loop at 2 is because we already have a assign to 1st and b to 2nd
            int c = a + b;// we add
            a = b;
            b = c; // we assign the values to c
            System.out.print(c + " ");
        }
    }
}
