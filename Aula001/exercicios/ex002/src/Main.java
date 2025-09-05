import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o tamanho de um lado do quadrado");
        float lado = teclado.nextFloat();
        System.out.println("Digite o tamanho de um lado do quadrado");
        float lado1 = teclado.nextFloat();

        float area = lado1 * lado;

        System.out.printf("A área do quadrado é %s m²", area);

    }
}