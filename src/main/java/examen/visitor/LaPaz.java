package examen.visitor;

public class LaPaz implements IDepartamento{
	private String nombre = "La Paz";
	private int numeroProvincias;
	private int numeroHabitantes;
	private String clima;
	private int dineroPorTurismo;

	public LaPaz(int numeroProvincias, int numeroHabitantes, String clima) {
		this.numeroProvincias = numeroProvincias;
		this.numeroHabitantes = numeroHabitantes;
		this.clima = clima;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroProvincias() {
		return numeroProvincias;
	}

	public void setNumeroProvincias(int numeroProvincias) {
		this.numeroProvincias = numeroProvincias;
	}

	public int getNumeroHabitantes() {
		return numeroHabitantes;
	}

	public void setNumeroHabitantes(int numeroHabitantes) {
		this.numeroHabitantes = numeroHabitantes;
	}

	public String getClima() {
		return clima;
	}

	public void setClima(String clima) {
		this.clima = clima;
	}

	public int getDineroPorTurismo() {
		return dineroPorTurismo;
	}

	public void setDineroPorTurismo(int dineroPorTurismo) {
		this.dineroPorTurismo = dineroPorTurismo;
	}

	@Override
	public void recibirVisita(ITurista turista) {
		turista.visit(this);
	}

}
