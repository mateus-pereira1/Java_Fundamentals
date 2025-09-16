public class Familia extends Ingresso {
    //Atributos
    private int pessoas;

    public Familia(String nomeDoFilme, String tipoAudio, int pessoas) {
        super(nomeDoFilme, tipoAudio);
        this.pessoas = pessoas;
    }

    public double retornaValor(){
        if (this.getPessoas() <= 3){
            return this.getValor()*this.getPessoas();
        } else {
            float desconto = this.getValor()*this.getPessoas()*5/100;
            return this.setValor((float) ((this.getValor()*this.getPessoas())-desconto));

        }
    }

    public int getPessoas() {
        return pessoas;
    }

    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }



}
