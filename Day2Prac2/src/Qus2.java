import java.util.Scanner;
//Take name as input and print a greeting message for that particular name.
public class Qus2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = inp.nextLine();
        System.out.println("Hello Mr." +name);
    }
}
