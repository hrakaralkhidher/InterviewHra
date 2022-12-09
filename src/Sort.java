import java.util.ArrayList;
import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {

//    (Array) Sort Descending
//    Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
//
//    Ex:  int[] arr = {10,20,70, 80, 90};
//
//    arr = Sort(arr);  ==>  {90, 80, 70, 20, 10};
        int[] arr = {10,20,70, 80, 90};
        SortingArrayDesc(arr);
        
    }
    public static void SortingArrayDesc(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void Line(){
        System.out.println("________________________________________");
    }
}
