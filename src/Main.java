import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to SumOfTwoNumbers!");
        System.out.print("Input two numbers: ");
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.printf("The sum of %d + %d is %d%n", a, b, a + b);
        } catch (Exception e) {
            System.out.println("Error in input. Please input 2 integers");
        }
    }
}