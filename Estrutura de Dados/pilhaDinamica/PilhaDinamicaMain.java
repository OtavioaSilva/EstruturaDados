package pilhaDinamica;

import java.util.Scanner;

public class PilhaDinamicaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PilhaDinamicaInterface pd = new PilhaDinamica();
		Scanner sc = new Scanner(System.in);
		int opcMenu;
		
		do {
			System.out.println(""); // Menu da Pilha Dinamica
			System.out.println("---------- Menu Pilha Dinamica ------------");
			System.out.println("1- Push");
			System.out.println("2- Pop");
			System.out.println("3- Top");
			System.out.println("4- Mostrar Pilha");
			System.out.println("0- Sair.");
			System.out.println("Escolha a sua opção");
			 opcMenu = sc.nextInt();
			switch(opcMenu) {
			case 1:
				System.out.println("Digite o valor que deseja inserir no inicio da lista: ");
				String dado = sc.next();
				pd.push(dado);
				break;
			case 2:
				pd.pop();
				break;
			case 3:
				System.out.println("O topo atual da pilha é: " + pd.top());
				break;
			case 4:
				System.out.println("Mostrando a pilha: ");
				pd.mostraPilha();
			case 0:
				System.out.println("Fim do programa.");
				break;
			}
			}while (opcMenu != 0);
		
		
		pd.push("Reginaldo");
		pd.push("Roberto");
		pd.push("Ramalho");
		pd.push("Brunelho");
		pd.push("Enzo");
		pd.mostraPilha();
		System.out.println("O topo da pilha atual é: " + pd.top());
		System.out.println(pd.getTamanhoPilha());
		pd.pop();
		System.out.println("");
		pd.mostraPilha();
		System.out.println("O topo da pilha atual é: " + pd.top());
		System.out.println(pd.getTamanhoPilha());
		pd.pop();
		System.out.println("");
		pd.mostraPilha();
		System.out.println(pd.getTamanhoPilha());
		pd.pop();
		System.out.println("");
		pd.mostraPilha();
		System.out.println(pd.getTamanhoPilha());
		pd.pop();
		System.out.println("");
		pd.mostraPilha();
		System.out.println(pd.getTamanhoPilha());
		pd.pop();
		System.out.println("");
		pd.mostraPilha();
		System.out.println(pd.getTamanhoPilha());
		System.out.println("");
		pd.push("Camaleão");
		pd.push("Rubbem");
		pd.push("Ramalho");
		pd.mostraPilha();
		System.out.println(pd.getTamanhoPilha());
		System.out.println("O topo da pilha atual é: " + pd.top());
		
		

	}

}
