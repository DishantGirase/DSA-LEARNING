import java.util.Scanner;

public class ButterflyPattern {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);   
      System.out.print("enter the number: ");
      int num=input.nextInt();
      upperSide(num);
      lowerSide(num);
  }
  public static void upperSide(int num){
    for(int i=1;i<=num/2;i++){
      for(int j=1;j<=num;j++){
        if(j<=i || j>num-i){
          System.out.print("* ");
        }else{
          System.out.print("  ");
        }
      }
    System.out.println("");
    }
  }
  public static void lowerSide(int num){
     for(int i=num/2;i>=1;i--){
      for(int j=num;j>=1;j--){ 
        if(j<i || j<=num-i){
          System.out.print("* ");
        }else{
          System.out.print("  ");
        }
      }
    System.out.println("");
    }
}
}
