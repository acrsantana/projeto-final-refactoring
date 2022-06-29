package br.com.infnet.projetofinal.empresaAcme;

public interface FuncionarioBuilder {

    long matricula = 0;
    String nome = "";
    String sobrenome = "";
    int idade = 0;
    GrupoSanguineo grupoSanguineo = null;
    Contratacao contratacao = null;
    Endereco endereco = null;

    public FuncionarioBuilder grupoSanguineo(GrupoSanguineo grupoSanguineo);
    public FuncionarioBuilder contratacao(Contratacao contratacao);
    public FuncionarioBuilder endereco(Endereco endereco);
    public FuncionarioBuilder matricula(Long matricula);
    public FuncionarioBuilder nome(String nome);
    public FuncionarioBuilder sobrenome(String sobrenome);
    public FuncionarioBuilder idade(int idade);

    public long getMatricula();
    public String getNome();
    public String getSobrenome();
    public int getIdade();
    public GrupoSanguineo getGrupoSanguineo();
    public Contratacao getContratacao();
    public Endereco getEndereco();
}
