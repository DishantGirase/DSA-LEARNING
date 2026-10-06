public class PairsInArray {
  public static void main(String[] args) {
    int arr[]={2,34,32,24,545,22};

    for (int i= 0; i < arr.length; i++) {
     for (int j = 0; j < arr.length; j++) {
         if(j>i){
          System.out.printf("(%d,%d)",arr[i],arr[j]);
         }
     }
    }
  }
}
