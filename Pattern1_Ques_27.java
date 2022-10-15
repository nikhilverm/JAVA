public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=n;
        int p=1;
        int q=i*n+1;
        while (i>=1){
            int j=1;
            while (j<=2*n-2*i){
                System.out.print(" ");
                j++;
            }
            j=1;
            while (j<=i){
                System.out.print(p+" ");
                p++;
                j++;
            }
            j=1;
            while (j<=i){
                System.out.print(q+" ");
                j++;
                q++;
            }
            q=q+2-2*i-1;
            i--;
            System.out.println();
        }
    }
}

Output :-

1 2 3 4 17 18 19 20 
  5 6 7 14 15 16 
    8 9 12 13 
      10 11 
