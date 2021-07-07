package POO;

public class testeAvião {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Avião novo = new Avião (" poltrona G7","idosa","executiva","janela" );
		
		novo.ImprimirInfo();
		novo.setClasse("economica");
		novo.setPosição("corredor");
		
		System.out.println("\n***REALOCAÇÃO***");
		novo.ImprimirInfo();

	}

}
