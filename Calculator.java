import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number");
    int a = sc.nextInt();   
    System.out.println("Select symbol (+,-,*,/)");
    String n = sc.next();
    System.out.println("Enter second number");   
    int b = sc.nextInt();   
    int res;
    switch(n)
    {
        case "+":res = a + b;
        System.out.println("ADDITION IS " + res);
        break;
        case "-":res = a - b;
        System.out.println("SUBTRACTION IS " + res);
        break;
        case "*":res = a * b;
        System.out.println("MULTIPLICATION IS " + res);
        break;
        case "/":res = a / b;
        System.out.println("DIVISION IS " + res);
        break;
        default:System.out.println("INVALID SYMBOL");
        break;    
    }
 }   
}
