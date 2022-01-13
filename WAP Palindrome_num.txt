import java.util.Scanner;

class Palindromeno{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        int rev = 0,rem;
        while (num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        if(temp == rev) {
            System.out.println("Yes,,this number is palindrome!");
        } 
        else {
            System.out.println("Sorry,this number is not palindrome!");
        }
    }
}