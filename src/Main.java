import br.com.dio.desafio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    Curso curso1 = new Curso();
    curso1.setTitulo("curso java");
    curso1.setDescricao("descrição curso java");
    curso1.setCargaHoraria(8);

    Curso curso2 = new Curso ();
    curso2.setTitulo("curso js");
    curso2.setDescricao("Descrição curso js");
    curso2.setCargaHoraria(4);


    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("mentoria de java");
    mentoria.setDescricao("descrição mentoria java");
    mentoria.setData(LocalDate.now());


    /*System.out.println(curso1);
    System.out.println(curso2);
    System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        System.out.println("--> Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devMaria.getConteudosInscricao());
        devMaria.progredir();
        devMaria.progredir();
        System.out.println("Conteudos concluídos" + devMaria.getConteudosconcluidos());
        System.out.println("XP: " + devMaria.calcularTotalXp());

        System.out.println("-----");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        System.out.println("--> João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devJoao.getConteudosInscricao());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteudos concluídos" + devJoao.getConteudosconcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());





    }
}
