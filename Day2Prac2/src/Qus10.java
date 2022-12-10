import java.util.Scanner;
//To find Armstrong Number between two given number.
public class Qus10 {
    public static void main(String[] args) {
        Scanner inp =  new Scanner(System.in);
        System.out.println("Enter the Number:-");
        int num = inp.nextInt();

        int temp,r;
        int sum = 0;

        temp = num;

        while(num>0){
            r=num%10;
            sum = sum+(r*r*r);
            num = num/10;

        }
        if(temp==sum){
            System.out.println("It is a Armstrong Number");
        }
        else {
            System.out.println("It is not a Armstrong Number");
        }

    }
}
