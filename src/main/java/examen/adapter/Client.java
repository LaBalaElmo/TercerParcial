package examen.adapter;

public class Client {
	public static void main(String[] args) {
		Gasolina gasolina = new Gasolina();
		Diesel diesel = new Diesel();
		GasolinaEspecial gasesp = new GasolinaEspecial();
		
		Electrico electrico = new Electrico();
		
		gasolina.llenarGasolina(51);
		gasolina.llenarGasolina(45);
		gasolina.estadoCombustible();
		diesel.llenarGasolina(35);
		diesel.estadoCombustible();
		gasesp.llenarGasolina(49);
		gasesp.estadoCombustible();
		
		ElectricoAdaptado adaptado = new ElectricoAdaptado(electrico);
		adaptado.llenarGasolina(30);
		adaptado.llenarGasolina(19);
		adaptado.estadoCombustible();
	}
}
