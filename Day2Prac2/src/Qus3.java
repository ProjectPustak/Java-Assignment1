import java.util.Scanner;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public class Qus3 {
    public static void main(String[] args) {

        Scanner inp =  new Scanner(System.in);
        System.out.println("Enter the Principal");
        int p = inp.nextInt();

        System.out.println("Enter the Interest Rate");
        int r = inp.nextInt();

        System.out.println("Enter the Time in Year");
        int t = inp.nextInt();

        int si = (p*r*t)/100;

        System.out.println("The Simple Interst is:-"+si);


    }
}
