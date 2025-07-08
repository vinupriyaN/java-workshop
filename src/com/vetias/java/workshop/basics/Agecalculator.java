
import java.util.Scanner;

public class Agecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int currentYear =sc.nextInt();
        int birthYear = sc.nextInt(); 
        int age = currentYear - birthYear;
        System.out.println("Your age is: " + age);
    }
    
}
