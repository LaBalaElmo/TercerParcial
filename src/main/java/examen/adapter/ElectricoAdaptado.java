package examen.adapter;

public class ElectricoAdaptado implements ICuadra {
	private ICuadraElectrico cuadra;

	public ElectricoAdaptado(ICuadraElectrico cuadra) {
		super();
		this.cuadra = cuadra;
	}

	public ICuadraElectrico getCuadra() {
		return cuadra;
	}

	public void setCuadra(ICuadraElectrico cuadra) {
		this.cuadra = cuadra;
	}

	@Override
	public void llenarGasolina(int gasolina) {
		System.out.println("Adaptando cuadratract electrico");
		cuadra.cargar(gasolina);
	}

	@Override
	public int estadoCombustible() {
		System.out.println("Adaptando cuadratract electrico");
		return cuadra.estadoElectricidad();
	}

}
