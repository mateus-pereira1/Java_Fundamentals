public class Carro {
    //Atributos
    private boolean ligado;
    private int velocidade;
    private int marcha;

    //Construtor
    public Carro() {
        this.ligado = false;
        this.velocidade = 0;
        this.marcha = 0;
    }

    //Métodos
    public void ligarCarro() {
        if (this.isLigado() == false) {
            this.setLigado(true);
            System.out.println("Ligando o Chevette");
        } else {
            System.out.println("Carro já está ligado");
        }
    }

    public void desligarCarro() {
        if (this.isLigado() == true && this.getMarcha() == 0 && this.getVelocidade() == 0) {
            this.setLigado(false);
            System.out.println("Desligando o Chevette");
        } else {
            System.out.println("Não é possível desligar: o carro precisa estar em ponto morto e velocidade 0");
        }
    }

    public void acelerar() {
        if (this.isLigado() == false) {
            System.out.println("Chevette desligado");
        } else {
            if (this.getVelocidade() < 120) {
                if (this.getMarcha() == 0){
                    System.out.println("Carro em ponto morto, não pode acelerar!");
                } else if (getMarcha() == 1 && getVelocidade() >= 0 && getVelocidade() < 20) {
                    this.setVelocidade(this.getVelocidade()+1);
                    System.out.println("Acelerando carro");
                } else if (getMarcha() == 2 && getVelocidade() >= 21 && getVelocidade() < 40) {
                    this.setVelocidade(this.getVelocidade()+1);
                    System.out.println("Acelerando carro");
                } else if (getMarcha() == 3 && getVelocidade() >= 41 && getVelocidade() < 60) {
                    this.setVelocidade(this.getVelocidade()+1);
                    System.out.println("Acelerando carro");
                } else if (getMarcha() == 4 && getVelocidade() >= 61 && getVelocidade() < 80) {
                    this.setVelocidade(this.getVelocidade()+1);
                    System.out.println("Acelerando carro");
                } else if (getMarcha() == 5 && getVelocidade() >= 81 && getVelocidade() < 100) {
                    this.setVelocidade(this.getVelocidade()+1);
                    System.out.println("Acelerando carro");
                } else if (getMarcha() == 6 && getVelocidade() >= 101 && getVelocidade() < 120) {
                    this.setVelocidade(this.getVelocidade()+1);
                    System.out.println("Acelerando carro");
                } else {
                    System.out.println("Carro em velocidade máxima!");
                }
            } else {
                System.out.println("Carro em velocidade máxima!");
            }
        }
    }

    public void diminuirVelocidade(){
        if (this.isLigado() == false){
            System.out.println("Carro desligado. Impossível freiar");
        } else {
                if (this.getVelocidade() > 0){
                    if (this.getMarcha() == 0){
                        System.out.println("Carro em ponto morto, não pode freiar!");
                    } else if (getMarcha() == 1 && getVelocidade() >= 0 && getVelocidade() < 20) {
                        this.setVelocidade(this.getVelocidade()-1);
                        System.out.println("Freiando o carro");
                    } else if (getMarcha() == 2 && getVelocidade() >= 21 && getVelocidade() < 40) {
                        this.setVelocidade(this.getVelocidade()-1);
                        System.out.println("Freiando o carro");
                    } else if (getMarcha() == 3 && getVelocidade() >= 41 && getVelocidade() < 60) {
                        this.setVelocidade(this.getVelocidade()-1);
                        System.out.println("Freiando o carro");
                    } else if (getMarcha() == 4 && getVelocidade() >= 61 && getVelocidade() < 80) {
                        this.setVelocidade(this.getVelocidade()-1);
                        System.out.println("Freiando o carro");
                    } else if (getMarcha() == 5 && getVelocidade() >= 81 && getVelocidade() < 100) {
                        this.setVelocidade(this.getVelocidade()-1);
                        System.out.println("Freiando o carro");
                    } else if (getMarcha() == 6 && getVelocidade() >= 101 && getVelocidade() < 120) {
                        this.setVelocidade(this.getVelocidade()-1);
                        System.out.println("Freiando o carro");
                    } else {
                        System.out.println("Carro parado");
                    }
        } else{
                System.out.println("Carro em neutro");
            }
        }
    }

    public void trocarMarcha(){
        if (this.getMarcha() < 0 || this.getMarcha() > 6 || isLigado() == false){
            System.out.println("Impossível trocar a marcha");
        } else {
            if (this.getVelocidade() >= 0 && this.getVelocidade() <= 20){
                this.setMarcha(1);
                System.out.println("Marcha Atual "+this.getMarcha());
            } else if (this.getVelocidade() >= 21 && this.getVelocidade() <= 40){
                this.setMarcha(2);
                System.out.println("Marcha Atual "+this.getMarcha());
            } else if (this.getVelocidade() >= 41 && this.getVelocidade() <= 60){
                this.setMarcha(3);
                System.out.println("Marcha Atual "+this.getMarcha());
            } else if (this.getVelocidade() >= 61 && this.getVelocidade() <= 80){
                this.setMarcha(4);
                System.out.println("Marcha Atual "+this.getMarcha());
            } else if (this.getVelocidade() >= 81 && this.getVelocidade() <= 100){
                this.setMarcha(5);
                System.out.println("Marcha Atual "+this.getMarcha());
            } else if (this.getVelocidade() >= 101 && this.getVelocidade() <= 120){
                this.setMarcha(6);
                System.out.println("Marcha Atual "+this.getMarcha());
            }

        }
    }

    public void verificaVelocidade(){
    System.out.println("Velocidade atual "+this.getVelocidade()+"km/h");
    }

    public void virarParaEsquerda(){
        if (this.getVelocidade() >= 1  && this.getVelocidade() <= 40){
            System.out.println("Virando a esquerda...");
        } else {
            System.out.println("Impossível virar devido a velocidade!");
        }
    }

    public void virarParaDireita(){
        if (this.getVelocidade() >= 1  && this.getVelocidade() <= 40){
            System.out.println("Virando a direita...");
        } else {
            System.out.println("Impossível virar devido a velocidade!");
        }
    }


    //Métodos especiais

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }
}