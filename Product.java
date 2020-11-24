import java.util.Scanner;
class Product {
    public static void main(String[] args) {
        System.out.println("Product");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = a*b;
        System.out.println("prod = " + prod);
    }
    
}