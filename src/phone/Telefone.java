package phone;

public interface Telefone {
	public default void ligar() {
		System.out.println("Fazendo ligação");
	}
	
	public default void atender() {
		System.out.println("Atendendo ligação");
	}
	
	public default void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz");
	}
}
