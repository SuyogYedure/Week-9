import java.util.Scanner;
class LinearSearch {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the size of array");
    int size = s.nextInt();
    int arr[] = new int[size];
    System.out.println("Enter the elements of array");
    for (int i = 0; i < size; i++) {
      arr[i] = s.nextInt();
    }
    System.out.println("Enter the element to be searched");
    int key = s.nextInt();
    int count = 0;
    for (int i = 0; i < size; i++) {
      if (arr[i] == key) {
        count = 1;
        System.out.println("Yes it is found in index number " + i);
        break;
      }
    }
    if (count == 0) {
      System.out.println("Not Found");
    }
  }
}