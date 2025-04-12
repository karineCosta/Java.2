import java.util.Arrays;
import java.util.Scanner;

public class questao5 {
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            
            
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { 
            System.out.print("Digite o tamanho do array: ");
            int tamanho = scanner.nextInt();
            
            int[] array = new int[tamanho];
            System.out.println("Digite os elementos do array:");
            for (int i = 0; i < tamanho; i++) {
                array[i] = scanner.nextInt();
            }
            
            bubbleSort(array);
            System.out.println("Array ordenado: " + Arrays.toString(array));
        } 
    }
}
