package listaCircularSimples;
import java.util.Scanner;

public class ListaCircular implements ListaCircularInterface{
	Scanner sc = new Scanner(System.in);
	No primeiro;
	No ultimo;
	public int tamanho;
	
	public ListaCircular() {
		primeiro = null;
		ultimo = null;
	}
	
	public void inserirFim(int valor) {
		No novo = new No();
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
	
	public void inserirInicio(int valor) {
		No novo = new No();
		novo.dado = valor;
		if (primeiro == null) {
			primeiro = novo;
			ultimo = novo;
			novo.proximo = primeiro;
		}
		else {
			No aux = primeiro;
			novo.proximo = aux;
			primeiro = novo;
			ultimo.proximo = primeiro;
		}
		tamanho++;
	}
	
	public void inserirMeio(int valor) {
		No novo = new No();
		novo.dado = valor;
		if (primeiro == null) {
			primeiro = novo;
			ultimo = novo;
			novo.proximo = primeiro;
		}
		else {
			No aux, atual;
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
		No atual = new No();
		atual = primeiro;
		do {
			System.out.print(" " + atual.dado);
			atual = atual.proximo;
		}while(atual != primeiro);
	}
	
	public void buscar(int valor) {
		No atual = new No();
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
	
	public void modificarValor(int valor) {
		No atual = new No();
		atual = primeiro;
		do {
			if (atual.dado == valor) {
				System.out.println("Insira o novo dado para este valor");
				atual.dado = sc.nextInt();
			}
			atual = atual.proximo;
		}while(atual != primeiro);
	}
	
	public void excluir(int valor) {
		No atual = new No();
		No anterior = new No();
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
