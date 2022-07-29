package br.com.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

public class Bootcamp {
	@Getter @Setter
    private String nome;
	@Getter @Setter
    private String descricao;
	@Getter
    private final LocalDate dataInicial = LocalDate.now();
	@Getter
    private final LocalDate dataFinal = dataInicial.plusDays(45);
	@Getter @Setter
    private Set<Dev> devsInscritos = new HashSet<>();
	@Getter @Setter
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos);
    }

}
