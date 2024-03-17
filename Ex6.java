import java.util.Random;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // pede dois números
        System.out.println("Digite o primeiro número inteiro:");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número inteiro:");
        int numero2 = scanner.nextInt();
        
        // decide o maior e o menor
        int menorNumero = Math.min(numero1, numero2);
        int maiorNumero = Math.max(numero1, numero2);
        
        // gera um número entre o intervalo dos dois
        Random random = new Random();
        int numeroSorteado = random.nextInt(maiorNumero - menorNumero + 1) + menorNumero;
        
        // verifica se é ímpar ou par
        System.out.println("O número sorteado é: " + numeroSorteado);
        if (numeroSorteado % 2 == 0) {
            System.out.println("É um número par.");
        } else {
            System.out.println("É um número ímpar.");
        }
        
        scanner.close();
    }
}
