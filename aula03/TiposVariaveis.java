import java.util.scanner;

public class TiposVariaveis {
  public static void main(String[] args) {
    int myNum = 89;               // integer (whole number)
    float myFloatNum = 54.54f;    // floating point number
    char myLetter = 'D';         // character
    boolean myBool = true;       // boolean
    String myText = "Hello";     // String    
    System.out.println(myNum);
    System.out.println(myFloatNum);
    System.out.println(myLetter);
    System.out.println(myBool);
    System.out.println(myText);

    String text1 = "Ark é bom?";
    boolean arkEhBom = false;
    String text = "Você é viciado?";
    boolean sim = true;

    System.out.println(text1 + arkEhBom);
    System.out.println(text + sim);

    String s1 = "Quantos itens vc vai comprar?";
    int items = 17;
    System.out.println(s1 + items);

    float itemcost = 2.50f;
    float totalpay = (float) items * itemcost;
    char currency = '$';
    String total = "Total a pagar:";

    System.out.println(total + totalpay + currency);

    float scientific = 10e3f;
    System.out.println(scientific);

  }
}
