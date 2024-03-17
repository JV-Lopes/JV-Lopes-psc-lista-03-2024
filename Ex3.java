import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // pede os coeficientes
        System.out.println("Digite os coeficientes da equação de segundo grau (ax^2 + bx + c = 0):");
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.print("c: ");
        double c = scanner.nextDouble();
        
        // verifica os coeficientes
        if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente.");
        } else if (a == 0 && b != 0) {
            System.out.println("Essa é uma equação de primeiro grau.");
            double raiz = -c / b;
            System.out.println("A raiz real da equação é: " + raiz);
        } else {
            // calcula o discriminante
            double delta = b * b - 4 * a * c;
            
            // verifica o valor do discriminante
            if (delta < 0) {
                System.out.println("Esta equação não possui raízes reais.");
            } else if (delta == 0) {
                System.out.println("Esta equação possui duas raízes reais iguais.");
                double raiz = -b / (2 * a);
                System.out.println("As raízes reais são: " + raiz + " e " + raiz);
            } else {
                System.out.println("Esta equação possui duas raízes reais diferentes.");
                double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("As raízes reais são: " + raiz1 + " e " + raiz2);
            }
        }
        
        scanner.close();
    }
}
