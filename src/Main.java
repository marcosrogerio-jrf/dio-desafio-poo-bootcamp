import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	public static void main(String[] args) {
		Curso c1 = new Curso();
		c1.setTitulo("Curso Java");
		c1.setDescricao("Descrição curso java");
		c1.setCargaHoraria(8);
		
		Curso c2 = new Curso();
		c2.setTitulo("Curso JS");
		c2.setDescricao("Descrição curso JS");
		c2.setCargaHoraria(4);
		
		Conteudo c3 = new Curso();
		
		Mentoria m1 = new Mentoria();
		m1.setTitulo("Mentoria Java");
		m1.setDescricao("Descrição mentoria Java");
		m1.setData(LocalDate.now());
				
		/*System.out.println(c1);
		System.out.println(c2);
		System.out.println(m1);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descricão Bootcamp");
		bootcamp.getConteudos().add(c1);
		bootcamp.getConteudos().add(c2);
		bootcamp.getConteudos().add(m1);
		
		Dev devMaria = new Dev();
		devMaria.setNome("Maria");
		devMaria.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Maria: "+devMaria.getConteudoInscritos());

		devMaria.progredir();
		System.out.println("Conteúdos Inscritos Maria: "+devMaria.getConteudoInscritos());
		System.out.println("Conteúdos Concluídos Maria: "+devMaria.getConteudoConcluidos());
		System.out.println("XP: "+devMaria.calcularTotalXp());
		
		Dev devPedro = new Dev();
		devPedro.setNome("Pedro");
		devPedro.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Pedro: "+devPedro.getConteudoInscritos());
		devPedro.progredir();
		System.out.println("Conteúdos Inscritos Pedro: "+devPedro.getConteudoInscritos());
		System.out.println("Conteúdos Concluídos Pedro: "+devPedro.getConteudoConcluidos());
		System.out.println("XP: "+devPedro.calcularTotalXp());
	}
}
