public class Ingresso {
    //Atributos
    private float valor;
    private String nomeDoFilme;
    private String tipoAudio;

    public Ingresso(String nomeDoFilme, String tipoAudio) {
        this.nomeDoFilme = nomeDoFilme;
        this.tipoAudio = tipoAudio;
        this.valor = 40;
    }

    public float getValor() {
        return valor;
    }

    public float setValor(float valor) {
        this.valor = valor;
        return valor;
    }

    public String getNomeDoFilme() {
        return nomeDoFilme;
    }

    public void setNomeDoFilme(String nomeDoFilme) {
        this.nomeDoFilme = nomeDoFilme;
    }

    public String getTipoAudio() {
        return tipoAudio;
    }

    public void setTipoAudio(String tipoAudio) {
        this.tipoAudio = tipoAudio;
    }
}
