import java.util.Scanner;
class Table{
public static void main(String[] args) {
   Scanner var = new Scanner(System.in);
   System.out.println("Enter number");
   int n =  var.nextInt();
   for(int i=1;i<=10;i++) {
      int variable = n*i; 
      System.out.println(variable);
      }
   } 
}