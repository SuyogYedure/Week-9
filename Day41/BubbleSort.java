import java.util.Scanner;
class BubbleSort{
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the size of array");
    int size = s.nextInt();
    int arr[] = new int[size];
    System.out.println("Enter the elements of array");
    for (int i = 0; i < size; i++) {
      arr[i] = s.nextInt();
    }
    System.out.println("Before Sorting ");
    for(int i=0;i<size;i++){
      System.out.println(arr[i]);
    }
    int temp=0;
    for(int i=0;i<size-1;i++){
      for(int j=i+1;j<size;j++){
        if(arr[i]>arr[j]){
          temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
      }
    }
    System.out.println("After Sorting ");
    for(int i=0;i<size;i++){
      System.out.println(arr[i]);
    }
  }
}