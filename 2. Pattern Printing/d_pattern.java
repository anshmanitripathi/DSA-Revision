// A 
// B c
// D E F
// G H I J

public class d_pattern {
    public static void main(String[] args) {
        char ch = 65;
        for(int i=0; i<4; i++){
            for(int j=0; j<=i; j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
