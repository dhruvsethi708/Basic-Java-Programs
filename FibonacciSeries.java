import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        int c = 0;
        for(int i = 1;i<=n;i++) {
            c=a+b;
            System.out.print(c + " ");
            a=b;
            b=c;
        }
    }
}
