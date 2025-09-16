public class ContaBancaria {
    //atributos
    private double saldo;
    private double chequeEspecial;
    private double limite;


    //Construtor
    public ContaBancaria(double saldo){
        this.saldo = saldo;
        if (saldo <= 500){
            this.chequeEspecial = 50;
        } else {
            this.chequeEspecial = this.saldo * 0.5;
        }
        this.limite = this.saldo + this.chequeEspecial;
    }

    //Métodos
    public void consultarSaldo(){
        System.out.println("Seu saldo atual é R$"+this.getSaldo());
    }

    public void consultarChequeEspecial(){
        System.out.println("Seu saldo de cheque especial é R$"+this.getChequeEspecial());
    }

    public void depositarDinheiro(double valor){
        if (this.getSaldo() < 0){
            double taxa = (this.getSaldo()*0.2)*(-1);
            this.setSaldo(getSaldo()+(valor-taxa));
            System.out.println("Seu dinheiro no valor de R$"+valor+" foi depositado desconto da taxa de cheque especial!");
        } else {
            System.out.println("Seu dinheiro no valor de R$"+valor+" foi depositado com sucesso!");
            this.setSaldo(this.getSaldo()+valor);
        }
    }

    public void sacarDinheiro(double valor){
        if (valor > this.getLimite()){
            System.out.println("[ERROR] Valor de saque maior que o limite da conta");
        } else{
            this.setSaldo(getSaldo()-valor);
            System.out.println("Valor sacado na quantia de R$"+valor+" saldo atual de R$"+getSaldo());
        }
    }

    public void pagarBoleto(double valor){
        if (valor > this.getLimite()){
            System.out.println("[ERROR] Valor do boleto maior que o limite da conta");
        } else{
            this.setSaldo(getSaldo()-valor);
            System.out.println("Você pagou um boleto na quantia de R$"+valor+" saldo atual de R$"+getSaldo());
        }
    }

    public boolean usandoChequeEspecial(){
        return this.getSaldo() < 0;
    }


    //Métodos Especiais
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public double getLimite() {
        return this.saldo + this.chequeEspecial;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
