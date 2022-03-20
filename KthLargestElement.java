import java.util.Scanner;

public class KthLargestElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter kth largest Element no.: ");
        int k=sc.nextInt();
        for (int i=0; i<arr.length-1; i++) {
            for(int j=0;j<arr.length-1-i; j++){
                int temp;
                if(arr[j]<arr[j+1]){
                 temp= arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
              }
            }
            }
        System.out.println(k+ " largest elemnt is "+arr[k-1]);
      }
    }