package examen.adapter;

import java.util.Random;

public class GasolinaEspecial implements ICuadra {
	private int capacidad;

	@Override
	public void llenarGasolina(int gasolina) {
		capacidad = gasolina;
		System.out.println("Llenando gasolina especial");
		System.out.println("Cantidad de gasolina especial despues del llenado " + capacidad);
	}

	@Override
	public int estadoCombustible() {
		int aux = new Random().nextInt(49) + 1;
		System.out.println("Estado de la gasolina especial actual " + aux);
		return aux;
	}

}
