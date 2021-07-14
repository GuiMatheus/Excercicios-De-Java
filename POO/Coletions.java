package POO;

import java.util.ArrayList;
import java.util.Scanner;

public class Coletions{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op;
		Scanner averigue = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList<String>();
		
		do {
			System.out.println("\n**********************************************\n(1)Recebidinhos novos: \n"
					+ "(2)Dispensar Recebidinhos? \n(3)Atualizar Recebidinhos\n(4)Mostrar todos os Recebidinhos at� agora:"
					+ "\n(0) Atabo ");
			System.out.println("\n*****************************************");
			System.out.println("\n\t\tDigite sua op��o: ");
			System.out.println("\n******************************************");
			op = averigue.nextInt();
			
			switch(op)
			{
			case 1:
				averigue.nextLine();
				System.out.println("\n*********************************************");
				System.out.println("\nDigite o produto para adicionar aos Recebidinhos: ");
				String produto = averigue.nextLine();//ler uma vari�vel do tipo String
				estoque.add(produto);//adicionar um produto no meu ArrayList
				break;
			case 2:
				averigue.nextLine();
				System.out.println("**********************************************");
				System.out.println("\nDigite o produto para remover dos Recebidinhos: ");
				String produto1 = averigue.nextLine();
				if(estoque.contains(produto1))
				{
					estoque.remove(produto1);
				}
				else
				{
					System.out.println("***************************************");
					System.out.println("\nProduto n�o existe nos Recebidinhos...");
				}
				System.out.println(estoque);
				break;
			case 3:
				averigue.nextLine();
				System.out.println("*******************************************");
				System.out.println("\nDigite o Recebidinho que quer atualizar: ");
				String verifica = averigue.nextLine();
				System.out.println("********************************************");
				System.out.println("\nDigite o nome do Recebidnho que entrar� no lugar de "+verifica+" : ");
				String novo = averigue.nextLine();
				
				if(estoque.contains(verifica))
				{
					estoque.remove(verifica);
					estoque.add(novo);
				}
				else
				{
					System.out.println("\nRecebidinho n�o existente...");
				}
				System.out.println(estoque);
				break;
			case 4:
				System.out.println("\nOs Recebidnhos at� agora s�o: ");
				System.out.println(estoque);
				break;
				default:
					System.out.println("\nTerminou por aqui... Volte logo sentiremos saudades...");
				
			}
			
		}
		while(op!=0);
	}

}



