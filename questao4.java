import java.util.HashSet;
import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();
            
            if (ehPrimo(numero)) {
                System.out.println(numero + " é um número primo.");
            } else {
                System.out.print("Os fatores primos exclusivos de " + numero + " são: ");
                for (int fator : fatoresPrimos(numero)) {
                    System.out.print(fator + " ");
                }
                System.out.println();
            }
        }
    }
    
    private static boolean ehPrimo(int numero) {
        if (numero < 2) return false;
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }
    
    private static HashSet<Integer> fatoresPrimos(int numero) {
        HashSet<Integer> fatores = new HashSet<>();
        for (int i = 2; i <= numero; i++) {
            while (numero % i == 0) {
                fatores.add(i);
                numero /= i;
            }
        }
        return fatores;
    }
}
