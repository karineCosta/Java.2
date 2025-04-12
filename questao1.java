import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            int [] numeros = new int[5];
            int count = 0;

            while (count < 5) {
                System.out.print("Digite um número entre 10 e 100: ");
                int numero = scanner.nextInt();

                if (numero < 10 || numero > 100) {
                    System.out.println("Erro: o número deve estar entre 10 e 100.");
                    continue;

                }
                
                boolean duplicado = false;
                for (int i = 0; i < count; i++) {
                    if (numeros[i] == numero) {
                        duplicado = true;
                        break;
                    }
                }

                if (!duplicado) {
                    numeros [count] = numero;
                    count++;
                    System.out.print("Números únicos inseridos: ");
                    for (int i = 0; i < count; i++) {
                        System.out.print(numeros[i] + " ");
                    }
                    System.out.println();
                } else {
                    System.out.println("Número duplicado, não sera adicionado.");
                    
                }
            }
        }
    }
}