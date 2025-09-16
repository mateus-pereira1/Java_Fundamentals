import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Informe seu nome");
        var name = scanner.next();
        System.out.println("Informe sua idade");
        var age = scanner.nextInt();
        System.out.println("Você é emancipado ?");

        //Equals é utilizado para comparar objetos, sendo que equals compara o valor presente no objeto. equalsIgnoreCase ignora se é uma reposta em letra maíscula ou mínuscula
        var empancipated = scanner.next().equalsIgnoreCase("s");

        if (age > 18){
            System.out.printf("%s, você tem %s anos e pode dirigir", name, age);
        } else if (age >= 16 && empancipated) {
            System.out.printf("%s, você tem %s anos e pode dirigir", name, age);
        } else {
            System.out.printf("%s, você tem %s anos e não pode dirigir", name, age);
        }
    }
}