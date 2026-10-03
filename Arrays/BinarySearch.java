public class BinarySearch {
  public static void main(String[] args) {
    int arr[]={2,5,7,34,45,56,59,77,88,99};
    int num=binary(arr, 65);
    if(num==0){
      System.out.println("the number is not found in the array");
    }else{
      System.out.println("the key is found");
    }
  }
    public static int binary(int arr[],int key){
     int start=0,end=arr.length-1;
     while(start<=end){
      int mid=(start+end)/2;
      if(arr[mid]==key){
        return arr[mid];
      }
      if(arr[mid]<key){
        start=mid+1;
      }else{
        end=mid-1;
      }
     }

      return 0;
    }
}
