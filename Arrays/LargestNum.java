public class LargestNum {
  public static void main(String[] args) {
    int arr[]={4,565,33,546,332,6,76,3435,66,};
    findLargest(arr);
  }
  public static void findLargest(int arr[]) {
      int largest=Integer.MIN_VALUE;
      for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
          largest=arr[i];
        }
      }
      System.out.println("largest is "+largest);
  }
}
