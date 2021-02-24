package arvoreBinaria;

public class ArvoreMain {

	public static void main(String args[]) {
		Elemento ele = new Elemento(0);
		Arvore arvore = new Arvore(new Elemento(10));
		
		arvore.inserir(new Elemento(5));
		arvore.inserir(new Elemento(7));
		arvore.inserir(new Elemento(1));
		arvore.inserir(new Elemento(8));
		arvore.inserir(new Elemento(15));
		arvore.inserir(new Elemento(12));
		arvore.inserir(new Elemento(18));
		
		arvore.imprimirPreOrdem();
		System.out.println("");
		arvore.imprimirInOrdem();
		System.out.println("");
		arvore.imprimirPosOrdem();
		System.out.println("");
		
		
		ele.setValor(8);
		arvore = arvore.remover(ele);
		System.out.println("Nova arvore:...");
		arvore.imprimirInOrdem();
		System.out.println("");
		
		
		
		System.out.println("O elemento: 5" + (arvore.busca(5) ? " existe": " não existe"));
		System.out.println("O elemento: 8" + (arvore.busca(8) ? " existe": " não existe"));
		System.out.println("O elemento: 1" + (arvore.busca(1) ? " existe": " não existe"));
		System.out.println("O elemento: 34" + (arvore.busca(34) ? " existe": " não existe"));
		
	}

}
