package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProcessoProduto {

	public static void main(String[] args) {

		List<Produto> lista = new ArrayList<>();

		lista.add(new Produto(1000, "TV 42'", 2000.00));
		lista.add(new Produto(1001, "Geladeira 470L", 3200.00));
		lista.add(new Produto(1003, "Fogão 4 bocas", 900.00));
		lista.add(new Produto(1004, "Videogame", 1999.00));
		lista.add(new Produto(1005, "Microondas", 550.00));
		lista.add(new Produto(1007, "Geladeira 47L", 3200.00));
		lista.add(new Produto(1009, "Geladeira 500L", 3200.00));
		lista.add(new Produto(1009, "TV 50'", 3200.00));

		// PIPELINE
		lista.stream().filter(p -> p.getNome().contains("TV"))
				.sorted((p1, p2) -> p1.getPreco().compareTo(p2.getPreco())).map(p -> p.getNome().toUpperCase())
				.forEach(System.out::println);

		List<String> listaTV = lista.stream().filter(p -> p.getNome().contains("TV"))
				.sorted((p1, p2) -> p1.getPreco().compareTo(p2.getPreco())).map(p -> p.getNome().toUpperCase())
				.collect(Collectors.toList());

		List<Produto> listaFogao = lista.stream().filter(p -> p.getNome().contains("Fogão"))
				.collect(Collectors.toList());

		List<Produto> listaOrdenada = lista.stream().sorted((p1, p2) -> p1.getPreco().compareTo(p2.getPreco()))
				.collect(Collectors.toList());

		listaOrdenada.forEach(System.out::println);
		System.out.println(listaFogao);

		System.out.println(listaTV);
	}

}
