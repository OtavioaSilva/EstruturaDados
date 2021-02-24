package listaDuplaEncadeada;

public interface ListaInterface {
	

	public void inserirInicio(String info);
	
	public String retirarInicio();
	
	public void inserirFim(String info);
	
	public String retirarFim();
	
	public void inserirMeio(int indice, String info);
	
	public String retirarMeio(int indice);
	
	public String toString();
	public void isEmpty();
	
	
	

}

	
