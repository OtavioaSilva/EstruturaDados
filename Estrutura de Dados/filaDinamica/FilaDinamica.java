package filaDinamica;


public class FilaDinamica implements FilaDinamicaInterface{
	
	No inicio = null;
	No fim = null;
	
	public void inserir(int valor) {
		No p = new No();
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
		No aux = inicio;
		while(aux != null) {
			System.out.print(aux.getDado() + " ");
			aux = aux.getProximo();
		}
		
	}
	
	public int excluir() {
		No aux = inicio;
		if (inicio == fim && inicio != null) {
			inicio = null;
			fim = null;
		}
		else {
			inicio = inicio.getProximo();
		}
		return aux.getDado();
	}
	
	public int consultarPrimeiro() { // consulta o primeiro da lista
		int valor = 0;
		if (inicio == null) {
			System.out.println("Fila vazia.");
		}
		else {
			valor = inicio.getDado();
			
		}
		return valor;
	}
	
	public int consultarUltimo() {
		int valor = 0;
		if (inicio == null) {
			System.out.println("Fila vazia.");
		}
		else {
			valor = fim.getDado();
		}
		return valor;
	}
}
	


