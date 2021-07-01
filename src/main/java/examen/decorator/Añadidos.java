package examen.decorator;

public abstract class A�adidos implements ICelular {
	private ICelular cel;

	public A�adidos(ICelular cel) {
		this.cel = cel;
	}

	@Override
	public void operation() {
		this.cel.operation();
	}
	
	@Override
	public void setPrecio(int precio) {
		cel.setPrecio(precio);
		
	}

	@Override
	public int getPrecio() {
		return cel.getPrecio();
	}

}
