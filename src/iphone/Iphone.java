package iphone;

import iPod.ReprodutorMusical;
import internet.Internet;
import phone.Telefone;

public class Iphone implements ReprodutorMusical, Internet, Telefone {
	@Override
	public void exibirPagina() {
		System.out.println("Abrindo página com Opera");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Abrindo nova aba com Opera");
	}
	
	public void atualizarPagina() {
		System.out.println("Atualizando página com Opera");
	}
}
