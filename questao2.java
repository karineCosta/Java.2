import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Digite a quantidade: ");
                double quantidade = scanner.nextDouble();
                scanner.nextLine(); 
                
                System.out.print("Digite a unidade de origem: ");
                String origem = scanner.nextLine().toLowerCase();
                
                System.out.print("Digite a unidade de destino: ");
                String destino = scanner.nextLine().toLowerCase();
                
                double resultado = converter(quantidade, origem, destino);
                
                if (resultado == -1) {
                    System.out.println("Conversão inválida entre " + origem + " e " + destino + ".");
                } else {
                    System.out.printf("%.2f %s equivalem a %.2f %s.%n", quantidade, origem, resultado, destino);
                }
                
                System.out.print("Deseja fazer outra conversão? (s/n): ");
                String resposta = scanner.nextLine().toLowerCase();
                if (!resposta.equals("s")) {
                    break;
                }
            }
        }
    }
    
    public static double converter(double quantidade, String origem, String destino) {
        return switch (origem) {
            case "metros" -> destino.equals("polegadas") ? quantidade * 39.37 : -1;
            case "polegadas" -> destino.equals("metros") ? quantidade / 39.37 : -1;
            case "litros" -> destino.equals("quartos") ? quantidade * 1.057 : -1;
            case "quartos" -> destino.equals("litros") ? quantidade / 1.057 : -1;
            case "quilogramas" -> destino.equals("libras") ? quantidade * 2.205 : -1;
            case "libras" -> destino.equals("quilogramas") ? quantidade / 2.205 : -1;
            default -> -1;
        };
    }
}
