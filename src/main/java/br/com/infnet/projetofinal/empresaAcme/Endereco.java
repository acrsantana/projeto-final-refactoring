package br.com.infnet.projetofinal.empresaAcme;

public class Endereco {
    private String logradouro;
    private String cidade;
    private int numero;
    private String cep;
    private String bairro;
    private String estado;

    public Endereco() {
    }

    public Endereco(EnderecoBuilder enderecoBuilder) {
        this.logradouro = enderecoBuilder.getLogradouro();
        this.numero = enderecoBuilder.getNumero();
        this.bairro = enderecoBuilder.getBairro();
        this.cidade = enderecoBuilder.getCidade();
        this.estado = enderecoBuilder.getEstado();
        this.cep = enderecoBuilder.getCep();
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override public String toString() {
        return "Endereco{" + "logradouro='" + logradouro + '\'' + ", cidade='" + cidade + '\'' + ", numero='" + numero + '\'' + ", cep='" + cep + '\'' + ", bairro='" + bairro + '\'' + ", estado='" + estado + '\'' + '}';
    }
}
