import java.util.Arrays;

public class findTheSecondLargeNumberInArray {
    public static void main(String[] args) {
        int[] array={2,4,5,3,6,7,8,10,15,20};
        System.out.println(findSecondLargest(array));
    }
    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array must have at least two elements.");
        }
        Arrays.sort(arr);
        return arr[arr.length - 3];
    }
}
