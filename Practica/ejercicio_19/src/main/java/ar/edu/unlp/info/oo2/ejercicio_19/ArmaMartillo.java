package ar.edu.unlp.info.oo2.ejercicio_19;

public class ArmaMartillo implements Arma{

	@Override
	public void hacerDaño(Personaje objetivo) {
		int dañoProvocado = objetivo.getArmadura().recibirDaño(this);
		objetivo.setVida(objetivo.getVida() - dañoProvocado);
	}

}
