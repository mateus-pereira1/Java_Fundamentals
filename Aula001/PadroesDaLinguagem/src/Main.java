/*Serve para importar classes, interfaces
ou packeges que estão fora do pacote padrão, sendo que o asterisco serve para indicar
TODOS os arquivos do Java Util*/
import java.util.*;

/*Por padrão, classe começam com
letra maíscula, sendo em camal case
AssimEUmaClasse*/
public class Main {

    /*Por padrão, métodos começam com
letra minuscula, sendo em camal case
assimEUmMetodo*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, informe o seu nome ");
        String name = scanner.next();
        System.out.println("Olá, informe sua idade ");
        int age = scanner.nextInt();

        /*Java possuí uma tipagem estática, ou seja,
        * fica impossível alterar o tipo de uma variável,
        * sendo fortemente privado*/

        System.out.printf("Olá, %s! A sua idade é %s", name, age);

        /*Se usa Final para declarar uma variável*/
        final String resp = "Constante";


    }
}