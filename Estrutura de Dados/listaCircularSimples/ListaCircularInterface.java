package listaCircularSimples;

public interface ListaCircularInterface {
	

	public void inserirFim(int valor);
	
	public void inserirInicio(int valor);
	
	public void inserirMeio(int valor);
	public void mostrarLista();
	
	public void buscar(int valor);
	public void modificarValor(int valor);
	
	public void excluir(int valor);
	public int tamanho();
	public boolean isEmpty();
}
