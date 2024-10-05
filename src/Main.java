import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso("Curso Java", "Curso avançado de Java", 40);
        Curso curso2 = new Curso("Curso Kotlin", "Curso básico de Kotlin", 15);

        Mentoria mentoria = new Mentoria("Mentoria de Java", "Descrição", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Bootcamp JVM Developer", "Curso abrangendo as linguagens interpretadas pela JVM");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev kauefelippet = new Dev();
        kauefelippet.setNome("Kauê Felippe");
        kauefelippet.inscreverBootcamp(bootcamp);
        System.out.println(kauefelippet.getNome() + " conteúdos inscritos: " + kauefelippet.getConteudosInscritos());
        kauefelippet.progredir();
        System.out.println("Conteúdos concluídos: " + kauefelippet.getConteudosConcluidos());
        System.out.println(kauefelippet.getNome() + " conteúdos inscritos: " + kauefelippet.getConteudosInscritos());
        System.out.println("XP: " + kauefelippet.calcularTotalXp());

        System.out.println();

        Dev jose = new Dev();
        jose.setNome("José Johnson");
        jose.inscreverBootcamp(bootcamp);
        System.out.println(jose.getNome() + " conteúdos inscritos: " + jose.getConteudosInscritos());
        jose.progredir();
        System.out.println("Conteúdos concluídos: " + jose.getConteudosConcluidos());
        System.out.println(jose.getNome() + " conteúdos inscritos: " + jose.getConteudosInscritos());
        System.out.println("XP: " + jose.calcularTotalXp());
    }
}
