import java.util.Scanner;

public class SimulacaoSaque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double saldoConta = 1000.00;
        
        System.out.print("Informe seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Informe o valor que deseja sacar: ");
        double valorSaque = scanner.nextDouble();
        
        String motivo = "";
        boolean saquePermitido = true;
        
            if (valorSaque > 1000.00) {
                motivo = "O valor máximo de saque é de R$ 1.000,00";
                saquePermitido = false;
            }
        
            else if (valorSaque < 10.00) {
                motivo = "O valor do saque mínimo é R$ 10,00";
                saquePermitido = false;
            }
            
            else if (valorSaque % 10 !=0) {
                motivo = "O caixa só possui cédulas de R$ 10, R$ 20, R$ 50 e R$ 100";
                saquePermitido = false;
            }
            
            else if (valorSaque > saldoConta) {
                motivo = "Saldo insuficiente";
                saquePermitido = false;
            }
            
        if (saquePermitido) {
            System.out.printf("Olá %s! O saque de R$ %.2f foi realizado com sucesso!%", nome, valorSaque);
            
                saldoConta -= valorSaque;
                System.out.printf("Saldo atual: R$ %.2f%n", saldoConta);
        } else {
            System.out.printf("Olá %s! O saque de R$ %.2f não pode ser realizado! Motivo: %s%n", nome, valorSaque, motivo);
        }
    scanner.close();
        
    }
}