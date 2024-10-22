public class DataTypes {
  public static void datatypeLesson() {
    // Texts
    char character = 'A'; // stores a single character or ASCII values
    char characterNumber = 1;        // 1 represents A character
    String str = "This is a string"; // string (array of characters)
    
    System.out.println(character);
    System.out.println(characterNumber);
    System.out.println(str);

    boolean bool = true; // (1 bit) // stores true or false values
    
    // Numbers
    
    // Integer Type

    byte byteNum = -128; // (1 byte) -128 to 127
    short shortNum = 10; // (2 bytes) -32,768 to 32,767
    int intNum = -2123; // (4 bytes) -2,147,483,648 to 2,147,483,647
    long longNum = 5789034257L; // (8 bytes) -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

    System.out.println(byteNum);
    System.out.println(shortNum);
    System.out.println(intNum);
    System.out.println(longNum);
    
    // Floating Types

    float floatNum = 2.34f; // (4 bytes) stores 6 to 7 decimal digits
    double doubleNum = 23.234554325d; // stores 15 decimal digits

    System.out.println(floatNum);
    System.out.println(doubleNum);
 
    // Scientific Numbers
    float f1 = 35e3f;
    double d1 = 12E4d;

    System.out.println(f1);
    System.out.println(d1);
  }

  public static void calculatePrice(int items, float cost) {
    char currency = '$';
    float totalCost = items * cost;

    System.out.println("Number of items: " + items);
    System.out.println("Cost per item: " + cost + currency);
    System.out.println("Total cost: " + totalCost + currency);
  }
}
