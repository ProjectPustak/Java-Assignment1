import java.util.Scanner;

public class Qus5 {
    public static void main(String[] args) {
        //Take 2 numbers as input and print the largest number.
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the first number:-");
        int num1 = inp.nextInt();

        System.out.println("Enter the Seconed number:-");
        int num2 = inp.nextInt();

        if(num1>num2){
            System.out.println("The First Number is Big");
        }
        else{
            System.out.println("The Seconed number is Big");
        }

    }
}
