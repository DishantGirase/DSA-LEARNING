public class ReverseArr {
  public static void main(String[] args) {
    int arr[]={2,34,65,343,67,566,898,533,675};
reverse(arr);
   for(int i=0; i<arr.length;i++){
    System.out.print(" "+arr[i]);
   }
  }
  public static void reverse(int arr[]){
    int start=0,end=arr.length-1;
    while(start<end){
      int temp=arr[start];
      arr[start]=arr[end];
      arr[end]=temp;

      start++;
      end--;
    }
  }
}
