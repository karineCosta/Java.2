import java.util.HashMap;
import java.util.Scanner;

public class questao3 {
    private static final HashMap<Character, String> morseCodeMap = new HashMap<>();
    private static final HashMap<String, Character> reverseMorseCodeMap = new HashMap<>();

    static {
        morseCodeMap.put('A', ".-"); morseCodeMap.put('B', "-..."); morseCodeMap.put('C', "-.-.");
        morseCodeMap.put('D', "-.."); morseCodeMap.put('E', "."); morseCodeMap.put('F', "..-.");
        morseCodeMap.put('G', "--."); morseCodeMap.put('H', "...."); morseCodeMap.put('I', "..");
        morseCodeMap.put('J', ".---"); morseCodeMap.put('K', "-.-"); morseCodeMap.put('L', ".-..");
        morseCodeMap.put('M', "--"); morseCodeMap.put('N', "-."); morseCodeMap.put('O', "---");
        morseCodeMap.put('P', ".--."); morseCodeMap.put('Q', "--.-"); morseCodeMap.put('R', ".-.");
        morseCodeMap.put('S', "..."); morseCodeMap.put('T', "-"); morseCodeMap.put('U', "..-");
        morseCodeMap.put('V', "...-"); morseCodeMap.put('W', ".--"); morseCodeMap.put('X', "-..-");
        morseCodeMap.put('Y', "-.--"); morseCodeMap.put('Z', "--..");
        morseCodeMap.put('0', "-----"); morseCodeMap.put('1', ".----"); morseCodeMap.put('2', "..---");
        morseCodeMap.put('3', "...--"); morseCodeMap.put('4', "....-"); morseCodeMap.put('5', ".....");
        morseCodeMap.put('6', "-...."); morseCodeMap.put('7', "--..."); morseCodeMap.put('8', "---..");
        morseCodeMap.put('9', "----."); morseCodeMap.put(' ', "/");
        
        for (char key : morseCodeMap.keySet()) {
            reverseMorseCodeMap.put(morseCodeMap.get(key), key);
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite 1 para converter texto em código Morse ou 2 para converter código Morse em texto: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> {
                    System.out.print("Digite um texto para converter em código Morse: ");
                    String input = scanner.nextLine().toUpperCase();
                    StringBuilder morseCode = new StringBuilder();

                    for (char c : input.toCharArray()) {
                        String morseChar = morseCodeMap.get(c);
                        if (morseChar != null) {
                            morseCode.append(morseChar).append(" ");
                        }
                    }
                    System.out.println("Código Morse: " + morseCode.toString().trim());
                }
                case 2 -> {
                    System.out.print("Digite um código Morse para converter em texto (separe letras com espaço e palavras com '/'): ");
                    String input = scanner.nextLine();
                    StringBuilder decodedText = new StringBuilder();

                    for (String morseChar : input.split(" ")) {
                        if (morseChar.equals("/")) {
                            decodedText.append(" ");
                        } else {
                            Character letter = reverseMorseCodeMap.get(morseChar);
                            if (letter != null) {
                                decodedText.append(letter);
                            }
                        }
                    }
                    System.out.println("Texto decodificado: " + decodedText.toString());
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }
}
