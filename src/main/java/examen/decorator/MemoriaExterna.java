package examen.decorator;

public class MemoriaExterna extends Añadidos {
	private String tipo = "Memoria Externa";

	public MemoriaExterna(ICelular cel) {
		super(cel);
	}

	@Override
	public void operation() {
		super.operation();
		System.out.println("Añadiendo " + tipo);
		System.out.println("El precio subio en 69");
		setPrecio(super.getPrecio() + 69);
		System.out.println("Precio actual " + getPrecio());
	}

}
