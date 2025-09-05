import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite sua idade");
        int idade = teclado.nextInt();
        System.out.println("Digite a outra idade");
        int idade2 = teclado.nextInt();

        int diferenca = idade - idade2;

        System.out.printf("A diferença de idade dos dois é %s anos", diferenca);
    }
}