import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // pede dois números
        System.out.println("Digite o primeiro número:");
        double numero1 = scanner.nextDouble();
        System.out.println("Digite o segundo número:");
        double numero2 = scanner.nextDouble();
        System.out.println("Digite o símbolo da operação (+, -, *, / ou ^):");
        char operacao = scanner.next().charAt(0);
        
        // faz a operação
        double resultado = 0;
        switch (operacao) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Erro: divisão por zero.");
                }
                break;
            case '^':
                resultado = Math.pow(numero1, numero2);
                break;
            default:
                System.out.println("Erro: símbolo da operação inválido.");
                    }
        
        System.out.println("O resultado da operação é: " + resultado);
        
        scanner.close();
    }
}
