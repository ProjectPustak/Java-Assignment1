import java.util.Scanner;

//Input currency in rupees and output in USD.
public class Qus6 {
    public static void main(String[] args) {
        //To calculate Fibonacci Series up to n numbers.
        Scanner inp =  new Scanner(System.in);
        System.out.println("Enter the Amount in Rupee");
        int rupee = inp.nextInt();

        //Here i am Doing Type Casting Other result will come in a bad digit.
        float usd =(float) rupee*0.012f;
        System.out.println("The Amount in USD Is:-"+usd);
    }
}
