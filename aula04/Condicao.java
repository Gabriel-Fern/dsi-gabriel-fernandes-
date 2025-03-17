import java.util.Scanner;

public class Condicao{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira dois números: ");

        int v1 = input.nextInt();
        int v2 = input.nextInt();
        
        if (v1 > v2) {
            System.out.println(v1 + " é maior que " + v2);
        } else if (v1 < v2) {
            System.out.println(v1 + "É menor que" + v2);
        }   else{
            System.out.println(v1 + " é igual a " + v2);
        }
    }
}