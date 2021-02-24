package listaDuplaEncadeadaInt;

import java.util.Scanner;

public class ListaDuplaIntMain {
	
	public static void main(String[] args) {
	ListaDuplaIntInterface li = new ListaDuplaInt();
	// --------------------------------------------- MENU \/ ------------------------------------------------
	Scanner sc = new Scanner(System.in);
	int opcMenu;
	
	do {
		System.out.println(""); // Menu da Lista
		System.out.println("---------- Menu Lista DuplaEncadeada ------------");
		System.out.println("1- Inserir Inicio");
		System.out.println("2- Inserir no Meio");
		System.out.println("3- Inserir no Fim");
		System.out.println("4- Retirar do Inicio");
		System.out.println("5- Retirar do Meio");
		System.out.println("6- Retirar do Fim");
		System.out.println("7- Listar a Lista Dupla");
		System.out.println("8- Verificar se a lista está vazia.");
		System.out.println("0- Sair.");
		System.out.println("Escolha a sua opção");
		 opcMenu = sc.nextInt();
		switch(opcMenu) {
		case 1:
			System.out.println("Digite o valor que deseja inserir no inicio da lista: ");
			int dado = sc.nextInt();
			li.inserirInicio(dado);
			break;
		case 2:
			System.out.println("Digite o valor que deseja inserir no meio da lista: ");
			int dadoMeio = sc.nextInt();
			System.out.println("Digite a posição que deseja inserir no meio: ");
			int indice = sc.nextInt();
			li.inserirMeio(indice, dadoMeio);
			break;
		case 3:
			System.out.println("Digite o valor que deseja inserir no fim da lista: ");
			int dadoFim = sc.nextInt();
			li.inserirFim(dadoFim);
			break;
		case 4:
			System.out.println("Retirando do Inicio: ");
			li.retirarInicio();
			break;
		case 5:
			System.out.println("Digite a posição que deseja retirar do meio");
			int removerMeio = sc.nextInt();
			System.out.println("Retirando do meio: ");
			li.retirarMeio(removerMeio);
			break;
		case 6:
			System.out.println("Retirando do fim: ");
			li.retirarFim();
			break;
		case 7:
			System.out.println("Listando a lista circular");
			System.out.println(li);
			break;
		case 8:
			li.isEmpty();
			break;
		case 0:
			System.out.println("Fim do programa.");
			break;
		}
		}while (opcMenu != 0);
			// ------------------------------------ MENU /\ ----------------------------------------------------------------W
	
	li.isEmpty();
	li.inserirInicio(4);
	li.isEmpty();
	li.inserirFim(67);
	li.inserirMeio(1, 7);
	li.inserirFim(55);
	li.inserirFim(5);
	li.inserirFim(3);
	li.retirarInicio();
	li.inserirInicio(8);
	li.inserirFim(12);
	li.retirarInicio();
	li.inserirFim(15);
	li.inserirMeio(3, 2);
	li.inserirFim(43);
	li.inserirInicio(21);
	li.inserirMeio(3, 78);
	li.retirarFim();
	
	System.out.println(li); // Mostra a lista
	
	
}
}

