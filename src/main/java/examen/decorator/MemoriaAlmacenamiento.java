package examen.decorator;

public class MemoriaAlmacenamiento extends Añadidos {
	private String tipo = "Memoria Almacenamiento";

	public MemoriaAlmacenamiento(ICelular cel) {
		super(cel);
	}

	@Override
	public void operation() {
		super.operation();
		System.out.println("Añadiendo " + tipo);
		System.out.println("El precio subio en 200");
		setPrecio(super.getPrecio() + 200);
		System.out.println("Precio actual " + getPrecio());
	}

}
