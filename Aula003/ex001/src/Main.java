public class Main {
    public static void main(String[] args) {
        // Conta com saldo inicial de 400 → cheque especial fixo de 50
        ContaBancaria conta1 = new ContaBancaria(400);
        conta1.consultarSaldo();            // 400
        conta1.consultarChequeEspecial();   // 50
        System.out.println("Usando cheque especial? " + conta1.usandoChequeEspecial());

        conta1.sacarDinheiro(430); // deve usar R$30 do cheque especial
        conta1.consultarSaldo();   // saldo deve ser -30
        System.out.println("Usando cheque especial? " + conta1.usandoChequeEspecial());

        conta1.depositarDinheiro(100); // deve descontar 20% sobre 30 = 6 de taxa
        conta1.consultarSaldo();       // saldo = -30 + (100 - 6) = 64

        conta1.pagarBoleto(50);  // paga normalmente
        conta1.consultarSaldo(); // saldo = 14

        System.out.println("--------------------------------------");

        // Conta com saldo inicial de 1000 → cheque especial = 500
        ContaBancaria conta2 = new ContaBancaria(1000);
        conta2.consultarSaldo();          // 1000
        conta2.consultarChequeEspecial(); // 500

        conta2.sacarDinheiro(1200); // deve sobrar -200
        conta2.consultarSaldo();
        System.out.println("Usando cheque especial? " + conta2.usandoChequeEspecial());

        conta2.depositarDinheiro(100); // taxa de 20% sobre 200 = 40
        conta2.consultarSaldo();       // -200 + (100 - 40) = -140

        conta2.depositarDinheiro(200); // taxa de 20% sobre 140 = 28
        conta2.consultarSaldo();       // -140 + (200 - 28) = 32
    }
}