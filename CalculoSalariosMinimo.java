import java.util.Scanner;

public class CalculoSalariosMinimo {
    public static void main(String[] args) {
        final double salarioMinimo = 788.00;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe o valor do seu salário: ");
        double salarioUsuario = scanner.nextDouble();
        
        double quantidadeSalariosMinimos = salarioUsuario / salarioMinimo;
        
        System.out.printf("Você ganha aproximadamente %.2f salários mínimos.%n", quantidadeSalariosMinimos);
        
        scanner.close();
    }
}