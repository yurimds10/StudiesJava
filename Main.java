public class Main {
  public static void main(String[] args) {
    outputText();
    outputNumber();
  }

  // Text Method
  public static void outputText() {
    // Print a character
    System.out.print('A');   //
    System.out.println('C'); //

    // Print a string
    System.out.print("Print without new line!");
    System.out.print("\nPrint with new line\n");
    System.out.println("Print with new line");
  }

  // Number Method
  public static void outputNumber() {
    System.out.print(10);   // print without a new line
    System.out.println(10); // print with a new line

    System.out.print(13 + 10); // we can make math operations and print the result
  }
}
