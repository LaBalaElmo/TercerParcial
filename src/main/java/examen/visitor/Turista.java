package examen.visitor;

import java.util.Random;

public class Turista implements ITurista {
	private String nombre;
	private int montoDinero;
	private double monto = montoDinero;
	private int ci;

	public Turista(String nombre, int montoDinero, int ci) {
		super();
		this.nombre = nombre;
		this.montoDinero = montoDinero;
		this.ci = ci;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getMontoDinero() {
		return montoDinero;
	}

	public void setMontoDinero(int montoDinero) {
		this.montoDinero = montoDinero;
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	@Override
	public void visit(LaPaz laPaz) {
		int aux = new Random().nextInt(this.montoDinero);
		laPaz.setDineroPorTurismo(laPaz.getDineroPorTurismo() + aux);
		System.out.println("El turista " + nombre + " esta visitanod " + laPaz.getNombre());
		System.out.println(laPaz.getNombre() + " esta con un clima " + laPaz.getClima() + " y por eso el turista gasto " + aux);
		System.out.println("Por su gasto ahora se tiene " + laPaz.getDineroPorTurismo() + " bolivianos en turismo");

	}

	@Override
	public void visit(Cochabamba cochabamba) {
		double aux = cochabamba.getNumeroHabitantes() * 0.1;
		cochabamba.setDineroPorTurismo(cochabamba.getDineroPorTurismo() + aux);
		System.out.println("El turista " + nombre + " esta visitanod " + cochabamba.getNombre());
		System.out.println(cochabamba.getNombre() + " esta con un clima " + cochabamba.getClima() + " y por eso el turista gasto " + aux);
		System.out.println("Por su gasto ahora se tiene " + cochabamba.getDineroPorTurismo() + " bolivianos en turismo");
	}

	@Override
	public void visit(SantaCruz santaCruz) {
		double aux = santaCruz.getNumeroProvincias() * 0.5;
		santaCruz.setDineroPorTurismo(santaCruz.getDineroPorTurismo() + aux);
		System.out.println("El turista " + nombre + " esta visitanod " + santaCruz.getNombre());
		System.out.println(santaCruz.getNombre() + " esta con un clima " + santaCruz.getClima() + " y por eso el turista gasto " + aux);
		System.out.println("Por su gasto ahora se tiene " + santaCruz.getDineroPorTurismo() + " bolivianos en turismo");
		monto = monto - aux;
		System.out.println("Ahora el turista tiene " + monto);
	}

}
