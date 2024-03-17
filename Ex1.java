import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
    
        // pedir os três números
        System.out.println("Digite o primeiro número:");
        Scanner scanner = new Scanner(System.in);
        double numero1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo número:");
        double numero2 = scanner.nextDouble();
        
        System.out.println("Digite o terceiro número:");
        double numero3 = scanner.nextDouble();

         // decidir o maior número
         double maior = numero1;
         if (numero2 > maior) {
             maior = numero2;
         }
         if (numero3 > maior) {
             maior = numero3;
         }
         
         // decidir o menor número
         double menor = numero1;
         if (numero2 < menor) {
             menor = numero2;
         }
         if (numero3 < menor) {
             menor = numero3;
         }
         
         // calcular a média
         double media = (numero1 + numero2 + numero3) / 3;
         
         // mostrar o resultado
         System.out.println("O maior número é: " + maior);
         System.out.println("O menor número é: " + menor);
         System.out.println("A média aritmética é: " + media);
         
         scanner.close();
    }
}
