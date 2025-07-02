public class sumofmarks {
    public static void main(String[] args)
    {
        int[] marks = {85, 92, 78, 95, 88}; 
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        System.out.println("The sum of marks is: " + sum);
    } 
}
