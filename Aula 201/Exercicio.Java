import java.util.Scanner;
public class Exercicio{
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        Usuario usuario2 = new Usuario();

        String nome, email;
        int idade;

        System.out.println("Defina seu usuário: ");
        String nome = user.nextLine();
        
        System.out.println("\nInsira seu Email: ");
        String email = user.nextLine();

        System.out.println("Insira sua idade: ");
        int idade = user.nextInt();

        Usuario usuario2 = new Usuario(nome, email, idade);

        usuario2.exibirInfo();
    }
}
