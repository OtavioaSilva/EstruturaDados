package pilhaEstatica;

import java.util.Scanner;
public class PilhaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PilhaInterface pi = new Pilha();
		Scanner sc = new Scanner(System.in);
		int opcMenu;
		do {
			System.out.println(""); // Menu da Pilha Estatica
			System.out.println("---------- Menu Pilha Dinamica ------------");
			System.out.println("1- Push");
			System.out.println("2- Pop");
			System.out.println("3- Top");
			System.out.println("0- Sair.");
			System.out.println("Escolha a sua opção");
			 opcMenu = sc.nextInt();
			switch(opcMenu) {
			case 1:
				System.out.println("Digite o valor que deseja inserir no inicio da lista: ");
				int dado = sc.nextInt();
				pi.push(dado);
				break;
			case 2:
				System.out.println("Desempilhei: " + pi.pop());
				break;
			case 3:
				System.out.println("O topo atual da pilha é: " + pi.top());
				break;
			case 0:
				System.out.println("Fim do programa.");
				break;
			}
			}while (opcMenu != 0);
		
		
		pi.push(5);
		pi.push(4);
		pi.push(3);
		pi.push(2);
		pi.push(1);
		pi.push(7);
		pi.push(8);	
		System.out.println("O valor do topo: " + pi.top()); // mostra o topo da pilha
		pi.push(11);
		System.out.println("O valor do top: " + pi.top());
		System.out.println("Desimpilhei : " + pi.pop());	
		
		System.out.println("O valor do top: " + pi.top());
		while (!pi.isEmpty()) {
			int elemento = pi.pop();
			System.out.println("Desempilhei " + elemento);
		}
		
		int e = pi.pop(); //Pop após todas terem sido desempilhadas e irá exibir o runtime exception dizendo pilha vazia.
		
	}

}
