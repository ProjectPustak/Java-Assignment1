import java.util.Scanner;
//To find out prime or not
public class Qus8 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = inp.nextInt();

        if (n <= 1) {
            System.out.println("Neither prime nor Composite");
            return;

        }
        int c = 2;
        if (n == 4) {
            System.out.println("Not Prime");
        } else {
            while (c * c < n) {
                if (n % c == 0) {
                    System.out.println("Not Prime");
                    return;
                }
                c = c + 1;
            }
            if (c * c > n) {
                System.out.println("Number is Prime..");
            }

        }
    }
}
