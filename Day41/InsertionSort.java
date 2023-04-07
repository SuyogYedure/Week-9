class InsertionSort{
  public static void main(String args[]){
    int arr[] = {10,5,4,23,12,78,41};
    for(int i=0; i<arr.length;i++){
      int key = arr[i];
      int j = i - 1;
      
      while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = key;
    }
    System.out.println("Sorted array:");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
  }
 }
}
 

