package examen.bridge;

public class Twitter implements IRedSocial {
	private String tipo = "Twitter";
	private int seguidores;

	public Twitter(int seguidores) {
		this.seguidores = seguidores;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setSeguidores(int seguidores) {
		this.seguidores = seguidores;
	}

	@Override
	public String getTipo() {
		return tipo;
	}

	@Override
	public int getSeguidores() {
		return seguidores;
	}

	@Override
	public void publicar(ISistema sistema) {
		System.out.println("Capacidad de alumnos " + sistema.getCapacidad());
		System.out.println("Los requisitos son " + sistema.getRequisitos());
	}

}
