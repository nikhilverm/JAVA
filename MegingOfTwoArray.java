import java.util.Scanner;

public class MergeTwoArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] arr1=new int[n];
        int[] arr2=new int[arr.length+arr1.length];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i <arr1.length ; i++) {
            arr1[i]=sc.nextInt();
        }
        for (int i = 0; i <arr.length ; i++) {
            arr2[i]=arr[i];
        }
       for (int i=0;i<arr1.length;i++){
           arr2[i+(arr.length)]=arr1[i];
        }
       System.out.println("The new merged array list is: ");
       for (int no:arr2){
           System.out.print(no+" ");
       }
}
}
