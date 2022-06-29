package br.com.infnet.projetofinal.empresaAcme;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

public class Contratacao {
    private BigDecimal salario;
    private final LocalDate dataContratacao;

    public Contratacao(BigDecimal salario, LocalDate dataContratacao) {
        this.salario = salario;
        this.dataContratacao = dataContratacao;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void reajustaSalario(BigDecimal novoSalario){
        this.salario = novoSalario;
    }

    public int calcularTempoDeContratacao(){
        return Period.between(dataContratacao, LocalDate.now()).getYears();
    }

    @Override public String toString() {
        return "Contratacao{" + "salario=" + salario + ", dataContratacao=" + dataContratacao + '}';
    }
}

