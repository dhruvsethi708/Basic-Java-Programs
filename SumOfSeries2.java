import java.util.Scanner;
public class SumOfSeries2 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("ENTER NUMBER OF TERMS");
      int n = sc.nextInt();
      float temp = 0;
      for(float i=1;i<=n;i++) {
          if(i%2==0) {
            temp-=1/i;
          }
          else {
              temp+=1/i;
          }
      }
      System.out.println(temp);
    }
}
