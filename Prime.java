import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number");
    int n = sc.nextInt();
    for(int i=2;i*i<=n;i++) {
        if(n%i==0) {
            System.out.println(n + " IS NOT PRIME");
            break;
        }
        else if(n<2) {
        System.out.println(n + " IS NOT PRIME");
        break;
    }
    else{
        System.out.println(n + " IS PRIME");
    }
    }    
    }
}
