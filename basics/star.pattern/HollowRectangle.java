
import java.util.Scanner;
public class HollowRectangle {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);   
      System.out.print("enter the number: ");
      int num=input.nextInt();
      for(int i=1;i<=num-1;i++){
        for (int j=1;j<=num;j++){
          if(i==1||i==num-1||j==1||j==num){
            System.out.print("* ");
          }else{
            System.out.print("  ");
          }
        }
        System.out.println();
      }
    }
  
 
}
