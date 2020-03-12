package lambda;

public class ExemploThread {

	public static void main(String[] args) {
		
		/**
		 * Usando o m�todo antigo
		 */
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread 1 em execu��o");
				
			}
		});
		t1.start();
		
		/**
		 * Usando java 8 - lambda expression
		 */
		Thread t2 = new Thread(() -> System.out.println("Thread 2 em execu��o"));
		t2.start();
		
		
	}

}
