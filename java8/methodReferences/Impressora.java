package methodReferences;

public class Impressora {
	
	public static void imprime(Produto p) {
		System.out.println(p.getNome() + " = " + p.getPreco());
	}

}
