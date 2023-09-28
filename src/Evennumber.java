import java.util.ArrayList;
import java.util.List;

public class Evennumber {
    public static void main(String[] args) {
        int [] num = {1,15,25,-2, 34, 56, 76, 17, 22, 34, 66, 897};
        System.out.println(Evennums(num));
    }
    public static List<Integer> Evennums(int [] numbers){
        List<Integer> onlyeven = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%2 == 0){ // if want odd numbers only we add ! by the equal sign
                onlyeven.add(numbers[i]);
            }
        }
        return onlyeven;
    }
}
