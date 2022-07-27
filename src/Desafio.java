import br.com.rhcerqueira.desafio.dominio.Bootcamp;
import br.com.rhcerqueira.desafio.dominio.Curso;
import br.com.rhcerqueira.desafio.dominio.Dev;
import br.com.rhcerqueira.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Desafio {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("curso java");
        curso.setDescricao("descrição do curso de java");
        curso.setCargaHoraria(8);

        Curso curso1 = new Curso();
        curso1.setTitulo("curso javascript");
        curso1.setDescricao("descrição do curso de javascript");
        curso1.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devRaoni = new Dev();
        devRaoni.setNome("Raoni");
        devRaoni.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devRaoni.getConteudosInscritos());

        devRaoni.progredir();
        devRaoni.progredir();

        System.out.println("Conteúdos Inscritos" + devRaoni.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devRaoni.getConteudosConcluidos());

        System.out.printf("XP: " + devRaoni.calcularXpTotal());



        Dev devThalita = new Dev();
        devThalita.setNome("Thalita");
        devThalita.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devThalita.getConteudosInscritos());

        devThalita.progredir();
        devThalita.progredir();
        devThalita.progredir();

        System.out.println("Conteúdos Inscritos" + devThalita.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devThalita.getConteudosConcluidos());

        System.out.printf("XP: " + devThalita.calcularXpTotal());

    }
}
