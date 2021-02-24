package listaEncadeadaWagner;

public class ListaDinamica implements ListaSimplesInterface{
	Lista Primeiro;
	Lista Ultimo;
	int Tamanho = 0;
	
	public ListaDinamica() {
		Primeiro = null;
		Ultimo = Primeiro;
	}
	
	public void add(String Nome){
		if(Primeiro == null) {
			Primeiro = new Lista();
			Ultimo = Primeiro;
			Lista Novo = new Lista();
			Novo.setNome(Nome);
			Novo.setProx(null);
			Ultimo.setProx(Novo);
			Ultimo = Novo;
			Tamanho++;
		}
		else {
			Lista Novo = new Lista();
			Novo.setNome(Nome);
			Novo.setProx(null);
			Ultimo.setProx(Novo);
			Ultimo = Novo;
			Tamanho++;
		}
	}
	
	public void removeItem(String NomeParaRemover) {
		Lista Remove = Primeiro.getProx();
		Lista Sentinela = Primeiro;
		if(!(Primeiro == null)) {
		while(Remove != null) {
			if (Remove.getNome().equals(NomeParaRemover)) {
				if (Remove.getProx() == null) { //IF que remove se for o ultimo
					Ultimo = Sentinela;
					Ultimo.setProx(null);
					Remove = null;
					Tamanho--;
					break;
				} else {
					Sentinela.setProx(Remove.getProx());
					Remove.setProx(null);
					Remove = null;
					Tamanho--;
					break;
				}
			}
			Remove = Remove.getProx();
			Sentinela = Sentinela.getProx();
		}
		System.gc();
	}
	}
	public void isEmpty() {
		if (Primeiro == null) {
			System.out.println("A lista está vazia.");
		}
		else {
			System.out.println("A lista não está vazia.");
		}
	}


public void imprimeLista() {
	Lista Percorre = Primeiro.getProx();
	while(Percorre != null) {
		System.out.println(Percorre.getNome());
		Percorre = Percorre.getProx();
	}
}




}



