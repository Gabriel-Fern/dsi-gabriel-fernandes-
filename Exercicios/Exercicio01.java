import java.util.Scanner;

public class Exercicio01{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        System.out.println("Insira o nome do funcionário, o número de horas trabalhadas, valor recebido por hora, número de filhos com menos de 14 anos, a idade, o tempo de serviço do funcionário e o valor do salario família por filho.");
        String nome_func = myObj.nextLine();
        
        System.out.println("Insira o número de horas trabalhadas por mês.");
        float horas_trabalhadas = myObj.nextFloat();
        
        System.out.println("Insisra o valor recebido por hora.");
        float valor_hora = myObj.nextFloat();
        
        System.out.println("Insira o número de filhos com menos de 14 anos deste funcionário");
        int filhos_menor = myObj.nextInt();
        
        System.out.println("Insira a idade do funcionário.");
        int idade_func = myObj.nextInt();
        
        System.out.println("Insira o tempo de serviço do funcionário em anos.");
        int tempo_servico = myObj.nextInt();
        
        System.out.println("Insira o valor do salário em família");
        int sal_familia = myObj.nextInt();
        
        float sal_bruto = (float) (valor_hora * horas_trabalhadas);
        float sal_liq = sal_bruto;
        
        if (sal_bruto > 1500){
            sal_liq = (-sal_bruto/100) * 15 + sal_bruto;
            System.out.println("Salário liquido:" + sal_liq);
        } else if (sal_bruto < 1500 & sal_bruto > 500){
            sal_liq = (-sal_bruto/100) * 8 + sal_bruto;
            System.out.println(sal_liq);
        }
        else {
            System.out.println("Salário líquido:" + sal_bruto);
        }
        float sal_liq_adic = sal_liq;
        
        if (idade_func > 40){
            sal_liq_adic =(float) sal_liq + (sal_bruto*0.02f);
            System.out.println("Salario liquido com ADIC:" + sal_liq_adic);
        }
        
        if (tempo_servico > 15){
            sal_liq_adic = sal_liq_adic + (sal_bruto*0.035f);
            System.out.println("Salario liquido com ADIC:"+ sal_liq_adic);
        }
    }
            
}
