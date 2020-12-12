import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=n-i+1; j++) {
                System.out.print("* ");
            }
            for(int j = 1; j<=2*i-1; j++) {
                System.out.print("  ");
            }
            for(int j = 1; j<=n-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        for(int i = 1; i<=2*n+1; i++) {
            System.out.print("  ");
        }
        System.out.println();

        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=i; j++) {
                System.out.print("* ");
            }
            for(int j = 1; j<=2*n+1-2*i; j++) {
                System.out.print("  ");
            }
            for(int j = 1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
