public class PalindromNum {
  public static void main(String[] args) {
    System.out.println((132*10)+5);
    System.out.println(isPalindrom(123321)); 
  }
  public static boolean isPalindrom(int num){
     int reversedNum=0;
     int newNum=num;

     while(num>0){
    int  lastDigit=num%10;
       reversedNum=(reversedNum*10)+lastDigit;
      num=num/10;
     }
    return newNum==reversedNum;

   

  }
}
