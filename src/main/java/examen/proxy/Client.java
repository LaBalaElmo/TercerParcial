package examen.proxy;

public class Client {
	public static void main(String[] args) {
		Proxy proxy = new Proxy();
		Usuario u1 = new Usuario("1234", "Jose1");
		Usuario u2 = new Usuario("1234", "Jose2");
		Usuario u3 = new Usuario("1234", "Jose3");
		Usuario u4 = new Usuario("1234", "Jose4");
		
		proxy.login(u1, "1234", "Jose1");
		proxy.login(u2, "1234", "Jose2");
		proxy.login(u3, "1234", "Jose3");
		proxy.login(u4, "1234", "Jose4");
	}
}
