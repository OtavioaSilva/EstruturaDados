package pilhaDinamica;

public class PilhaDinamica implements PilhaDinamicaInterface {
	private Pilha topo;
	private Pilha fundo;
	private int tamanhoPilha;
	
	public PilhaDinamica() {
		topo = null;
		fundo = null;
		tamanhoPilha = 0;
	}
	
	public int getTamanhoPilha() {
		return tamanhoPilha;
	}
	
	public void push(String nomePessoa) { // Metodo Push
		if (fundo == null) {
		topo = new Pilha();
		fundo = topo;
		Pilha novaPilha = new Pilha();
		novaPilha.setNomePessoa(nomePessoa);
		novaPilha.setProx(topo);
		topo = novaPilha;
		tamanhoPilha++;
		}
		else {
			Pilha novaPilha = new Pilha();
			novaPilha.setNomePessoa(nomePessoa);
			novaPilha.setProx(topo);
			topo = novaPilha;
			tamanhoPilha++;
		}
	}
	
	public void pop() { //  Metodo Pop
		if (tamanhoPilha != 0) {
		topo = topo.getProx();
		tamanhoPilha--;
		}
		else {
			System.out.println("Pilha já está vázia");
		}
	}
	
	public void mostraPilha() {
		if (tamanhoPilha != 0) {
		Pilha percorre = topo;
		while(percorre.getProx() != null) {
			System.out.println(percorre.getNomePessoa());
			percorre = percorre.getProx();		
			}
			}
	
		else {
			System.out.println("A pilha está vázia.");
	}
}
	
	public String top() { // 
		if (tamanhoPilha ==0) {
			System.out.println("A pilha está vázia.");
		}
		
		return topo.getNomePessoa();
	}
	
}
