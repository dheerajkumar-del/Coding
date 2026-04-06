import java.util.Scanner; 
 
public class SimpleCalculator1 { 
   public static void main(String[] args) { 
       Scanner sc = new Scanner(System.in); 
 
       System.out.print("Enter two numbers: "); 
       int num1 = sc.nextInt(); 
       int num2 = sc.nextInt(); 
 
       System.out.print("Enter operator (+,-,*,/): "); 
       char op = sc.next().charAt(0); 
 
       switch (op) { 
           case '+': System.out.println(num1 + num2); break; 
           case '-': System.out.println(num1 - num2); break; 
           case '*': System.out.println(num1 * num2); break; 
           case '/': 
               if (num2 != 0) 
                   System.out.println(num1 / num2); 
               else 
                   System.out.println("Divide by zero!"); 
               break; 
           default: System.out.println("Invalid Operator!"); 
       } 
   } 
} 
