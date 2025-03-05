import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
                System.out.print("Digite o ano: ");
                int ano = scanner.nextInt();
        
                System.out.print("Digite o mê: ");
                int mes = scanner.nextInt();
        
                System.out.print("Digite o dia: ");
                int dia = scanner.nextInt();
        
                int TotalDias = (ano * 365) + (mes * 30) + dia;
        
                System.out.println("São " + TotalDias + " dias.");
        
            scanner.close();
    }
}