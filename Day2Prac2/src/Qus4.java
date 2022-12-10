import java.util.Scanner;
//ake in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class Qus4 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the first Number:");

        int num1 = inp.nextInt();

        System.out.println("Enter the Secoend Number:-");

        int num2 = inp.nextInt();

        System.out.println("Enter Your Choise:-");
        int c1 = inp.nextInt();

        if(c1==1){
            int result = num1+num2;
            System.out.println("The Sum Of the Two Number is:-"+result);
            return;
        } else if (c1==2) {
            int result2 = num1-num2;
            System.out.println("The Substraction of the Two numbe is"+result2);
            return;
        } else if (c1==3) {
            int result3 = num1*num2;
            System.out.println("The Multiplication of the Two numbe is"+result3);
            return;
        }
        else{
            int result4 = num1/num2;
            System.out.println("The Devide of the Two number is"+result4);
        }
        System.out.println("Thank You!!!");


    }
}
