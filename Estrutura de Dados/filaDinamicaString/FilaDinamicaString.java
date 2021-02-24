package filaDinamicaString;


public class FilaDinamicaString implements FilaDinamicaStringInterface{
	
	NoString inicio = null;
	NoString fim = null;
	
	public void inserir(String valor) {
		NoString p = new NoString();
		p.setDado(valor);
		if (inicio == null) {
			inicio = p;
			fim = p;
			p.setProximo(null);
		}
		else {
			fim.setProximo(p);
			p.setProximo(null);
			fim = p;
		}
	}
	public void listar() {
		NoString aux = inicio;
		while(aux != null) {
			System.out.print(aux.getDado() + " ");
			aux = aux.getProximo();
		}
		
	}
	
	public String excluir() {
		NoString aux = inicio;
		if (inicio == fim && inicio != null) {
			inicio = null;
			fim = null;
		}
		else {
			inicio = inicio.getProximo();
		}
		return aux.getDado();
	}
	
	public String consultar() { // consulta o primeiro da lista
		String valor = null;
		if (inicio == null) {
			System.out.println("Filha vazia.");
		}
		else {
			valor = inicio.getDado();
			
		}
		return valor;
	}
}

