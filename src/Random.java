import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Random {
    public static void main(String[] args) {
        int[] number = {2, 3, 4, 5, 6};
        int target = 11;
        System.out.println(twoSum(number, target));
//        System.out.println(Arrays.toString(twoSum(number, target)));
    }

    public static boolean twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void twoSum1(int[] num1, int target1) {
        for (int i = 0; i < num1.length; i++) {
            for (int j = i + 1; j < num1.length; j++) {
                if (num1[i] + num1[j] == target1) {
                    System.out.println(num1[i]+" + "+num1[j]+" = "+target1);
                }
            }
        }

    }
}


