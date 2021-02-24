package pesquisaBinaria;

public class PesquisaBinariaMain {

	public static void main(String[] args) {
		
		PesquisaBinariaInterface pbi = new PesquisaBinaria();
		System.out.println("------------------- Busca Binária ------------------");
		System.out.println("Posição do elemento 23 = " + pbi.pesquisaBinaria(23));
		System.out.println("Posição do elemento 8 = " + pbi.pesquisaBinaria(8));
		System.out.println("Posição do elemento 76 = " + pbi.pesquisaBinaria(76));
		System.out.println("Posição do elemento 99 = " + pbi.pesquisaBinaria(99)); // 99 não existe no vetor então vai retornar -1

	}

}
