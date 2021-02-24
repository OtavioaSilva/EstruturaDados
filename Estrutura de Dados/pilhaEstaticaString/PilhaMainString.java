package pilhaEstaticaString;

import java.util.Scanner;

public class PilhaMainString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PilhaStringInterface pi = new PilhaString();
		Scanner sc = new Scanner(System.in);
		int opcMenu;

		do {
			System.out.println(""); // Menu da Pilha Dinamica
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
				String dado = sc.next();
				pi.push(dado);
				break;
			case 2:
				pi.pop();
				break;
			case 3:
				System.out.println("O topo atual da pilha é: " + pi.top());
				break;
			case 0:
				System.out.println("Fim do programa.");
				break;
			}
			}while (opcMenu != 0);
		
		pi.push("Maradona");
		pi.push("Pele");
		pi.push("Rogerio");
		pi.push("Marta");
		pi.push("Bruno");
		pi.push("Pedro");
		pi.push("João");	

		System.out.println("O valor do topo: " + pi.top()); // mostra o topo da pilha
		pi.push("Creber");
		System.out.println("O valor do top: " + pi.top());
		System.out.println("Desimpilhei : " + pi.pop());	
		
		System.out.println("O valor do top: " + pi.top());
		while (!pi.isEmpty()) {
			String elemento = pi.pop();
			System.out.println("Desempilhei " + elemento);
		}
		
		String e = pi.pop(); //Pop após todas terem sido desempilhadas e irá exibir o runtime exception dizendo pilha vazia.
		
	}

	}


