package listaCircularSimplesString;

import java.util.Scanner;

public class ListaCircularString implements ListaCircularStringInterface{

	Scanner sc = new Scanner(System.in);
	NoString primeiro;
	NoString ultimo;
	public int tamanho;
	
	public ListaCircularString() {
		primeiro = null;
		ultimo = null;
	}
	
	public void inserirFim(String valor) {
		NoString novo = new NoString();
		novo.dado = valor;
		if (primeiro == null) {
			primeiro = novo;
			ultimo = primeiro;
			primeiro.proximo = ultimo;
		}
		else {
			ultimo.proximo = novo;
			novo.proximo = primeiro;
			ultimo = novo;
		}
		tamanho++;
	}
	
	public void inserirInicio(String valor) {
		NoString novo = new NoString();
		novo.dado = valor;
		if (primeiro == null) {
			primeiro = novo;
			ultimo = novo;
			novo.proximo = primeiro;
		}
		else {
			NoString aux = primeiro;
			novo.proximo = aux;
			primeiro = novo;
			ultimo.proximo = primeiro;
		}
		tamanho++;
	}
	
	public void inserirMeio(String valor) {
		NoString novo = new NoString();
		novo.dado = valor;
		if (primeiro == null) {
			primeiro = novo;
			ultimo = novo;
			novo.proximo = primeiro;
		}
		else {
			NoString aux, atual;
			int count = (tamanho % 2 == 0) ? (tamanho/2) : ((tamanho+1) /2);
			aux = primeiro;
			atual = null;
			for(int i = 0; i < count;i++) {
				atual = aux;
				aux = aux.proximo;
			}
			
			atual.proximo = novo;
			novo.proximo = aux;
			
		}
		tamanho++;
	}
	
	
	public void mostrarLista() {
		NoString atual = new NoString();
		atual = primeiro;
		do {
			System.out.print(" " + atual.dado);
			atual = atual.proximo;
		}while(atual != primeiro);
	}
	
	public void buscar(String valor) {
		NoString atual = new NoString();
		atual = primeiro;
		boolean encontrado = false;
		do {
			if (atual.dado == valor) {
				encontrado = true;
			}
			atual = atual.proximo;
		}while(atual != primeiro);
		
		if (encontrado == true) {
			System.out.println("Valor encontrado");
		} else {
			System.out.println("Valor não encontrado.");
		}
	}
	
	public void modificarValor(String valor) {
		NoString atual = new NoString();
		atual = primeiro;
		do {
			if (atual.dado == valor) {
				System.out.println("Insira o novo dado para este valor");
				atual.dado = sc.next();
			}
			atual = atual.proximo;
		}while(atual != primeiro);
	}
	
	public void excluir(String valor) {
		NoString atual = new NoString();
		NoString anterior = new NoString();
		atual = primeiro;
		anterior = ultimo;
		
		do {
			if (atual.dado == valor) {
				if(atual == primeiro) {
					primeiro = primeiro.proximo;
					ultimo.proximo = primeiro;
				}
				else if (atual == ultimo) {
					anterior.proximo = ultimo.proximo;
					ultimo = anterior;
				}
				else if (atual == primeiro && primeiro == ultimo) {
					primeiro = null;
					ultimo = null;
					anterior = null;
				}
				else {
					anterior.proximo = atual.proximo;
				}
			}
			
			anterior = atual;
			atual = atual.proximo;
		}while(atual != primeiro);
		tamanho--;
	}
	
	public int tamanho() {
		return tamanho;
	}
	
	public boolean isEmpty() {
		if (primeiro == null) {
			System.out.print("A Lista está vazia?:");
			return true;
			
		}
		System.out.print("A Lista está vazia?: ");
		return false;
		
		
	}
}
