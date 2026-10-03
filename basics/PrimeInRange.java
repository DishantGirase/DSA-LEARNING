
import java.util.Scanner;

public class PrimeInRange {
  public static void main(String[] args) {
    System.out.print("enter a number: ");
    Scanner input =new Scanner(System.in);
    int num=input.nextInt();
    primeNums(num);
    
  }
  public static boolean isPrime(int n){
for(int i=2;i<=Math.sqrt(n);i++){
  if(n==2){
    return true;
  }
  if( n%i==0){
   return false;
  }
}
return true;
}
  public static void primeNums(int n){
    for(int i=1;i<=n;i++){
      if(isPrime(i)){
        System.out.println(i);
      }
    }
  }
}
