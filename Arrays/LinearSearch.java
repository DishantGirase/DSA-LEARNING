
public class LinearSearch {
  public static void main(String[] args) {
    int arr[]={1,234,456,768,445,34};
    findElement(arr, 445);
    
  }
  public static void findElement(int arr[],int key){
    for(int i=0;i<arr.length;i++){
      if(arr[i]==key){
        System.out.print("the key "+key +"is found in array at the place "+i);
        break;
      }
    }
  }
}
