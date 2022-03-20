import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MissingNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr=new int[num];
        int[] arr1=new int[num];
        Set<Integer> hs=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i <arr1.length ; i++) {
            arr1[i]=sc.nextInt();
        }
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr1.length ; j++) {
                if(arr[i]==arr1[j]){
                    hs.add(arr[i]);
                }
            }
        }
        System.out.println("The common elements are: ");
        for(int i:hs){
            System.out.println(i+" ");
        }
    }
}