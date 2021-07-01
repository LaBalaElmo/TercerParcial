package examen.adapter;

import java.util.Random;

public class Diesel implements ICuadra {
	private int capacidad;

	@Override
	public void llenarGasolina(int gasolina) {
		capacidad = gasolina;
		System.out.println("Llenando diesel");
		System.out.println("Cantidad de diesel despues del llenado " + capacidad);
	}

	@Override
	public int estadoCombustible() {
		int aux = new Random().nextInt(49) + 1;
		System.out.println("Estado de la diesel actual " + aux);
		return aux;
	}

}
