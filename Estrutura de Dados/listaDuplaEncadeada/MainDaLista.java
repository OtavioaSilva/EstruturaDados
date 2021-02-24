package listaDuplaEncadeada;

import java.util.Scanner;

public class MainDaLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ListaInterface li = new ListaDupla();
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
						String dado = sc.next();
						li.inserirInicio(dado);
						break;
					case 2:
						System.out.println("Digite o valor que deseja inserir no meio da lista: ");
						String dadoMeio = sc.next();
						System.out.println("Digite a posição que deseja inserir no meio: ");
						int indice = sc.nextInt();
						li.inserirMeio(indice, dadoMeio);
						break;
					case 3:
						System.out.println("Digite o valor que deseja inserir no fim da lista: ");
						String dadoFim = sc.next();
						li.inserirFim(dadoFim);
						break;
					case 4:
						System.out.println("Retirando do Inicio: ");
						li.retirarInicio();
						break;
					case 5:
						System.out.println("Digite a posição que deseja retirar do meio");
						int posic = sc.nextInt();
						System.out.println("Retirando do meio: ");
						li.retirarMeio(posic);
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
		li.inserirInicio("a");
		li.isEmpty();
		li.inserirMeio(1, "b");
		li.inserirFim("b");
		li.inserirFim("h");
		li.inserirFim("i");
		li.retirarInicio();
		li.inserirInicio("z");
		li.inserirFim("j");
		li.retirarInicio();
		li.inserirFim("a");
		li.inserirMeio(3, "c");
		li.inserirFim("z");
		li.inserirInicio("x");
		li.inserirMeio(3, "l");
		li.retirarFim();
		
		System.out.println(li); // Mostra a lista

	}

}
