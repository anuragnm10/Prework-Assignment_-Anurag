import java.util.Scanner;

public class MissingNumberFinder {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the value of N: ");
    int size = in.nextInt();
    System.out.println("Enter the numbers : ");
    int[] arr = new int[size-1];
    for(int i=0;i<size-1;i++){
      arr[i]=in.nextInt();
    }
    MissingNumberFinder obj1 = new MissingNumberFinder();
    System.out.println("Missing Number is : "+obj1.missingNumberFinder(arr, size));
  }
  int initial;
  public int missingNumberFinder(int[] arr, int size) {
    initial = arr[0];
    int missingNo = 0; 
    for(int num : arr){
      if(num == ++initial){
        missingNo = size;
      }else {
        missingNo = initial;
        break;
      }
      
    }
    return missingNo;

  }
}
