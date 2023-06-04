package ar.edu.unlp.info.oo2.ejercicio_19;

public class ArmaduraDeCuero implements Armadura{

	private int dañoPorEspada = 8;
	private int dañoPorArco = 5;
	private int dañoPorBaston = 2;
	private int dañoPorMartillo = 11;
	

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
