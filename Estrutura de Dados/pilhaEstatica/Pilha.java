package pilhaEstatica;

public class Pilha implements PilhaInterface{
	int elementos[];
	int topo;
	
	public Pilha() {
		elementos = new int[10];
		topo = -1; // Posição invalida do vetor;
	}

	public void push(int e) {
		if (isFull()) {
			throw new RuntimeException("Pilha está Cheia!");
		}
		topo++;
		elementos[topo] = e;
	}
	
	public int pop() {
		if (isEmpty()) {
			throw new RuntimeException("Pilha Vazia!");
		}
		int e;
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
	public int top() {
		if (isEmpty()) {
			throw new RuntimeException("Pilha Vazia!");
		}
		return elementos[topo];
		
	}
}
