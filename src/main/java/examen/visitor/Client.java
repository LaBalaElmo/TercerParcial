package examen.visitor;

public class Client {
	public static void main(String[] args) {
		LaPaz lapaz = new LaPaz(20, 500000, "Frio");
		Cochabamba cochabamba = new Cochabamba(36, 200000, "Templado");
		SantaCruz santacruz = new SantaCruz(100, 1000000, "Calido");
		
		Turista turista = new Turista("Jose", 100000, 75896235);
		
		lapaz.recibirVisita(turista);
		cochabamba.recibirVisita(turista);
		santacruz.recibirVisita(turista);
	}
}
