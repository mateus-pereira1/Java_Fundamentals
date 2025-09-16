public class Maquina {
    //Atributos
    private int agua;
    private int shampoo;
    private Pet petAtual;
    private boolean precisaLimpeza;


    //Métodos


    //Métodos Especiais

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }

    public int getShampoo() {
        return shampoo;
    }

    public void setShampoo(int shampoo) {
        this.shampoo = shampoo;
    }

    public Pet getPetAtual() {
        return petAtual;
    }

    public void setPetAtual(Pet petAtual) {
        this.petAtual = petAtual;
    }

    public boolean isPrecisaLimpeza() {
        return precisaLimpeza;
    }

    public void setPrecisaLimpeza(boolean precisaLimpeza) {
        this.precisaLimpeza = precisaLimpeza;
    }
}
