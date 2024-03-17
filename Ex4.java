import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // pede operação e raio
        System.out.println("Digite o indicador de operação (1, 2 ou 3):");
        int operacao = scanner.nextInt();
        System.out.println("Digite o raio do círculo ou da esfera:");
        double raio = scanner.nextDouble();
        
        // lê e realiza a operação
        switch (operacao) {
            case 1:
                double perimetro = calcularPerimetro(raio);
                System.out.println("O perímetro do círculo é: " + perimetro);
                break;
            case 2:
                double area = calcularArea(raio);
                System.out.println("A área do círculo é: " + area);
                break;
            case 3:
                double volume = calcularVolumeEsfera(raio);
                System.out.println("O volume da esfera é: " + volume);
                break;
            default:
                System.out.println("Erro: código da operação inválido.");
        }
        
        scanner.close();
    }
    
    // fórmula perímetro
    public static double calcularPerimetro(double raio) {
        return 2 * Math.PI * raio;
    }
    
    // fórmula área
    public static double calcularArea(double raio) {
        return Math.PI * raio * raio;
    }
    
    // fórmula volume
    public static double calcularVolumeEsfera(double raio) {
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }
}
