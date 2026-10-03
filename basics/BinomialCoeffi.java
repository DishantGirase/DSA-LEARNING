import java.util.Scanner;

public class BinomialCoeffi {
   public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    System.out.print("Enter the number n: ");
    int n=input.nextInt();
     System.out.print("Enter the number r: ");
    int r=input.nextInt();
    // int nMinusrR= (int)factorial((n-r));
 int coeFiccient=coefficient(factorial(r), factorial(n),factorial((n-r)));
System.out.println(coeFiccient);
  }
  public static int coefficient( int rFact,int nFact,int nMinusRFact){
    return nFact/(rFact*nMinusRFact);
  }
  public static int factorial(int num){
    int factorial=1;
    for (int i = 1; i <= num; i++) {
        factorial=factorial*i;
    }
    return factorial;
  }
}
