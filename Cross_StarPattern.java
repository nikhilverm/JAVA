import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
       while (i<=n){
        int j=1;
         while (j<=n){
             if(i==j || i+j-1==n){
                 System.out.print("*");
             }
             else{
                 System.out.print(" ");
             }
             j++;
         }
           i++;
           System.out.println();
       }
    }
}

Output :-n=9

*       *
 *     * 
  *   *  
   * *   
    *    
   * *   
  *   *  
 *     * 
*       *

