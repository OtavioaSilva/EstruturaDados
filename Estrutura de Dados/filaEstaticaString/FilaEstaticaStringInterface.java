package filaEstaticaString;

public interface FilaEstaticaStringInterface {
	public void inserir(String elemento);
	public String retirar();
	public String consulta(int indice);
	public String consultaPrimeiro();
	public boolean isEmpty();
	public boolean isFull();
}
