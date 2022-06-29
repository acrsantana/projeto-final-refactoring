package br.com.infnet.projetofinal.empresaAcme;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Contratacao contratacaoEngenheiro = new Contratacao(new BigDecimal(4500), LocalDate.parse("26/06/2020", formatter));
        Contratacao contratacaoVendedor = new Contratacao(new BigDecimal(2500), LocalDate.parse("30/06/2019", formatter));

        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Java", 7));
        cursos.add(new Curso("Banco de Dados", 6));
        cursos.add(new Curso("Estrutura de Dados", 5));
        cursos.add(new Curso("Vendas Online", 9));
        
        Endereco enderecoEngenheiro = new EnderecoBuilder()
            .logradouro("Rua ABC")
            .numero(150)
            .bairro("Cabula")
            .cidade("Salvador")
            .estado("Bahia")
            .cep("11000-000")
            .build();

        Endereco enderecoVendedor = new EnderecoBuilder()
            .logradouro("Rua DEF")
            .numero(202)
            .bairro("Mario Dias")
            .cidade("São Sebastião dos Passos")
            .estado("Bahia")
            .cep("15200-500")
            .build();

        Engenheiro engenheiro = new EngenheiroBuilder()
            .matricula(1L)
            .nome("José")
            .sobrenome("da Silva")
            .grupoSanguineo(GrupoSanguineo.O)
            .idade(30)
            .contratacao(contratacaoEngenheiro)
            .endereco(enderecoEngenheiro)
            .notaDoutorado(6)
            .notaMestrado(8)
            .numeroConselho("23254")
            .build();

        Vendedor vendedor = new VendedorBuilder()
            .matricula(2L)
            .nome("Fabio")
            .sobrenome("Santos")
            .idade(22)
            .contratacao(contratacaoVendedor)
            .endereco(enderecoVendedor)
            .grupoSanguineo(GrupoSanguineo.AB)
            .quantidadeDeVendas(36)
            .cursos(cursos)
            .build();

        System.out.println(engenheiro);
        System.out.println("Data de contratação: " + formatter.format(engenheiro.contratacao.getDataContratacao()));
        System.out.println("Bônus do Engenheiro: " + engenheiro.calculaBonus());
        System.out.println("Tempo de contratação em anos: " + contratacaoVendedor.calcularTempoDeContratacao());

        System.out.println(vendedor);
        System.out.println(vendedor.isPlatinum() ? "Este vendedor é Platinum!" : "Não foi desta vez");

        System.out.println("Total de Funcionários: " + Funcionario.totalDeFuncionarios);
    }
}
