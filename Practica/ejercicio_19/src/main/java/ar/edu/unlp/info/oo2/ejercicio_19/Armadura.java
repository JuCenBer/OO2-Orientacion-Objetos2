package ar.edu.unlp.info.oo2.ejercicio_19;

public interface Armadura {
	
	public int recibirDaño(ArmaEspada arma);
	public int recibirDaño(ArmaArco arco);
	public int recibirDaño(ArmaBaston baston);
	public int recibirDaño(ArmaMartillo martillo);
}
