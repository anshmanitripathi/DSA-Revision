import java.util.Scanner;

public class a_leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year : ");
        int y = sc.nextInt();

        boolean result = y%400 == 0 || y%4==0 && y%100!=0 ? true : false;

        System.out.println("Leap year : "+ result);
    }
}
