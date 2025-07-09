public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int divide(int a, int b) {
        
        
         if (b!= 0)
          {
            throw new ArithmeticException("Division by zero is not allowed.");
          }else
          {
            return a / b;
          }
         
        
        
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Division: " + calculator.divide(6,0));
        System.out.println("Addition: " + calculator.add(5, 3));
        System.out.println("Subtraction: " + calculator.subtract(5, 3));
    
    }
    
}
    
    

