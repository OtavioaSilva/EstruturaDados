package pilhaEstaticaString;


public class PilhaString implements PilhaStringInterface{
	String elementos[];
	int topo;
	
	public PilhaString() {
		elementos = new String[10];
		topo = -1; // Posição invalida do vetor;
	}

	public void push(String e) {
		if (isFull()) {
			throw new RuntimeException("Pilha está Cheia!");
		}
		topo++;
		elementos[topo] = e;
	}
	
	public String pop() {
		if (isEmpty()) {
			throw new RuntimeException("Pilha Vazia!");
		}
		String e;
		e = elementos[topo];
		topo--;
		return e;
	}
	
	public boolean isEmpty() {
		return (topo == -1);
	
	}
	
	
	public boolean isFull() {
		return (topo == 9);
	}
	public String top() {
		if (isEmpty()) {
			throw new RuntimeException("Pilha Vazia!");
		}
		return elementos[topo];
		
	}

}
