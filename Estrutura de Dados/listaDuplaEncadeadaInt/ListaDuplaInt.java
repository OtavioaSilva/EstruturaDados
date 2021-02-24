package listaDuplaEncadeadaInt;


public class ListaDuplaInt implements ListaDuplaIntInterface{
	NoInt inicio;
	NoInt fim;
	int tamanho;
	
	
	public void inserirInicio(int info) {
		NoInt no = new NoInt();
		no.info = info;
		no.anterior = null;
		no.proximo = inicio;
		if (inicio != null) {
			inicio.anterior = no;
		}
		
		inicio = no;
		if(tamanho == 0) {
			fim = inicio;
		}
		tamanho ++;
	}
	
	public int retirarInicio() {
		if (inicio == null) {
			return (Integer) null;
		}
		int out = inicio.info;
		inicio = inicio.proximo;
		if (inicio != null) {
			inicio.anterior = null;
		}
		else {
			fim = null;
		}
		tamanho--;
		return out;
	}
	
	public void inserirFim(int info) {
		NoInt no = new NoInt();
		no.info = info;
		no.proximo = null;
		no.anterior = fim;
		if (fim != null) {
			fim.proximo = no;
		}
		fim = no;
		if (tamanho == 0) {
			inicio = fim;
		}
		tamanho++;
	}
	
	public int retirarFim() {
		if (fim == null) {
			return (Integer) null;
		}
		int out = fim.info;
		fim = fim.anterior;
		if (fim != null) {
			fim.proximo = null;
		} else {
			inicio = null;
		}
		tamanho--;
		return out;
		
	}
	
	public void inserirMeio(int indice, int info) {
		if (indice <= 0) {
			inserirInicio(info);
		}
		else if (indice >= tamanho) {
			inserirFim(info);
		} else {
			NoInt local = inicio;
			for (int i = 0; i < indice-1; i++) {
				local = local.proximo;
			}
			NoInt no = new NoInt();
			no.info = info;
			no.anterior = local;
			no.proximo = local.proximo;
			local.proximo = no;
			no.proximo.anterior = no;
			tamanho++;
			
		}
	}
		
		public int retirarMeio(int indice) {
			if (indice < 0 
					|| indice >= tamanho
					|| inicio == null) {	
				return (Integer) null;
			} else if(indice == 0) {
				return retirarInicio();
			} else if(indice == tamanho - 1) {
				return retirarFim();
			}
			NoInt local = inicio;
			for (int i = 0; i < indice; i++) {
				local = local.proximo;
			}
			if (local.anterior != null) {
				local.anterior.proximo = local.proximo;
			}
			if (local.proximo != null) {
				local.proximo.anterior = local.anterior;
			}
			tamanho --;
			return local.info;
			
		}
		
		public String toString() {
			String str ="(" + tamanho + ") "; // mostra o tamanho da lista na listagem
			NoInt local = inicio;
			while (local != null) {
				str+= local.info + " ";
				local = local.proximo;
			}
			return str;
		}
		
		public void isEmpty() {
			if (fim == null) {
				System.out.println("Lista está vazia.");
			}
			else {
				System.out.println("Lista possui informação.");
			}
		}

		}
