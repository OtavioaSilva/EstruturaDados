package pilhaDinamica;

public class Pilha {
	
	private String nomePessoa;
	private Pilha prox;
	
	public Pilha() {
		
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public Pilha getProx() {
		return prox;
	}

	public void setProx(Pilha prox) {
		this.prox = prox;
	}
	

}
