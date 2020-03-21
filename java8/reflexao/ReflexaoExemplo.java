package reflexao;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflexaoExemplo {

	public static void main(String[] args) {

		// Instancia da classe produto
		Produto p = new Produto("Geladeira", 3000.00);

		// Instancia da classe class
		Class cl = p.getClass();

		// Todos os métodos declarados na classe produto
		Method[] methods = cl.getDeclaredMethods();

		for (Method m : methods) {
			System.out.println(m.getName());
			Parameter[] parameter = m.getParameters();
			
			for(Parameter pr : parameter) {
				System.out.println(pr);
			}
		}

	}

}
