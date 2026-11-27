package principal;

public class Soldado extends Personaje {
	
	private String arma ;
	private int armadura ;
	
	public Soldado(String nombre, int nivel, int puntosVida, String arma, int armadura) {
		super(nombre, nivel, puntosVida);
		this.arma = arma;
		this.armadura = armadura;
	}

	public String getArma() {
		return arma;
	}

	public void setArma(String arma) {
		this.arma = arma;
	}

	public int getArmadura() {
		return armadura;
	}

	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}

	@Override
	public String toString() {
		return super.toString() +"Soldado [arma=" + arma + ", armadura=" + armadura + "]";
	}
}
