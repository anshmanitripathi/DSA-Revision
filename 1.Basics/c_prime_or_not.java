import java.util.Scanner;

public class c_prime_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int m = 1;

        for(int i=1; i<= Math.sqrt(num); i++){
            if(num%i==0){
                m++;
            }
        }

        if(m==2){
            System.out.println("Prime ");
        }else{
            System.out.println("Not a Prime");
        }

    }
}
