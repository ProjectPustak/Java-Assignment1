import java.util.Scanner;

//Write a program to print whether a number is even or odd, also take input from the user.
public class Qus1 {
    public static void main(String[] args) {

        Scanner inp  = new Scanner(System.in);
        System.out.println("Enter the First Number:-");
        int num = inp.nextInt();

        if(num%2==0){
            System.out.println("The Number is Even");
            return;
        }
        if (num%2==1){
            System.out.println("The Number is Odd");
            return;
        }
        else{
            System.out.println("The Number is Neither Odd nor Even");
        }


    }
}
