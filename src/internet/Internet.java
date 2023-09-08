package internet;

public interface Internet {

	public default void exibirPagina() {
		System.out.println("Exibindo página da web com navegador default");
	}
	
	public default void adicionarNovaAba() {
		System.out.println("Abrindo nova aba com navegador default");
	}
	
	public default void atualizarPagina() {
		System.out.println("Atualizando página com navegador default");
	}
	
		
}
