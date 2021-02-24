package listaCircularSimplesString;

import java.util.Scanner;

public class ListaCircularMainString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaCircularStringInterface lista = new ListaCircularString();
		// --------------------------------------------- MENU \/ ------------------------------------------------
		/*
				Scanner sc = new Scanner(System.in);
				int opcMenu;
				
				do {
					System.out.println(""); // Menu de Lista Circular
					System.out.println("---------- Menu Lista Circular ------------");
					System.out.println("1- Inserir Inicio");
					System.out.println("2- Inserir no Meio");
					System.out.println("3- Inserir no Fim");
					System.out.println("4- Remover");
					System.out.println("5- Buscar Nome");
					System.out.println("6- Listar a Lista Circular");
					System.out.println("7- Verificar se a lista está vazia.");
					System.out.println("0- Sair.");
					System.out.println("Escolha a sua opção");
					 opcMenu = sc.nextInt();
					switch(opcMenu) {
					case 1:
						System.out.println("Digite o nome que deseja inserir no inicio da lista: ");
						String dado = sc.next();
						lista.inserirInicio(dado);
						break;
					case 2:
						System.out.println("Digite o nome que deseja inserir no meio da lista: ");
						String dadoMeio = sc.next();
						lista.inserirMeio(dadoMeio);
						break;
					case 3:
						System.out.println("Digite o nome que deseja inserir no fim da lista: ");
						String dadoFim = sc.next();
						lista.inserirFim(dadoFim);
						break;
					case 4:
						sc.nextLine();
						System.out.println("Digite o nome que deseja excluir: ");
						//String valorExcluir = sc.next();
						lista.excluir(sc.nextLine());
						break;
					case 5:
						System.out.println("Digite um nome para buscar: ");
						String buscaNome = sc.next();
						lista.buscar(buscaNome);
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
		*/
		System.out.println(lista.isEmpty()); // A lista vazia vai retornar true
		System.out.println();
		lista.inserirFim("Maria");
		System.out.println(lista.isEmpty()); // A lista foi preenchida então vai retornar false;
		System.out.println("");
		lista.inserirFim("João");
		lista.inserirFim("Pedro");
		lista.inserirFim("Bruno");
		lista.inserirFim("Rick");
		lista.inserirInicio("Marty");
		lista.inserirMeio("Brane");
		lista.mostrarLista();
		System.out.println("\nTamanho da lista: " + lista.tamanho());
		
		System.out.println("\n");
		lista.buscar("Bruno"); // Valor existe
		lista.buscar("Raxx"); // Valor não existe
		System.out.println("");
		
		lista.modificarValor("Bruno"); // Vai procurar pelo valor 12 e pedir para digitar via teclado
		lista.mostrarLista();     // o novo valor
		System.out.println("\nTamanho da lista: " + lista.tamanho());
		lista.excluir("Rick");
		lista.inserirMeio("Belt");
		System.out.println("\n");
		lista.mostrarLista();
		System.out.println("\nTamanho da lista: " + lista.tamanho());
		lista.excluir("João");
		lista.excluir("Marty");
		lista.inserirInicio("Lane");
		System.out.println("\n");
		lista.mostrarLista();
		System.out.println("\nTamanho da lista: " + lista.tamanho());
	}

}
