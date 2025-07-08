import java.util.Scanner;

public class d_bin_to_dec {

    public static int bin_to_dec(int bin){
        int dec = 0;
        int c =0;
        while(bin!=0){
            int rem = bin%10;
            dec = dec + (rem * (int)Math.pow(2, c));
            bin = bin/10;
            c++;
        }

        return dec;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary number : ");
        int bin = sc.nextInt();
        System.out.println("Decimal of "+ bin + " is : " + bin_to_dec(bin));
        sc.close();
    }
}
