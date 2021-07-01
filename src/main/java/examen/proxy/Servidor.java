package examen.proxy;

import java.util.ArrayList;
import java.util.List;

public class Servidor {
	private String ip;
	private String dominio;
	private List<Usuario> list = new ArrayList<>();

	public Servidor(String ip, String dominio) {
		super();
		this.ip = ip;
		this.dominio = dominio;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getDominio() {
		return dominio;
	}

	public void setDominio(String dominio) {
		this.dominio = dominio;
	}
	public void guardar(Usuario u) {
		list.add(u);
	}

}
