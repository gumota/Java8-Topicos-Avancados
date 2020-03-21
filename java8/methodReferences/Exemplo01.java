package methodReferences;

public class Exemplo01 {

	public static void main(String[] args) {

		// Lambda expression
		Figura2D fig1 = (l, a) -> System.out.println("Desenha figura de Largura: " + l + " e Altura: " + a);
		fig1.desenha(8.0, 1.5);

		// Objeto especifico
		Retangulo ret = new Retangulo();

		// Method reference - a um metodo de instancia de um objeto particular;
		Figura2D fig2 = ret::desenhaRetangulo;
		fig2.desenha(10.5, 7.0);

	}

}
