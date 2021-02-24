package buscaSequencial;

import java.util.Arrays;

public class BuscaSequencialeBinaria implements BuscaSequencialeBinariaInterface{
	private int valores[] = {11, 8, 23, 27, 33, 43, 56, 76, 87, 96};
	
	public int buscaSequencial(int val) {
		int pos;
		for (pos = 0; pos < valores.length;pos++) {
			if (val == valores[pos]) {
				return pos;
			}
			
		}
		return -1;
	}
	public int buscaSequencialOrdenada(int val) {
		BuscaSequencialeBinaria.ordenar(valores); // Ordenando os arrays em ordem crescente
		int pos;
		for (pos = 0; pos < valores.length;pos++) {
			if (val == valores[pos]) {
				return pos;
			} else if (valores[pos] > val) {
				return -1;
			}
			
		}
		return -1;
	}
	
	public int buscaBinaria(int val) {
		
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
	
	public static void ordenar(int ordenarArray[]) {
		int aux;
		boolean controle;
	
		for(int i = 0; i < ordenarArray.length;++i) {
			controle = true;
			for(int j = 0; j<(ordenarArray.length - 1); ++j) {
				if (ordenarArray[j] > ordenarArray[j+1]) {
					aux = ordenarArray[j];
					ordenarArray[j] = ordenarArray[j+1];
					ordenarArray[j+1] = aux;
					controle = false;
				}
			}
			
			if (controle) {
				break;
			}
			System.out.println(Arrays.toString(ordenarArray));
		}
	}

}
