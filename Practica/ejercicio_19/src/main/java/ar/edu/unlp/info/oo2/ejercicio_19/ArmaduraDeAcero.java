package ar.edu.unlp.info.oo2.ejercicio_19;

public class ArmaduraDeAcero implements Armadura{

	private int dañoPorEspada = 3;
	private int dañoPorArco = 2;
	private int dañoPorBaston = 1;
	private int dañoPorMartillo = 4;
	
	@Override
	public int recibirDaño(ArmaEspada espada) {
		return dañoPorEspada;
	}

	@Override
	public int recibirDaño(ArmaArco arco) {
		return dañoPorArco;
		
	}

	@Override
	public int recibirDaño(ArmaBaston baston) {
		return dañoPorBaston;		
	}
	
	@Override
	public int recibirDaño(ArmaMartillo martillo) {
		return dañoPorMartillo;		
	}
}
