package funcionalInterfaces;

//Uma interface funcional possui apenas um método abstrato, caso tenha mais ela deixa de ser interface funcional. Essa anotação 
//é opcional, mas ajuda na identificação. COntudo, o compilador sabe se é ou não uma interface funcional. 
@FunctionalInterface
public interface Triangulo {

	void desenha();

}
