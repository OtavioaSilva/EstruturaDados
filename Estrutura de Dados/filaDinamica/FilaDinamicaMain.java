package filaDinamica;

import java.util.Scanner;
public class FilaDinamicaMain {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	FilaDinamicaInterface fila = new FilaDinamica();
	int opcMenu;
	
	do {
	System.out.println(""); // Menu de fila Dinamica
	System.out.println("---------- Menu Fila Dinamica ------------");
	System.out.println("1- Inserir");
	System.out.println("2- Remover");
	System.out.println("3- Listar");
	System.out.println("4- Consultar o primeiro da fila");
	System.out.println("5- Consultar o final da fila");
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
		System.out.println("Removendo da fila: " + fila.excluir());
		break;
	case 3:
		System.out.print("Listando a Fila: ");
		fila.listar();
		System.out.println(" ");
		break;
	case 4:
		System.out.println("O primeiro da fila: " + fila.consultarPrimeiro());
		System.out.println("");
		break;
	case 5:
		System.out.println("O ultimo da fila é: " + fila.consultarUltimo());
		break;
	case 0:
		System.out.println("Fim do programa.");
		break;
	}
	}while (opcMenu != 0);
	
	
	fila.inserir(1);
	fila.inserir(55);
	fila.inserir(3);
	fila.inserir(5);
	fila.listar();
	System.out.println("");
	System.out.println("O primeiro da fila: " + fila.consultarPrimeiro());
	System.out.println("Dado excluido: " + fila.excluir());
	System.out.println("");
	fila.listar();
	System.out.println("");
	System.out.println("O primeiro da fila: " + fila.consultarPrimeiro());
	
	

}
}
