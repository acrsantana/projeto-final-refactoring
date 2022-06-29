package br.com.infnet.projetofinal.empresaAcme;

abstract class Funcionario {
    protected Long matricula;
    protected String nome;
    protected String sobrenome;
    protected int idade;
    protected GrupoSanguineo grupoSanguineo;
    protected Endereco endereco;
    protected Contratacao contratacao;

    public Funcionario() {
        totalDeFuncionarios++;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public GrupoSanguineo getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(GrupoSanguineo grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Contratacao getContratacao() {
        return contratacao;
    }

    public void setContratacao(Contratacao contratacao) {
        this.contratacao = contratacao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override public String toString() {
        return "Funcionario{" + "matricula=" + matricula + ", nome='" + nome + '\'' + ", sobrenome='" + sobrenome + '\'' + ", idade=" + idade + ", grupoSanguineo=" + grupoSanguineo + ", endereco=" + endereco + ", contratacao=" + contratacao + '}';
    }

    public static int totalDeFuncionarios = 0;
}
