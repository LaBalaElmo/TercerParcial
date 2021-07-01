package examen.decorator;

public class Carcasa extends A�adidos {
	private String tipo = "Carcasa";

	public Carcasa(ICelular cel) {
		super(cel);
	}

	@Override
	public void operation() {
		super.operation();
		System.out.println("A�adiendo " + tipo);
		System.out.println("El precio subio en 10");
		setPrecio(super.getPrecio() + 10);
		System.out.println("Precio actual " + getPrecio());
	}

}
