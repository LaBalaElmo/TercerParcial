package examen.decorator;

public class Celular implements ICelular{
	private String marca;
	private int ram;
	private int almacenamiento;
	private String cpu;
	private int precio;

	public Celular(String marca, int ram, int almacenamiento, String cpu, int precio) {
		this.marca = marca;
		this.ram = ram;
		this.almacenamiento = almacenamiento;
		this.cpu = cpu;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getAlmacenamiento() {
		return almacenamiento;
	}

	public void setAlmacenamiento(int almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	@Override
	public void operation() {
		System.out.println("Precio actual del celular " + marca + " es " + precio);
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

}
