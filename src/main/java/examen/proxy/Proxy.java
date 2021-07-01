package examen.proxy;

import java.util.ArrayList;
import java.util.List;

public class Proxy implements IServidor {
	private Servidor ser1 = new Servidor("192.168.26.5", "Servidor1.com");
	private Servidor ser2 = new Servidor("192.168.100.8", "Servidor2.com");

	private List<Usuario> list = new ArrayList<>();

	public void remove(Usuario u) {
		list.remove(u);
	}

	@Override
	public void login(Usuario u, String pass, String user) {
		if (u.getPass().equals(pass) && u.getUser().equals(user)) {
			list.add(u);
			boolean aux = false;
			for (int i = 2; i < list.size() - 1; i++) {
				if (list.size() / i == 2) {
					ser2.guardar(u);
					System.out.println("Guardando en el servidor " + ser2.getDominio());
					aux = true;
				}
			}
			if (!aux) {
				ser1.guardar(u);
				System.out.println("Guardando en el servidor " + ser1.getDominio());
			}
		} else {
			System.out.println("user o pasword incorrecto");
		}

	}
}
