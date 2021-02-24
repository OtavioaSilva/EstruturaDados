package filaEstaticaString;

public class FilaString implements FilaEstaticaStringInterface{
	private String[] valores;
	private int primeiro;
	private int ultimo;
	private int total;
	
	public FilaString() {
		valores = new String[10];
		primeiro = 0;
		ultimo = 0;
		total = 0;
	}
	
	public void inserir(String elemento) {
		if (isFull()) {
			throw new RuntimeException("Fila est� cheia! N�o � mais poss�vel inserir.");
		}
		valores[ultimo] = elemento;
		ultimo = (ultimo + 1) % valores.length;
		total++;
	}
	
	public String retirar() {
		if (isEmpty()) {
			throw new RuntimeException("Fila est� vazia! Ninguem para ser retirado!");
		}
		String elemento = valores[primeiro];
		primeiro = (primeiro + 1) % valores.length;
		total--;
		return elemento;
	}
	
	public String consulta(int indice) { //Indice � a posi��o no qual o usu�rio quer consultar
		return valores[indice];
	}
	public String consultaPrimeiro() { //Indice � a posi��o no qual o usu�rio quer consultar
		if (isEmpty()) {
			System.out.println("Fila vazia, n�o foi possivel consultar o primeiro");
		}
		else {
			return valores[primeiro];
		}
		return null;
		
	}
	
	
	public boolean isEmpty() {
		return total == 0;
		
	}
	
	public boolean isFull() {
		return total == valores.length;
		
	}

}

