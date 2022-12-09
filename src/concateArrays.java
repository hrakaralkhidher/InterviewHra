import java.util.Arrays;

public class concateArrays {
    public static void main(String[] args) {
        //write a code to concate to arrays for example
        //int []arr1 = {1,2,3,4};
        //int[]arr2={5,6,7,8,9,10};
        //results should be int [] results = {1,2,3,4,5,6,7,8,9,10};
        int []arr1 = {1,2,3,4};
        int[]arr2={5,6,7,8,9,10};

//        System.out.println(concatArrays(arr1, arr2));//[I@1540e19d
        System.out.println("concatArrays() = " + Arrays.toString(concatArrays(arr1,arr2)));

    }
    public static int[] concatArrays(int [] a , int [] b){
        int[] results = new int[a.length + b.length];
        int i = 0;

        for (int each: a){
            results[i] = each;// this for each wil add the 1st array to the results and also increase the iteration
            i++;
        }
        for (int each: b){
            results[i] = each;// this for each wil add the 2st array to the results and also increase the iteration
            i++;
        }
        return results;
    }
}
