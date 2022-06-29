package br.com.infnet.projetofinal.empresaAcme;

public class EnderecoBuilder {
    private String logradouro;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;

    private String cep;


    public EnderecoBuilder logradouro(String logradouro){
        this.logradouro = logradouro;
        return this;
    }

    public EnderecoBuilder numero(int numero){
        this.numero = numero;
        return this;
    }

    public EnderecoBuilder bairro(String bairro){
        this.bairro = bairro;
        return this;
    }

    public EnderecoBuilder cidade(String cidade){
        this.cidade = cidade;
        return this;
    }

    public EnderecoBuilder estado(String estado){
        this.estado = estado;
        return this;
    }

    public Endereco build(){
        return new Endereco(this);
    }

    public EnderecoBuilder cep(String cep){
        this.cep = cep;
        return this;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }
}
