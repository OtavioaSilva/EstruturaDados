package filaEstaticaString;

import java.util.Scanner;


public class FilaEstaticaStringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		FilaEstaticaStringInterface fila = new FilaString();
		
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
				String dado = sc.next();
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
		fila.inserir("João");
		fila.inserir("Maria");
		fila.inserir("Pedro");
		fila.inserir("Bruno");
		fila.inserir("Ricardo");
		fila.inserir("Roger");
		System.out.println("O primeiro da fila é: " + fila.consultaPrimeiro());
		System.out.println("O elemento da posição é: " + fila.consulta(3));
		
		while (!fila.isEmpty()) {
			String x = fila.retirar();
			System.out.println("Retirei o elemento: " + x);
		}
		System.out.println(fila.consultaPrimeiro()); // tentando consultar o primeiro, mas a lista está vazia
		String y = fila.retirar(); // vai tentar retirar após ter retirado tudo e ativar o isEmpty()
	}

}
