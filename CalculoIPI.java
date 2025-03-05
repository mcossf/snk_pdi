import java.util.Scanner;

public class CalculoIPI {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Informe a porcentagem do IPI a ser acrescido: ");
    double ipi = scanner.nextDouble();
    
    System.out.print("Informe o código da peça 1: ");
    int codigoPeca1 = scanner.nextInt();
    System.out.print("Informe o valor unitário da peça 1: ");
    double valorUnitarioPeca1 = scanner.nextDouble();
    System.out.print("Informe a quantidade de peças 1: ");
    int quantidadePeca1 = scanner.nextInt();
    
    System.out.print("Informe o código da peça 2: ");
    int codigoPeca2 = scanner.nextInt();
    System.out.print("Informe o valor unitário da peça 2: ");
    double valorUnitarioPeca2 = scanner.nextDouble();
    System.out.print("Informe a quantidade de peças 2: ");
    int quantidadePeca2 = scanner.nextInt();
    
    double valorTotalSemIPI = (valorUnitarioPeca1 * quantidadePeca1) + (valorUnitarioPeca2 * quantidadePeca2);
    
    double valorTotalComIPI = valorTotalSemIPI * (ipi / 100 + 1);
    
    System.out.printf("Valor total a ser pago (com IPI de %.2f%%): R$ %.2f%n", ipi, valorTotalComIPI);
    
    scanner.close();
}
}