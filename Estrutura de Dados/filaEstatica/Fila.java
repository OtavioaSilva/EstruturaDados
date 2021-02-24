package filaEstatica;

public class Fila implements FilaEstaticaInterface{
	
	private int[] valores;
	private int primeiro;
	private int ultimo;
	private int total;
	
	public Fila() {
		valores = new int[10];
		primeiro = 0;
		ultimo = 0;
		total = 0;
	}
	
	public void inserir(int elemento) {
		if (isFull()) {
			throw new RuntimeException("Fila está cheia! Não é mais possível inserir.");
		}
		valores[ultimo] = elemento;
		ultimo = (ultimo + 1) % valores.length;
		total++;
	}
	
	public int retirar() {
		if (isEmpty()) {
			throw new RuntimeException("Fila está vazia! Ninguem para ser retirado!");
		}
		int elemento = valores[primeiro];
		primeiro = (primeiro + 1) % valores.length;
		total--;
		return elemento;
	}
	
	
		
	
	public int consulta(int indice) { //Indice é a posição no qual o usuário quer consultar
		return valores[indice];
	}
	public int consultaPrimeiro() { //Indice é a posição no qual o usuário quer consultar
		if (isEmpty()) {
			System.out.println("Fila vazia, não foi possivel consultar o primeiro");
		}
		else {
			return valores[primeiro];
		}
		return 1;
		
	}
	
	
	public boolean isEmpty() {
		return total == 0;
		
	}
	
	public boolean isFull() {
		return total == valores.length;
		
	}

}
