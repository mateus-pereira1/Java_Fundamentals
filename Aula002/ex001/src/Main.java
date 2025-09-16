import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int multiplicado = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número para tabuada");
        int mult = teclado.nextInt();

        for (int i = 0; i <= 10; i++){
            multiplicado = mult * i;
            System.out.printf("%s X %s = %s\n", mult, i, multiplicado);

        }
    }
}