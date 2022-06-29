package br.com.infnet.projetofinal.empresaAcme;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Contratacao contratacao = new Contratacao(new BigDecimal(4500), LocalDate.parse("26/06/2020", formatter));
        Endereco endereco = new EnderecoBuilder()
            .logradouro("Rua ABC")
            .numero(150)
            .bairro("Cabula")
            .cidade("Salvador")
            .estado("Bahia")
            .cep("11000-000")
            .build();

        Engenheiro engenheiro = new EngenheiroBuilder()
            .matricula(1L)
            .nome("José")
            .sobrenome("da Silva")
            .grupoSanguineo(GrupoSanguineo.O)
            .idade(30)
            .contratacao(contratacao)
            .endereco(endereco)
            .notaDoutorado(6)
            .notaMestrado(8)
            .build();

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Vendedor 1");
        vendedor.setSobrenome("Sobrenome do vendedor 1");
        vendedor.setIdade(35);
        vendedor.setMatricula(2L);
        vendedor.setGrupoSanguineo(GrupoSanguineo.A);
        vendedor.setContratacao(new Contratacao(new BigDecimal(2000), LocalDate.parse("29/06/2020", formatter)));
        vendedor.setQuantidadeDeVendas(36L);
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Java", 7));
        cursos.add(new Curso("Banco de Dados", 6));
        cursos.add(new Curso("Estrutura de Dados", 5));
        cursos.add(new Curso("Vendas Online", 9));

        vendedor.setCursos(cursos);

        System.out.println(engenheiro);
        System.out.println("Data de contratação: " + formatter.format(engenheiro.contratacao.getDataContratacao()));
        System.out.println("Bônus do Engenheiro: " + engenheiro.calculaBonus());
        System.out.println("Tempo de contratação em anos: " + contratacao.calcularTempoDeContratacao());
        System.out.println(vendedor);
        System.out.println("Total de Funcionários: " + Funcionario.totalDeFuncionarios);
        System.out.println(vendedor.isPlatinum() ? "Este vendedor é Platinum!" : "Não foi desta vez");
    }
}
