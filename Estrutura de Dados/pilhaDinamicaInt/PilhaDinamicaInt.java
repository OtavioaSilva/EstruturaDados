package pilhaDinamicaInt;

public class PilhaDinamicaInt implements PilhaDinamicaIntInterface {
	private PilhaInt topo;
	private PilhaInt fundo;
	private int tamanhoPilha;
	
	public PilhaDinamicaInt() {
		topo = null;
		fundo = null;
		tamanhoPilha = 0;
	}
	
	public int getTamanhoPilha() {
		return tamanhoPilha;
	}
	
	public void push(int valor) { // Metodo Push
		if (fundo == null) {
		topo = new PilhaInt();
		fundo = topo;
		PilhaInt novaPilha = new PilhaInt();
		novaPilha.setValor(valor);
		novaPilha.setProx(topo);
		topo = novaPilha;
		tamanhoPilha++;
		}
		else {
			PilhaInt novaPilha = new PilhaInt();
			novaPilha.setValor(valor);
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
		PilhaInt percorre = topo;
		while(percorre.getProx() != null) {
			System.out.println(percorre.getValor());
			percorre = percorre.getProx();		
			}
			}
	
		else {
			System.out.println("A pilha está vázia.");
	}
}
	
	public int top() { // 
		if (tamanhoPilha ==0) {
			System.out.println("A pilha está vázia.");
		}
		
		return topo.getValor();

		}
}

