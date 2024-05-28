
import java.util.Scanner;

public class Main {
    public static void Main(String[] args) {
        Scanner leia = new Scanner(System.in);
         
         
         System.out.println("escreva a altura: ");
         int altura  = leia.nextInt();
         
         System.out.println("escreva a largura: ");
         int largura = leia.nextInt();
         
         System.out.println("escreva a profundidade: ");
         int profundidade = leia.nextInt();
         
         int volume = altura * largura * profundidade;
         
         System.out.println("o volume é: " + volume);
         
    }
    
}
         
