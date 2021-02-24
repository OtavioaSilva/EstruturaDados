package filaEstatica;

import java.util.Scanner;
public class FilaEstaticaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FilaEstaticaInterface fila = new Fila();
		Scanner sc = new Scanner(System.in);
		int opcMenu;
		
		do {
			System.out.println(""); // Menu de fila Estatica
			System.out.println("---------- Menu Fila Estatica ------------");
			System.out.println("1- Inserir");
			System.out.println("2- Remover");
			System.out.println("3- Consultar o primeiro da fila");
			System.out.println("0- Sair.");
			System.out.println("Escolha a sua opção");
			 opcMenu = sc.nextInt();
			switch(opcMenu) {
			case 1:
				System.out.println("Digite o valor que deseja inserir na fila: ");
				int dado = sc.nextInt();
				fila.inserir(dado);
				break;
			case 2:
				System.out.println("Removendo da fila: " + fila.retirar());
				break;
			case 3:
				System.out.println("O primeiro da fila: " + fila.consultaPrimeiro());
				System.out.println("");
				break;
			case 0:
				System.out.println("Fim do programa.");
				break;
			}
			}while (opcMenu != 0);
		
		fila.inserir(66);
		fila.inserir(5);
		fila.inserir(1);
		fila.inserir(2);
		fila.inserir(3);
		fila.inserir(4);
		System.out.println("O primeiro da fila é: " + fila.consultaPrimeiro());
		System.out.println("O elemento da posição é: " + fila.consulta(3));
		
		while (!fila.isEmpty()) {
			int x = fila.retirar();
			System.out.println("Retirei o elemento: " + x);
		}
		System.out.println(fila.consultaPrimeiro()); // tentando consultar o primeiro, mas a lista está vazia
		int y = fila.retirar(); // vai tentar retirar após ter retirado tudo e ativar o isEmpty()
		
	}

}
