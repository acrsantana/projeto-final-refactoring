package br.com.infnet.projetofinal.empresaAcme;

import java.util.List;

public class VendedorBuilder implements FuncionarioBuilder{

    private long matricula;
    private String nome;
    private String sobrenome;
    private int idade;
    private GrupoSanguineo grupoSanguineo;
    private Endereco endereco;
    private Contratacao contratacao;
    private Long quantidadeDeVendas;
    private List<Curso> cursos;

    @Override public VendedorBuilder matricula(Long matricula) {
        this.matricula = matricula;
        return this;
    }

    @Override public VendedorBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override public VendedorBuilder sobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
        return this;
    }

    @Override public VendedorBuilder idade(int idade) {
        this.idade = idade;
        return this;
    }

    @Override public VendedorBuilder grupoSanguineo(GrupoSanguineo grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
        return this;
    }

    @Override public VendedorBuilder contratacao(Contratacao contratacao) {
        this.contratacao = contratacao;
        return this;
    }

    @Override public VendedorBuilder endereco(Endereco endereco) {
        this.endereco = endereco;
        return this;
    }

    public VendedorBuilder quantidadeDeVendas(long quantidadeDeVendas) {
        this.quantidadeDeVendas = quantidadeDeVendas;
        return this;
    }

    public VendedorBuilder cursos(List<Curso> cursos) {
        this.cursos = cursos;
        return this;
    }

    public Vendedor build() {
        return new Vendedor(this);
    }

    @Override public long getMatricula() {
        return matricula;
    }

    @Override public String getNome() {
        return nome;
    }

    @Override public String getSobrenome() {
        return sobrenome;
    }

    @Override public int getIdade() {
        return idade;
    }

    @Override public GrupoSanguineo getGrupoSanguineo() {
        return grupoSanguineo;
    }

    @Override public Contratacao getContratacao() {
        return contratacao;
    }

    @Override public Endereco getEndereco() {
        return endereco;
    }

    public Long getQuantidadeDeVendas() {
        return quantidadeDeVendas;
    }

    public List<Curso> getCursos() {
        return cursos;
    }
}
