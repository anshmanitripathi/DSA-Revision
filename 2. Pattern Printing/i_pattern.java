import java.util.Scanner;

/**
 *              1
 *              0 1
 *              1 0 1
 *              0 1 0 1
 *              1 0 1 0 1
 */


//  if (i+j)%2==0 --> 1


public class i_pattern {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i ; j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        sc.close();
     }
}
