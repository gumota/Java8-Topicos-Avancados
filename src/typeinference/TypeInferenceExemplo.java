package typeinference;

import java.util.ArrayList;
import java.util.List;

public class TypeInferenceExemplo {
	
	public static void main(String[] args) {
		
		List<Produto> lista = new ArrayList<>();

		lista.add(new Produto("TV 42'", 2000.00));
		lista.add(new Produto("Geladeira 470L", 3200.00));
		lista.add(new Produto("Fogão 4 bocas", 900.00));
		lista.add(new Produto("Videogame", 1999.00));
		lista.add(new Produto("Microondas", 550.00));
		
		Imprime.imprime(lista);
		
		Imprime.imprime(new ArrayList<Produto>());
		//Não precisa declarar o tipo no Diamond, pois o compilador olha a chamada do método
		Imprime.imprime(new ArrayList<>());
		
	}

}
