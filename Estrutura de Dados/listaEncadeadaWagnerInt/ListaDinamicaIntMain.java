package listaEncadeadaWagnerInt;

import java.util.Scanner;

public class ListaDinamicaIntMain {
	
	public static void main(String[] args) {
				
		ListaSimplesIntInterface lsi = new ListaDinamicaInt();
		Scanner sc = new Scanner(System.in);
		int opcMenu;
		
		do {
			System.out.println(""); // Menu da Lista
			System.out.println("---------- Menu Lista Encadeada ------------");
			System.out.println("1- Inserir");
			System.out.println("2- Remover");
			System.out.println("3- Listar a Lista");
			System.out.println("4- Verificar se a lista está vazia");
			System.out.println("0- Sair.");
			System.out.println("Escolha a sua opção");
			 opcMenu = sc.nextInt();
			switch(opcMenu) {
			case 1:
				System.out.println("Digite o valor que deseja inserir: ");
				int dado = sc.nextInt();
				lsi.add(dado);
				break;
			case 2:
				System.out.println("Digite o valor que deseja remover ");
				int dadoRemove = sc.nextInt();
				lsi.removeItem(dadoRemove);
				break;
			case 3:
				System.out.println("Imprimindo a lista: ");
				lsi.imprimeLista();
				break;
			case 4:
				lsi.isEmpty();
				break;
			case 0:
				System.out.println("Fim do programa.");
				break;
			}
			}while (opcMenu != 0);
		lsi.add(5);
		System.out.print("Imprimindo lista: "); lsi.imprimeLista();
		System.out.println("");
		lsi.add(4);
		lsi.add(3);
		lsi.add(7);
		System.out.print("Imprimindo lista: ");lsi.imprimeLista();
		System.out.println("\n");
		lsi.removeItem(5);
		lsi.removeItem(3);
		System.out.print("Imprimindo lista: "); lsi.imprimeLista();
		System.out.println("\n");
		//System.out.println(lsi.consultar(null, "Ave"));
	}

}
