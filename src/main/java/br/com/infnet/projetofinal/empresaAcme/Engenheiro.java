package br.com.infnet.projetofinal.empresaAcme;

import java.util.Date;

public class Engenheiro extends Funcionario {
    protected String numeroConselho;
    private Integer notaMestrado = 0;
    private Integer notaDoutorado = 0;
    private boolean fluenteEmIngles = false;
    final double FATOR_BONUS = 3.7;
    final int IDADE_LIMITE = 50;
    final int NOTA_APROVACAO_MESTRADO = 7;
    final int NOTA_APROVACAO_DOUTORADO = 5;
    public Engenheiro(EngenheiroBuilder engenheiroBuilder) {
        super(engenheiroBuilder);
        this.numeroConselho = engenheiroBuilder.getNumeroConselho();
        this.notaMestrado = engenheiroBuilder.getNotaMestrado();
        this.notaDoutorado = engenheiroBuilder.getNotaDoutorado();
        this.fluenteEmIngles = engenheiroBuilder.getFluenteEmIngles();
    }
    public boolean eMenorDe50Anos(){
        return getIdade() < IDADE_LIMITE;
    }
    public Double calculaBonus() {
        return contratacao.calcularTempoDeContratacao() * FATOR_BONUS;
    }

    public String getNumeroConselho() {
        return numeroConselho + new Date().getYear();
    }

    public boolean eHabilitadoParaTrabalharFora() {
        return eMenorDe50Anos() && this.fluenteEmIngles && (aprovadoMestrado() || aprovadoDoutorado());
    }

    private boolean aprovadoDoutorado() {
        return this.notaDoutorado > NOTA_APROVACAO_DOUTORADO;
    }

    private boolean aprovadoMestrado() {
        return this.notaMestrado > NOTA_APROVACAO_MESTRADO;
    }

    public Integer getNotaMestrado() {
        return notaMestrado;
    }

    public void setNotaMestrado(Integer notaMestrado) {
        this.notaMestrado = notaMestrado;
    }

    public Integer getNotaDoutorado() {
        return notaDoutorado;
    }

    public void setNotaDoutorado(Integer notaDoutorado) {
        this.notaDoutorado = notaDoutorado;
    }

    public boolean isFluenteEmIngles() {
        return fluenteEmIngles;
    }

    public void setFluenteEmIngles(boolean fluenteEmIngles) {
        this.fluenteEmIngles = fluenteEmIngles;
    }

    public void setNumeroConselho(String numeroConselho) {
        this.numeroConselho = numeroConselho;
    }

    @Override public String toString() {
        return "Engenheiro{" + "numeroConselho='" + numeroConselho + '\'' + ", notaMestrado=" + notaMestrado + ", notaDoutorado=" + notaDoutorado + ", fluenteEmIngles=" + fluenteEmIngles + ", FATOR_BONUS=" + FATOR_BONUS + ", IDADE_LIMITE=" + IDADE_LIMITE + ", NOTA_APROVACAO_MESTRADO=" + NOTA_APROVACAO_MESTRADO + ", NOTA_APROVACAO_DOUTORADO=" + NOTA_APROVACAO_DOUTORADO + '}' + super.toString();
    }
}
