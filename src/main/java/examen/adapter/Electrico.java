package examen.adapter;

import java.util.Random;

public class Electrico implements ICuadraElectrico{
	private int carga;

	@Override
	public void cargar(int electricidad) {
		if(electricidad > 20) {
			System.out.println("No se puede cargar tanta electricidad");
			return;
		}
		carga = electricidad;
		System.out.println("Cargando cuadratract electrico ");
		System.out.println("Cantidad de electricidad despues de la carga " + carga);
	}

	@Override
	public int estadoElectricidad() {
		int aux = new Random().nextInt(9)+1;
		System.out.println("El estado de la carga actual es de " + aux);
		return aux;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

}
