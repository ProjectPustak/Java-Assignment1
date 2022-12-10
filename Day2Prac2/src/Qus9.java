import java.util.Scanner;
//To find out whether the given String is Palindrome or not.
public class Qus9 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter The String:-");
        String s1 = inp.nextLine();

        StringBuffer sb = new StringBuffer(s1);

        String s2 = sb.reverse().toString();

        if(s1.equals(s2)){
            System.out.println("The String is Plindrome");
        }
        else{
            System.out.println("It is Not a Palindrome");
        }
    }
}
