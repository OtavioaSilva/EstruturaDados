package pesquisaBinaria;

public class PesquisaBinariaMain {

	public static void main(String[] args) {
		
		PesquisaBinariaInterface pbi = new PesquisaBinaria();
		System.out.println("------------------- Busca Bin�ria ------------------");
		System.out.println("Posi��o do elemento 23 = " + pbi.pesquisaBinaria(23));
		System.out.println("Posi��o do elemento 8 = " + pbi.pesquisaBinaria(8));
		System.out.println("Posi��o do elemento 76 = " + pbi.pesquisaBinaria(76));
		System.out.println("Posi��o do elemento 99 = " + pbi.pesquisaBinaria(99)); // 99 n�o existe no vetor ent�o vai retornar -1

	}

}
