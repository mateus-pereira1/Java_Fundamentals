public class MeiaEntrada extends Ingresso {


    public MeiaEntrada(String nomeDoFilme, String tipoAudio) {
        super(nomeDoFilme, tipoAudio);
    }

    public float retornaValor(){
        return this.setValor(this.getValor()/2);
    }
}
