package POO;

public class TestaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente prime = new Cliente ("Camilo", "22", "chato",  "paga bem" );
		
		prime.imprimirInfo();
		
		Cliente prime1 = new Cliente ("Danilo", "35", "folgado",  "caloteiro");
		
		prime1.imprimirInfo();
	}

}
