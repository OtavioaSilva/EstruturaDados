package listaCircularSimples;

import java.util.Scanner;

public class ListaCircularMain {

	public static void main(String[] args) {
		
		ListaCircularInterface lista = new ListaCircular();
		// --------------------------------------------- MENU \/ ------------------------------------------------
		Scanner sc = new Scanner(System.in);
		int opcMenu;
		
		do {
			System.out.println(""); // Menu de Lista Circular
			System.out.println("---------- Menu Lista Circular ------------");
			System.out.println("1- Inserir Inicio");
			System.out.println("2- Inserir no Meio");
			System.out.println("3- Inserir no Fim");
			System.out.println("4- Remover");
			System.out.println("5- Buscar valor");
			System.out.println("6- Listar a Lista Circular");
			System.out.println("7- Verificar se a lista está vazia.");
			System.out.println("0- Sair.");
			System.out.println("Escolha a sua opção");
			 opcMenu = sc.nextInt();
			switch(opcMenu) {
			case 1:
				System.out.println("Digite o valor que deseja inserir no inicio da lista: ");
				int dado = sc.nextInt();
				lista.inserirInicio(dado);
				break;
			case 2:
				System.out.println("Digite o valor que deseja inserir no meio da lista: ");
				int dadoMeio = sc.nextInt();
				lista.inserirMeio(dadoMeio);
				break;
			case 3:
				System.out.println("Digite o valor que deseja inserir no fim da lista: ");
				int dadoFim = sc.nextInt();
				lista.inserirFim(dadoFim);
				break;
			case 4:
				System.out.println("Digite o valor que deseja excluir: ");
				int valorExcluir = sc.nextInt();
				lista.excluir(valorExcluir);
				break;
			case 5:
				System.out.println("Digite um valor para buscar: ");
				int buscarValor = sc.nextInt();
				lista.buscar(buscarValor);
				break;
			case 6:
				System.out.println("Listando a lista circular");
				lista.mostrarLista();
				break;
			case 7:
				System.out.println(lista.isEmpty());
				break;
			case 0:
				System.out.println("Fim do programa.");
				break;
			}
			}while (opcMenu != 0);
		// ------------------------------------ MENU /\ ----------------------------------------------------------------
		
		System.out.println(lista.isEmpty()); // A lista vazia vai retornar true
		lista.inserirFim(34);
		System.out.println(lista.isEmpty()); // A lista foi preenchida então vai retornar false;
		System.out.println("");
		lista.inserirFim(56);
		lista.inserirFim(12);
		lista.inserirFim(78);
		lista.inserirFim(32);
		lista.inserirInicio(999);
		lista.inserirMeio(5);
		lista.mostrarLista();
		System.out.println("\nTamanho da lista: " + lista.tamanho());
		lista.modificarValor(12);
		System.out.println("\n");
		lista.buscar(12); // Valor existe
		lista.buscar(55); // Valor não existe
		System.out.println("");
		

		lista.mostrarLista();     // o novo valor
		System.out.println("\nTamanho da lista: " + lista.tamanho());
		lista.excluir(12);
		lista.inserirMeio(888);
		System.out.println("\n");
		lista.mostrarLista();
		System.out.println("\nTamanho da lista: " + lista.tamanho());
		lista.excluir(5);
		lista.excluir(34);
		lista.inserirInicio(66);
		System.out.println("\n");
		lista.mostrarLista();
		System.out.println("\nTamanho da lista: " + lista.tamanho());
		
		
		
	}

}
