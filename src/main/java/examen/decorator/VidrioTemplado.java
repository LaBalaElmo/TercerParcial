package examen.decorator;

public class VidrioTemplado extends Añadidos {
	private String tipo = "vidrio templado";

	public VidrioTemplado(ICelular cel) {
		super(cel);
	}

	@Override
	public void operation() {
		super.operation();
		System.out.println("Añadiendo " + tipo);
		System.out.println("El precio subio en 25");
		setPrecio(super.getPrecio() + 25);
		System.out.println("Precio actual " + getPrecio());
	}

}
