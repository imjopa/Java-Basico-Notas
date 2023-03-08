import java.util.Scanner;

public class Notes {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    


     double numeroa = 0;
     System.out.println("Digite sua nota: ");
     numeroa = scanner.nextDouble();

     double numerob = 0; 
     System.out.println("Digite sua segunda nota: ");
     numerob = scanner.nextDouble();

     double numeroc = 0;
     System.out.println("Digite sua terceira nota: ");
     numeroc = scanner.nextDouble();

     double soma = 0;
    soma = numeroa + numerob + numeroc;

    double media = 0;
    media = (numeroa + numerob + numeroc) / 3;

     System.out.println("A soma é: " + soma);
     System.out.println("A sua méida é: " + media);
     
     if( media > 6){
        System.out.println("aprovado");
     } else if (media == 6 ) {
      System.out.println("Prova de Recuperação");
   } else  {
      System.out.println("Reprovado");   
      
      scanner.close();
        }
     }

    
    
        
    
    }
    
