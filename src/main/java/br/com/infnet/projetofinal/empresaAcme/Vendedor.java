package br.com.infnet.projetofinal.empresaAcme;

import java.util.List;

public class Vendedor extends Funcionario{
    private Long quantidadeDeVendas;
    private List<Curso> cursos;
    private final int META_DE_VENDAS = 35;
    private final int META_DE_CURSOS = 3;

    public Vendedor() {}
    public Vendedor(VendedorBuilder vendedorBuilder) {
        super(vendedorBuilder);
        this.quantidadeDeVendas = vendedorBuilder.getQuantidadeDeVendas();
        this.cursos = vendedorBuilder.getCursos();
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public boolean isPlatinum(){
        return  isMetaBatida() && quantidadeDeCursos();
    }

    private boolean quantidadeDeCursos() {
        return cursos.size() > META_DE_CURSOS;
    }

    public Long getQuantidadeDeVendas() {
        return quantidadeDeVendas;
    }

    public void setQuantidadeDeVendas(Long quantidadeDeVendas) {
        this.quantidadeDeVendas = quantidadeDeVendas;
    }

    private boolean isMetaBatida() {
        return getQuantidadeDeVendas() > META_DE_VENDAS;
    }

    @Override public String toString() {
        return "Vendedor{" + "quantidadeDeVendas=" + getQuantidadeDeVendas() + ", cursos=" + cursos + '}' + super.toString();
    }
}
