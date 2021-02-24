package filaEstatica;

public interface FilaEstaticaInterface {
	
	public void inserir(int elemento);
	
	public int retirar();
	
	public boolean isEmpty();

	
	public boolean isFull();
	public int consulta(int indice);
	public int consultaPrimeiro();
}
