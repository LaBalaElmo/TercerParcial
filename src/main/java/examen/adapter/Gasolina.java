package examen.adapter;

import java.util.Random;

public class Gasolina implements ICuadra {
	private int capacidad;

	@Override
	public void llenarGasolina(int gasolina) {
		if (gasolina > 50) {
			System.out.println("No se puede poner tanta gasolina");
			return;
		}
		capacidad = gasolina;
		System.out.println("Llenando gasolina");
		System.out.println("Cantidad de gasolina despues del llenado " + capacidad);
	}

	@Override
	public int estadoCombustible() {
		int aux = new Random().nextInt(49) + 1;
		System.out.println("Estado de la gasolina actual " + aux);
		return aux;
	}

}
