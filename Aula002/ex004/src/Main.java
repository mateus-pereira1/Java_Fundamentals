import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número inicial:");
        int numeroInicial = teclado.nextInt();
        int numero;
        int resto;

        while (true) {
            System.out.println("Digite um número:");
            numero = teclado.nextInt();

            if (numero < numeroInicial) {
                System.out.println("Número ignorado (menor que o inicial).");
                continue; // volta para o início do loop sem verificar o resto
            }

            resto = numero % numeroInicial;

            if (resto == 0) {
                System.out.println("Resto igual a 0 → número divisível.");
            } else {
                System.out.println("Resto diferente de 0 → fim da execução.");
                break; // encerra o programa
            }
        }
    }
}
