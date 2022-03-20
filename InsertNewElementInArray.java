import java.util.Scanner;

public class InsertNewElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the index position and value to be inserted: ");
        int index=sc.nextInt();
        int value=sc.nextInt();
        for (int i = arr.length-1; i>=index; i--){
            arr[i]=arr[i-1];
        }
        arr[index]=value;
       System.out.print("The new array list is: ");
      for (int no:arr){
          System.out.print(no+" ");
      }
    }
}
