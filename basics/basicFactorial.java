
import java.util.Scanner;

class BasicFactorial{

  public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    System.out.print("Enter the number to find the factorial: ");
    int num=input.nextInt();
    System.out.println("the factorial of "+num+" is "+factorial(num));

  }
  public static int factorial(int num){
    int factorial=1;
    for (int i = 1; i <= num; i++) {
        factorial=factorial*i;
    }
    return factorial;
  }
}