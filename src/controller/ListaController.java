package controller;

import br.com.kauanpaulino.listaint.listaint;
import br.com.kauanpaulino.quicksort.QuickSort;

public class ListaController {

	public listaint Geralista(listaint lista) {
		lista.addFirst(3);
		try {
			lista.addLast(5);
			lista.addLast(8);
			lista.addLast(12);
			lista.addLast(9);
			lista.addLast(7);
			lista.addLast(6);
			lista.addLast(2);
			lista.addLast(3);
			lista.addLast(7);
			lista.addLast(16);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	public void MaioresValor(listaint lista) {
		QuickSort qk = new QuickSort();
		int tamanho=lista.size();
		int[] vt = new int[tamanho];
		for(int i=0;i<tamanho;i++) {
			int valor;
			try {
				valor = lista.get(i);
				vt[i]=valor;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//ordena
		vt=qk.quicksort(vt, 0, tamanho-1);
		System.out.println("O maior valor é: " + vt[tamanho-1] + " \nO segundo maior: " +vt[tamanho-2]);
		
	}
	
}
