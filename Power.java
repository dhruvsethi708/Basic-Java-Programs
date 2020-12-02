import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base");
        int a = sc.nextInt();
        System.out.println("Enter power");
        int b = sc.nextInt();
        int temp = 1;
        for(int i=1;i<=b;i++) {
            temp = temp*a;
        }        
     System.out.println(temp);
    }
}
