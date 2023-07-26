import java.util.Arrays;

public class LeetCode2sum {
    public static void main(String[] args) {
        int[]number= {2,3,5,4,5};
        int target= 9;
        System.out.println(twoSum(number, target));
    }

   public static int[] twoSum(int[] nums, int target){
       for (int i = 0; i < nums.length; i++) {

           for(int j =i + 1; j < nums.length; j++ ){
               if(nums[i] + nums[j] == target){
                   return new int[]{i, j};
               }
           }
       }
       return nums;
   }


}
