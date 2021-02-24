package pesquisaBinaria;

public class PesquisaBinaria implements PesquisaBinariaInterface{
private int valores[] = {11, 8, 23, 27, 33, 43, 56, 76, 87, 96};

public int pesquisaBinaria(int val) {
	
	int meio, inicio, fim;
	inicio = 0;
	fim = valores.length -1;
	
	while (inicio <= fim) {
		meio = (inicio + fim) / 2;
		//System.out.println("Debug - I:" + inicio + "F: "+ fim + " Meio: " + meio);
		if (valores[meio] == val) {
			return meio;
		}
		else if (valores[meio] < val) {
				inicio = meio+1;
			}
			else if (valores[meio] > val){
				fim = meio - 1;
			}
		}
		
	return -1;
}

}
