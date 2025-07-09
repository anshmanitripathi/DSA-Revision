import java.util.Scanner;

/**
 *              *      *
 *              **    **
 *              ***  ***
 *              ********
 *              ***  ***
 *              **    **
 *              *      *   
 */


public class j_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //spaces
            for(int j=1; j<=(2*n - 2*i); j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i=n; i>=1; i--){
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //spaces
            for(int j=1; j<=(2*n - 2*i); j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}
