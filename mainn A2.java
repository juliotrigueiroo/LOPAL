import java.util.Scanner;

public class mainn {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("escreva o primeiro numero:");
        int num1 = leia.nextInt();

        System.out.println("escreva o segundo numero:");
        int num2 = leia.nextInt();

        if (num1 > num2) {
            System.out.println("o numero maior é:"+ num1);}
            
            
        else {
            System.out.println("o numero maior é:"+ num2);
            
        
        }    
            
            
           
        }
    }
