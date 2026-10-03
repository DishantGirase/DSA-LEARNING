
import java.util.Scanner;



public class InvertedHalfPyramid {
   public static void main(String[] args) {
   Scanner input = new Scanner(System.in); 
    System.out.print("enter the number: ");
    int num=input.nextInt();  
    PrintPattern(num);
   }
  public static void PrintPattern(int num){
    int last=num;
    for (int i = 1; i<=num; i++) {
        for (int j = 1; j <= num; j++) {
            if(j<last){
              System.out.print("  ");
            }else{
              System.out.print("* ");
            }
        }
        last--;
        System.out.println();
    }
  }
}
