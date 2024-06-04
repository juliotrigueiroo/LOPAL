import java.util.Scanner;

public class mainn {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.print("escreva a Base do triangulo: ");
         int Base  = leia.nextInt();
         
         System.out.print("escreva a Altura do triangulo: ");
         int Altura = leia.nextInt();
         
         int Areadotriangulo = (Base * Altura) /2; 
         System.out.println("a Área do triângulo é: " + Areadotriangulo);
         
    }
}