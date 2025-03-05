import java.util.Scanner;

public class ReajusteSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe o saldo: ");
        double saldo = scanner.nextDouble();
        
        double saldoReajustado = saldo * 1.01;
        
        System.out.println("Saldo reajustado com acréscimo de 1%: " + saldoReajustado);
        
        scanner.close();
    }
}