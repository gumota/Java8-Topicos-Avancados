package methodReferences;

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
//		lista.forEach((p) -> System.out.println("Nome: " + p.getNome() + " R$ " + p.getPreco()));

		// Ordenando a lista 
//		lista.sort((p1, p2) -> p1.getPreco().compareTo(p2.getPreco()));
//
//		// Method references - a um método estático
//		lista.forEach(Impressora::imprime);
		
		//Instancia a um objeto arbitrario
		lista.forEach(Produto::imprime);

	}

}
