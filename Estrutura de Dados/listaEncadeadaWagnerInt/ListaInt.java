package listaEncadeadaWagnerInt;


public class ListaInt {
	
	private int valor;
	private ListaInt Prox;
	
	public ListaInt() {
		
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public ListaInt getProx() {
		return Prox;
	}

	public void setProx(ListaInt prox) {
		Prox = prox;
	}
}
