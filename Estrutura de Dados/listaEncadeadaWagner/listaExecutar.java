package listaEncadeadaWagner;

import java.util.Scanner;

public class listaExecutar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListaSimplesInterface lsi = new ListaDinamica();
		Scanner sc = new Scanner(System.in);
		int opcMenu;
		
		do {
			System.out.println(""); // Menu da Lista
			System.out.println("---------- Menu Lista Encadeada ------------");
			System.out.println("1- Inserir");
			System.out.println("2- Remover");
			System.out.println("3- Listar a lista encadeada");
			System.out.println("4- Verificar se a lista está vazia.");
			System.out.println("0- Sair.");
			System.out.println("Escolha a sua opção");
			 opcMenu = sc.nextInt();
			switch(opcMenu) {
			case 1:
				System.out.println("Digite o valor que deseja inserir ");
				String dado = sc.next();
				lsi.add(dado);
				break;
			case 2:
				System.out.println("Digite o valor que deseja remover: ");
				String dadoMeio = sc.next();
				lsi.removeItem(dadoMeio);
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
		lsi.add("João");
		lsi.imprimeLista();
		System.out.println("");
		lsi.add("Maria");
		lsi.add("Claudio");
		lsi.add("Ave");
		lsi.imprimeLista();
		System.out.println("\n");
		lsi.removeItem("Maria");
		lsi.removeItem("Claudio");
		lsi.imprimeLista();
		System.out.println("\n");
		//System.out.println(lsi.consultar(null, "Ave"));

	}

}
