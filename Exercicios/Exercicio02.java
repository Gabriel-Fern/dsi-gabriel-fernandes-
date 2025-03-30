import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int masculino = 0;
        int feminino = 1;
        System.out.println("Selecione seu genêro:\n" + "Masculino:0 \n" + "Feminino:1");
        int genero = myObj.nextInt();

        System.out.println("Insira o seu salário:");
        float sal = myObj.nextFloat();

        System.out.println("Insira seu tempo na empresa");
        int tempo = myObj.nextInt();
     


        if (genero == 0 & tempo > 15) {
            sal = sal * 0.20f + sal;
            String sexo = "Masculino";
            System.out.println("Gênero:"+ sexo + "\n"
            + "Tempo na empresa:"+ tempo + "\n" + "Seu salário atual é "+ sal);
        }

        if (genero == 1 & tempo > 10) {
            String sexo = "Feminino";
            sal = sal * 0.25f + sal;
            System.out.println("Gênero:"+ sexo + "\n"
            + "Tempo na empresa:"+ tempo + "\n" + "Seu salário atual é "+ sal);
        }
        if ( genero == 1 & tempo < 10){
            String sexo = "Feminino";
            System.out.println("Gênero:"+ sexo + "\n"
            + "Tempo na empresa:"+ tempo + "\n" + "Seu salário atual é "+ sal);
        }


    }
}
