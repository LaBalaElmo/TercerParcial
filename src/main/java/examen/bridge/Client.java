package examen.bridge;

public class Client {
	public static void main(String[] args) {
		SistemaColegio sistema = new SistemaColegio("Colegio Jose", 10000, "Carnet de identidad, nombre completo");
		
		sistema.publicarEnRedSocial(new Facebook(1000));
		sistema.publicarEnRedSocial(new Twitter(6330));
		sistema.publicarEnRedSocial(new Whatsapp(50));
	}
}
