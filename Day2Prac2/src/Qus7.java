import java.util.Scanner;
//o calculate Fibonacci Series up to n numbers.
public class Qus7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n =sc.nextInt();

        int count =0,y=1,x=0;

        while (count<=n){
            System.out.println("The Fabinoci is:"+count);
            x=y;
            y=count;
            count=x+y;
        }

    }
}
