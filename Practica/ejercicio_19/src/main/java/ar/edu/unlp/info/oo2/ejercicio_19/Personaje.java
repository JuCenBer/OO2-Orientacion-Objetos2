package ar.edu.unlp.info.oo2.ejercicio_19;

import java.util.List;

public abstract class Personaje {

	private int vida;
	private List<Habilidad> habilidades;
	private Arma arma;
	private Armadura armadura;
	
	public Personaje(List<Habilidad> habilidades, Arma arma, Armadura armadura) {
		this.vida = 100;
		this.habilidades = habilidades;
		this.arma = arma;
		this.armadura = armadura;
	}
	
	public void atacar(Personaje objetivo) {
		if ((objetivo.getVida() > 0) && (this.getVida() > 0)) {
			this.arma.hacerDaño(objetivo);
		}
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public List<Habilidad> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(List<Habilidad> habilidades) {
		this.habilidades = habilidades;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	public Armadura getArmadura() {
		return armadura;
	}

	public void setArmadura(Armadura armadura) {
		this.armadura = armadura;
	}
	
}
