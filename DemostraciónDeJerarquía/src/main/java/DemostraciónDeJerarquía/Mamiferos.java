
package DemostraciónDeJerarquía;


public abstract class Mamiferos {
    protected String vocalizacao;
    protected String nomeEspecie;
    
    public String Som(){
        return vocalizacao;
    }
    public String nome(String nome){
        this.nomeEspecie=nome;
        return nomeEspecie;
    }

    public String getVocalizacao() {
        return vocalizacao;
    }

    public void setVocalizacao(String vocalizacao) {
        this.vocalizacao = vocalizacao;
    }

    public String getNomeEspecie() {
        return nomeEspecie;
    }

    public void setNomeEspecie(String nomeEspecie) {
        this.nomeEspecie = nomeEspecie;
    }
    
}
