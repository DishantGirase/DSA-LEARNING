
import java.util.Scanner;

public class BinToDec {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a binary number: ");
    int binNum=input.nextInt();
    binToDesNum(binNum);
  }
  public static void binToDesNum(int binNum){
   int pow=0;
   int desNum=0;

   while(binNum>0){
     int LastDig=binNum%10;
     desNum=desNum+(LastDig*(int)Math.pow(2, pow));
    binNum= binNum/10;
    pow++;
   }
    System.out.println("binary num to decimal is : "+desNum);
  }
}
