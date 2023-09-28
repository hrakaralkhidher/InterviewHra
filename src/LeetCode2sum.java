import java.util.Arrays;

public class LeetCode2sum {
    //Given an array of integers nums and an integer target,
// return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution,
// and you may not use the same element twice.
//You can return the answer in any order.
    public static void main(String[] args) {
        int[]number= {2,3,4,5,6};
        int target= 11;
        System.out.println("The indexes are "+Arrays.toString(twoSum(number,target)));
        System.out.println("___________________________________________");
        twoSum1(number,target);
        System.out.println("___________________________________________");
        System.out.println("Boolean condition is "+twoSum2(number,target));
    }
    public static int[] twoSum(int[]nums, int target){
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if (nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
    public static void twoSum1(int[] num1, int target1) {
        for (int i = 0; i < num1.length; i++) {
            for (int j = i + 1; j < num1.length; j++) {
                if (num1[i] + num1[j] == target1) {
                    System.out.println("Numbers inside Array "+num1[i]+" + "+num1[j]+" = "+target1);
                }
            }
        }
    }
    public static boolean twoSum2(int[] num2, int target2) {
        for (int i = 0; i < num2.length; i++) {
            for (int j = i + 1; j < num2.length; j++) {
                if (num2[i] + num2[j] == target2) {
                   return true;
                }
            }
        }
        return false;
    }

}
