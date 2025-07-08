import java.util.Scanner;

public class e_dec_to_bin {

    public static int dec_to_bin(int dec) {
        int bin=0;
        int c=0;
        while(dec!=0){
            int rem = dec%2;
            bin = bin + (rem * (int)Math.pow(10, c));
            c++;
            dec=dec/2;
        }

        return bin;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number : ");
        int dec = sc.nextInt();
        System.out.println("Binary of "+ dec + " is : " + dec_to_bin(dec));
        sc.close();
    }
}
