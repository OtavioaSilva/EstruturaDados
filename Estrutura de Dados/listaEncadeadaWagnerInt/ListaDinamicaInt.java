package listaEncadeadaWagnerInt;



public class ListaDinamicaInt implements ListaSimplesIntInterface{
	ListaInt Primeiro;
	ListaInt Ultimo;
	int Tamanho = 0;
	
	public ListaDinamicaInt() {
		Primeiro = null;
		Ultimo = Primeiro;
	}
	
	public void add(int valor){
		if(Primeiro == null) {
			Primeiro = new ListaInt();
			Ultimo = Primeiro;
			ListaInt Novo = new ListaInt();
			Novo.setValor(valor);
			Novo.setProx(null);
			Ultimo.setProx(Novo);
			Ultimo = Novo;
			Tamanho++;
		}
		else {
			ListaInt Novo = new ListaInt();
			Novo.setValor(valor);
			Novo.setProx(null);
			Ultimo.setProx(Novo);
			Ultimo = Novo;
			Tamanho++;
		}
	}
	
	public void removeItem(int valor) {
		ListaInt Remove = Primeiro.getProx();
		ListaInt Sentinela = Primeiro;
		if(!(Primeiro == null)) {
		while(Remove != null) {
			if (Remove.getValor() == (valor)) {
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
	ListaInt Percorre = Primeiro.getProx();
	while(Percorre != null) {
		System.out.print(Percorre.getValor() + " ");
		Percorre = Percorre.getProx();
	}
}

}
