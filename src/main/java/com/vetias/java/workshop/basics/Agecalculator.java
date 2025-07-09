
import java.time.LocalDate;
import java.util.Scanner;

public class Agecalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Date of birth(DD/MM/YY):");
        String dateofbirth=sc.nextLine();
        LocalDate birthdate = LocalDate.parse(dateofbirth);
        int yearofbirth = birthdate.getYear();
        int currentyear= LocalDate.now().getYear();
        int age = currentyear - yearofbirth;
        System.out.println("Your age is: " + age);
    
    }
    
}
