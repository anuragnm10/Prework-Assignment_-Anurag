import java.util.Scanner;

public class FirstLetterPrinter {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter your String: ");
    String input = in.nextLine();
    FirstLetterPrinter obj1 = new FirstLetterPrinter();
    System.out.println(obj1.firstLetterPrinter(input));
  }

  public String firstLetterPrinter(String str){
    String result = "";
    String[] str1 = str.split(" ");
    for(String word : str1){
      char letter = word.charAt(0);
      result = result+letter;
    }

    return result;
  }
  
}