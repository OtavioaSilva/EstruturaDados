package buscaSequencial;
import java.util.Scanner;


public class BuscaSequencialeBinariaMain {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		BuscaSequencialeBinariaInterface bsb = new BuscaSequencialeBinaria();
		System.out.println("------------------ Busca Sequencial ---------------");
		System.out.println("Posição do elemento 23 = " + bsb.buscaSequencial(23));
		System.out.println("Posição do elemento 8 = " + bsb.buscaSequencial(8));
		System.out.println("Posição do elemento 76 = " + bsb.buscaSequencial(76));
		System.out.println("Posição do elemento 99 = " + bsb.buscaSequencial(99)); // 99 não existe no vetor então vai retornar -1
		System.out.println("Digite um valor para pesquisar sequencialmente: ");
		int valor = sc.nextInt();
		System.out.println("Posição do elemento " +  valor + "\n" + bsb.buscaSequencial(valor));
		
		
		System.out.println("\n\n");
		
		System.out.println("------------------- Busca Binária ------------------");
		System.out.println("Posição do elemento 23 = " + bsb.buscaBinaria(23));
		System.out.println("Posição do elemento 8 = " + bsb.buscaBinaria(8));
		System.out.println("Posição do elemento 76 = " + bsb.buscaBinaria(76));
		System.out.println("Posição do elemento 99 = " + bsb.buscaBinaria(99)); // 99 não existe no vetor então vai retornar -1
		System.out.println("------------------ Busca Ordenada -----------------");
		System.out.println("Posição do elemento 23 = " + bsb.buscaSequencialOrdenada(23));
		System.out.println("Posição do elemento 8 = " + bsb.buscaSequencialOrdenada(8));
		System.out.println("Posição do elemento 76 = " + bsb.buscaSequencialOrdenada(76));
		System.out.println("Posição do elemento 99 = " + bsb.buscaSequencialOrdenada(99)); // 99 não existe no vetor então vai retornar -1
	}

}
