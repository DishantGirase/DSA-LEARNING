import java.util.Scanner;

public class DesToBin {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a Decimal number: ");
    int decNum=input.nextInt();
    // System.out.println(7%2);
    DecToBin(decNum);
  }
  public static void DecToBin(int decNum){
    int pow =0;
    int binNum=0;
    while(decNum>0){
      int rem=decNum%2;
      binNum=binNum+(rem*((int)Math.pow(10, pow)));
      pow++;
      decNum=decNum/2;
    }
    System.out.println("binary number is: "+binNum);
  }
}
