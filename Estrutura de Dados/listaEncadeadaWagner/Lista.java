package listaEncadeadaWagner;

public class Lista {
	
	private String nome;
	private Lista Prox;
	
	public Lista() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Lista getProx() {
		return Prox;
	}

	public void setProx(Lista prox) {
		Prox = prox;
	}
	
	
}
