import java.util.Scanner;

/**
 *             1 2 3 4 5 
 *             1 2 3 4
 *             1 2 3
 *             1 2 
 *             1
 */

public class g_pattern {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n+1-i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
