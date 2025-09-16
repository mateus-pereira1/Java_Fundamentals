import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o seu peso");
        float peso = teclado.nextFloat();
        System.out.println("Digite sua altura");
        float altura = teclado.nextFloat();

        float imc = peso/(altura*altura);

        if (imc <= 18.5){
            System.out.println("Peso ideal");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Peso ideal");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Levmente acima do peso");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidade Grau II (Severa)");
        } else {
            System.out.println("Obesidade III (Mórbida)");
        }
    }
}