package view;

import br.com.kauanpaulino.listaint.listaint;
import controller.ListaController;

public class main {

	public static void main(String[] args) {
		listaint lista = new listaint();
		ListaController l =new ListaController();
		
		lista=l.Geralista(lista);
		l.MaioresValor(lista);
	}

}
