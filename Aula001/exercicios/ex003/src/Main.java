import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o tamanho da base do retangulo");
        float lado = teclado.nextFloat();
        System.out.println("Digite o tamanho da altura do retangulo");
        float lado1 = teclado.nextFloat();

        float area = lado1 * lado;

        System.out.printf("A área do retangulo é %s m²", area);

    }
}