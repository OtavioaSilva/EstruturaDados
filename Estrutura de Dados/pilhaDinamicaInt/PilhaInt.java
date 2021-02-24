package pilhaDinamicaInt;


public class PilhaInt {

	private int valor;
	private PilhaInt prox;
	
	public PilhaInt() {
		
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public PilhaInt getProx() {
		return prox;
	}

	public void setProx(PilhaInt prox) {
		this.prox = prox;
	}
	
}
