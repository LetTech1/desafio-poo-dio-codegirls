package br.com.desafio;

import java.time.LocalDate;

import br.com.desafio.dominio.Bootcamp;
import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Dev;
import br.com.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev leticia = new Dev();
        leticia.setNome("Eduarda");
        leticia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Eduarda:" + leticia.getConteudosInscritos());
        leticia.progredir();
        leticia.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Eduarda:" + leticia.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Eduarda:" + leticia.getConteudosConcluidos());
        System.out.println("XP:" + leticia.calcularTotalXp());

        System.out.println("-------");

        Dev devAna = new Dev();
        devAna.setNome("Ada Lovelace");
        devAna.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devAna.getConteudosInscritos());
        devAna.progredir();
        devAna.progredir();
        devAna.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devAna.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devAna.getConteudosConcluidos());
        System.out.println("XP:" + devAna.calcularTotalXp());
    }
}
