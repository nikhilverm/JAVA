public class MissingNum {
    public static void main(String[] args) {
     int[] arr={1,2,3,4,5,7};
     int expected=arr.length+1;
     int total_expected=expected*(expected+1)/2;
     int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
        }
        System.out.println("Missing number is " +(total_expected-sum));
    }
}
