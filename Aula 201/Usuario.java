// Define a classe Usuario (modelo/objeto)
// Diagrama de classe -> nomeDaClasse / atributos/ Métodos(ações)

public class Usuario {
        
    //Atributos privados (encapsulamentos)
    private String nome;
    private String email;
    private int idade;

    //Construtor: chamado ao criar um novo usuário
    public Usuario(String nome, String email, int idade){
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    //Metodos getter e setter (permitem acessar e modificar os atributos com segurança)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int Idade) {
        this.idade = idade;
    }

    // Método personalizado para exibir para exibir informações do usuário
    public void exibirInfo() {
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Idade: " + getIdade());
    }
}
