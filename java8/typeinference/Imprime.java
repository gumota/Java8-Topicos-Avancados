package typeinference;

import java.util.List;

public class Imprime {

	public static void imprime(List<Produto> lista) {

		if (!lista.isEmpty()) {
			lista.forEach(p -> System.out.println(p.getNome()));
		} else {
			System.out.println("Lista vazia");
		}

	}

}
