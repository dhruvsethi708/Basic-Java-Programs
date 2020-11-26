import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter first Number");
     int a = sc.nextInt();
     System.out.println("Enter second Number");
     int b = sc.nextInt();
     a = a + b;
     b = a - b;
     a = a - b;
     System.out.println("First no is " + a);   
     System.out.println("Second no is " + b);   
    }
}
