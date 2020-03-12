package lambda;

import java.util.ArrayList;
import java.util.List;

public class Exemplo02 {

	public static void main(String[] args) {

		List<Produto> lista = new ArrayList<>();

		lista.add(new Produto("TV 42'", 2000.00));
		lista.add(new Produto("Geladeira 470L", 3200.00));
		lista.add(new Produto("Fogão 4 bocas", 900.00));
		lista.add(new Produto("Videogame", 1999.00));
		lista.add(new Produto("Microondas", 550.00));
		
		// Lambda expression com argumento
		lista.forEach((p) ->  System.out.println("Nome: " +  p.getNome() + " R$ " + p.getPreco()));
		
		// Ordenando a lista
		lista.sort((p1, p2) -> p1.getPreco().compareTo(p2.getPreco()));
		
		//Blocos de ações dentro da expressão lambda
		lista.forEach((p) ->  {
			System.out.println("Nome: " +  p.getNome());
			System.out.println("R$ " + p.getPreco());
			
		});
		
		lista.forEach((p) -> {
			System.out.println(p.getNome());
			System.out.println(p.getPreco());
		});

	}

}
