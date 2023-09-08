package iPod;

public interface ReprodutorMusical {
	
	public default void tocar() {
		System.out.println("Tocando música");
	}
	
	public default void pausar() {
		System.out.println("Pausando música");
	}
	public default void selecionarMúsica() {
		System.out.println("Selecionando música");
		
	}
}
