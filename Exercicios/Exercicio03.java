import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        System.out.println("Insira o lado A do triângulo:");
        int a = myObj.nextInt();
        System.out.println("Insira o lado B do triângulo:");
        int b = myObj.nextInt();
        System.out.println("Insira o lado C do triângulo:");
        int c = myObj.nextInt();

        if (a < b) { int temp = a; a = b; b = temp; }
        if (a < c) { int temp = a; a = c; c = temp; }
        if (b < c) { int temp = b; b = c; c = temp; }

        if(a > b + c){
            System.out.println("Nenhum triângulo foi formado.");
        }
        if (a*a == b*b + c*c) {
            System.out.println("Um triângulo retângulo foi formado.");
        }
        if (a*a > b*b + c*c) {
            System.out.println("Um triângulo obtusângulo foi formado.");
        }
        if (a == b & b == c) {
            System.out.println("Um triângulo equilátero foi formado.");
        } else if (a == b || b == c || a == c) {
            System.out.println("Um triângulo isósceles foi formado");
            }
        
    }
}
