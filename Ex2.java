import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // notas disponíveis
        int[] notas = {50, 20, 10, 5, 2, 1};
        
        System.out.println("Bem-vindo à Máquina de Venda Automática!");
        
        // pede o valor da compra
        System.out.print("Insira o valor da compra: ");
        int valorCompra = scanner.nextInt();
        
        // pede o valor pago
        System.out.print("Insira o valor pago: ");
        int valorPago = scanner.nextInt();
        
        // calcula o troco
        int troco = valorPago - valorCompra;
        
        if (troco < 0) {
            System.out.println("Quantia paga é insuficiente para realizar a compra.");
        } else {
            System.out.println("O troco é:");
            for (int nota : notas) {
                int quantidadeNotas = troco / nota;
                if (quantidadeNotas > 0) {
                    System.out.println(quantidadeNotas + " nota(s) de R$" + nota);
                    troco %= nota; // Atualiza o valor do troco
                }
            }
        }
        
        scanner.close();
    }
}

