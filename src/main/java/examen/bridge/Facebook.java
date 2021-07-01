package examen.bridge;

public class Facebook implements IRedSocial {
	private String tipo = "Facebook";
	private int seguidores;

	public Facebook(int seguidores) {
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
		System.out.println("Capacidad de alumnos " + sistema.);
	}

}
