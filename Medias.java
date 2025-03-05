public class Medias {
    public static void main(String[] args) {
        int[] numeros897 = {8, 9, 7};
        int[] numeros456 = {4, 5, 6};
        
        int soma1 = 0;
        for (int num : numeros897) {
            soma1 += num;
        }
        double media897 = (double) soma1 / numeros897.length;
        
        int soma2 = 0;
        for (int num : numeros456) {
            soma2 += num;
        }
        double media456 = (double) soma2 / numeros456.length;
        
        double somaDasMedias = media897 + media456;
        
        double mediaDasMedias = somaDasMedias / 2;
        
        System.out.println("A média dos números 8, 9 e 7 é " + media897);
        System.out.println("A média dos números 4, 5 e 6 é " + media456);
        System.out.println("A soma das médias é " + somaDasMedias);
        System.out.println("A média das médias é " + mediaDasMedias);
    }
}