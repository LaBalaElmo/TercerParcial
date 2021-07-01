package examen.decorator;

public class Client {
	public static void main(String[] args) {
		ICelular cel = new Celular("Apple", 64, 128, "SanpDRAGON", 1000);
		
		cel = new VidrioTemplado(cel);
		
		cel = new Carcasa(cel);
		
		cel.operation();
	}
}
