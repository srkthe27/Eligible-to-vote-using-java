import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter your age : ");
        byte age = scanner.nextByte();
        //boolean isEligible = (age>=18);
        //if (age>=18){
        //    System.out.println("You are eligible to vote");
        //}
        //else
        //    System.out.println("You are not eligible to vote");
        {
            //Using ternary operator
            String isEligible = (age>=18) ? "You are eligible to vote" : "You are not eligible to vote";
            System.out.println(isEligible);
        }
    }
}