public class Person {
    //Atributos
    public String name;
    public int age;

    //Métodos Especiais

    /*Usamos os métodos getters e setters por 3 motivos principais
    * Controle de acesso, validação de dados e proteção de objetos
    * Controle:Conseguimos alterar atributos privados
    * Validação:Podemos criar validações no setter para que
    * não seja usado valores incoerentes, como idade negativa
    * Proteção:Impede entrada de valores inválidos ao código
    * Flexibilidade:Se quisermos mudar a forma do atributo e como
    * ele é armaznado, não precisamos alterar o código que usa
    * a classe
    * Resumo:Usamos getters e setters para encapsular
    * atributos, controlando seu acesso e garantindo que os
    * valores atribuídos sejam válidos, protegendo a
    * integridade do objeto.*/

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

}
