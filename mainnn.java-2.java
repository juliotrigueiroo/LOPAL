import java.util.Scanner;

public class mainnn {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int[] numeros = new int[10];

        System.out.println("Informe 10 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = entrada.nextInt();
        }
        
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        System.out.println("A soma dos elementos do vetor é: " + soma);
    }
}