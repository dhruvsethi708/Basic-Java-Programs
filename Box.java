import java.util.Scanner;
class Box {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Side");
       int n = sc.nextInt();
       for(int i = 1; i<=n; i++) {
       for(int j = 1; j<=n; j++) {
        System.out.print("* ");
       }
       System.out.println();
       }
   }
}