import java.util.Scanner;

public class Namegenerator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.next();
        System.out.println("Enter your gender: ");
        String gender=sc.next();
        System.out.println("Enter your qualification: ");
        String qualification=sc.next();
        if ("male".equalsIgnoreCase(gender)){
            System.out.println(" Mr. " + name + " qualification:" + qualification);

        }
        else if("female".equalsIgnoreCase(gender))
        {
            System.out.println(" Ms. " + name + " qualification:" + qualification);
        }
        else
         {
            System.out.println("invalid gender");
         }
    }
    
}
