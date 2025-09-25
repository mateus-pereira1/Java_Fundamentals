public class Produto implements Calcula{
    private String nome;
    private String tipo;
    private float preco;


    public Produto(String nome, String tipo, float preco){
        this.nome = nome;
        this.tipo = tipo;
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public float getPreco() {
        return preco;
    }

    @Override
    public void calculaTributos(){
        if (this.getTipo().equalsIgnoreCase("Alimentação")){
            float tributo = (this.getPreco()*1)/100;
            System.out.println("O valor de tributo em produtos de Alimentação é R$"+tributo);
        } else if (this.getTipo().equalsIgnoreCase("Saude e bem estar")){
            float tributo = (float) (this.getPreco()*1.5)/100;
            System.out.println("O valor de tributo em produtos de Saúde e bem estar é R$"+tributo);
        } else if (this.getTipo().equalsIgnoreCase("Vestuario")){
            float tributo = (float) (this.getPreco()*2.5)/100;
            System.out.println("O valor de tributo em produtos de Vestuário é R$"+tributo);
        } else if (this.getTipo().equalsIgnoreCase("Cultura")){
            float tributo = (this.getPreco()*4)/100;
            System.out.println("O valor de tributo em produtos de Cultura é R$"+tributo);
        }
    }
}
