public class Main {
    public static void main(String[] args) {
        Carro chevette = new Carro();

        // Teste ligar/desligar
        chevette.ligarCarro();         // Deve imprimir "Ligando o Chevette"
        chevette.ligarCarro();         // Deve imprimir "Carro já está ligado"
        chevette.desligarCarro();      // Não deve desligar porque velocidade/marcha != 0
        chevette.ligarCarro();

        // Teste acelerar
        chevette.trocarMarcha();
        for (int i = 0; i < 25; i++){
            chevette.acelerar();
        }
        chevette.verificaVelocidade();
        System.out.println(chevette.getMarcha());
}}
