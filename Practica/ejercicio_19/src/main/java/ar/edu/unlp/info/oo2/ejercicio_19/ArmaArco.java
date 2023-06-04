package ar.edu.unlp.info.oo2.ejercicio_19;

public class ArmaArco implements Arma{

	public void hacerDaño(Personaje objetivo) {
		int dañoProvocado = objetivo.getArmadura().recibirDaño(this);
		objetivo.setVida(objetivo.getVida() - dañoProvocado);
	}

}
