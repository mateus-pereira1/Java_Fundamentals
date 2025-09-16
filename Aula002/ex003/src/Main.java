import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int num1 = teclado.nextInt();
        System.out.println("Digite o segundo número");
        int num2 = teclado.nextInt();
        System.out.println("Você quer ver números pares ou ímpares ? (p/i)");
        String resp = teclado.next();

        float intervalo = 0;

        if (num1 >= num2){
            System.out.println("[ERROR] Digite o segundo número maior que o primeiro!");
        } else {
            for (int i = num1; i <= num2; i++){
                if (resp.equalsIgnoreCase("p")){
                    if ( i % 2 == 0){
                        System.out.println(i);
                    }
                } else if (resp.equalsIgnoreCase("i")) {
                    if (i % 2 > 0 ){
                        System.out.println(i);
                    }
                }

            }
        }

    }
}