package methodReferences;

public class Exemplo03 {

	public static void main(String[] args) {
		
		Fig2D fig1 = new Fig2D() {

			@Override
			public void desenha() {
				System.out.println("Desenha figura por classe an�nima");
				
			}

		};
		
		fig1.desenha();
		
		//Lambda expression
		Fig2D fig2 = () -> System.out.println("Desenha figura por lambda expression");
		fig2.desenha();
		
		//Method reference
		Fig2D fig3 =  Fig2DConcrete::desenha;
		fig3.desenha();
	}

}
