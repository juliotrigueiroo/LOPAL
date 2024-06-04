import java.util.Scanner;

public class mainnn {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
      
        System.out.println("escreva sua nota:");
        int nota = leia.nextInt();

        if (nota >= 90 && nota <= 100) {
            System.out.println("voce tirou A");}
            
            
        else if (nota < 89 && nota >= 80){
            System.out.println("voce tirou B:");}
            
        else if (nota < 79 && nota >=70){
            System.out.println("voce tirou C:"); }
            
        else if (nota < 69 && nota >= 60){
            System.out.println("voce tirou D:");}
            
        else if (nota < 59 && nota >= 0){
            System.out.println("voce tirou E:"); }   
        
        else {
            System.out.println("opção invalida:");}
            
            
        
        }    
        
      }    
    
    
