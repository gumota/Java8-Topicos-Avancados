package optional;

import java.util.ArrayList;
import java.util.List;

public class OptionalExemplo {

	public static void main(String[] args) {

		Curso cursoAdm = new Curso("Administração");

		List<Aluno> alunos = new ArrayList<Aluno>();

		Aluno jose = new Aluno("José");
		jose.setMatricula(new Matricula("11100"));
		alunos.add(jose);

		Aluno maria = new Aluno("Maria");
		maria.setMatricula(new Matricula("12010"));
		alunos.add(maria);

		Aluno ana = new Aluno("Ana");
		alunos.add(ana);

		Aluno paulo = new Aluno("Paulo");
		paulo.setMatricula(new Matricula("14010"));
		alunos.add(paulo);

		cursoAdm.setListaAlunos(alunos);

//		Erro pois Ana não tem matricula
//		cursoAdm.getListaAlunos().forEach(a -> System.out.println(a.getNome() + " - " + a.getMatricula().getNumero()));

		cursoAdm.getListaAlunos().stream().filter(a -> a.getMatricula().isPresent())
				.forEach(a -> System.out.println(a.getNome() + " - " + a.getMatricula().get().getNumero()));

	}

}
