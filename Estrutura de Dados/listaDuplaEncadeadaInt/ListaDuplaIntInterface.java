package listaDuplaEncadeadaInt;

public interface ListaDuplaIntInterface {
	
	public void inserirInicio(int info);
	public void inserirFim(int info);
	public int retirarFim();
	public int retirarInicio();
	public void inserirMeio(int indice, int info);
	public int retirarMeio(int indice);
	public String toString();
	public void isEmpty();
}
