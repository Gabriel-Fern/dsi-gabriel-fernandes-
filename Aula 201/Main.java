public class Main {
    public static void main(String[] args){

        // Cria um novo objeto Usuario usando o construtor
        Usuario usuario1 = new Usuario("João", "joao@email.com", 37);

        // Exibe as informações do usuário 
        usuario1.exibirInfo();

        // Altera o nome usando o setter
        usuario1.setNome("João Siles");

        // Exibe novamente após alteração
        System.out.println("\nApós alteração de nome:");
        usuario1.exibirInfo();
        }
}

//Criar método para inserir os dados do usuário 
// Usando a classe Scanner