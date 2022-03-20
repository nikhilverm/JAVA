import java.util.HashSet;
import java.util.Set;

public class MissingNum {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        int[] arr = {1, 2, 3, 4, 5, 4, 2};
        int[] arr1 = {5, 4, 2, 6, 7, 8, 9};
        int[] arr2 = {5, 1, 9, 11, 12, 15, 9};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr[i] == arr1[j]) {
                    for (int k = 0; k < arr2.length; k++) {
                        if (arr[i] == arr2[k]) {
                            set.add(arr[i]);
                        }
                    }
                }
            }
        }
        System.out.println("Common elements in three array is: ");
        for (int no:set) {
            System.out.print(no);
        }
    }
}