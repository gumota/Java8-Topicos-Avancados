package funcionalInterfaces;

//Uma interface funcional possui apenas um m�todo abstrato, caso tenha mais ela deixa de ser interface funcional. Essa anota��o 
//� opcional, mas ajuda na identifica��o. COntudo, o compilador sabe se � ou n�o uma interface funcional. 
@FunctionalInterface
public interface Triangulo {

	void desenha();

}
