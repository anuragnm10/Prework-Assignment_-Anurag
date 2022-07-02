import java.util.Scanner;

public class PatternPrinter {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in .nextInt();
    patternPrinter(n);

  }

  public static void patternPrinter(int n){
    System.out.println("Pattern :");
    int m=n;
    for(int i=1;i<=n;i++){      
      for(int j=n;j>=1;j--){
        for(int k=0;k<m;k++){
          System.out.print(j);
          if(j==1 && k==m-1)
            System.out.println();
        }
      
      }
      m--;
    }
  }
}
