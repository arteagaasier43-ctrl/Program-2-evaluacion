package principal;

public class Campesino extends Personaje {

	private int cosechaRecolectada ;
	private String herramienta ;
	
	public Campesino(String nombre, int nivel, int puntosVida, String herramienta, int cosechaRecolectada) {
		super(nombre, nivel, puntosVida);
		this.herramienta = herramienta;
		this.cosechaRecolectada = cosechaRecolectada;
	}

	public int getCosechaRecolectada() {
		return cosechaRecolectada;
	}

	public void setCosechaRecolectada(int cosechaRecolectada) {
		this.cosechaRecolectada = cosechaRecolectada;
	}

	public String getHerramienta() {
		return herramienta;
	}

	public void setHerramienta(String herramienta) {
		this.herramienta = herramienta;
	}

	@Override
	public String toString() {
		return super.toString() +"Campesino [cosechaRecolectada=" + cosechaRecolectada + ", herramienta=" + herramienta + "]";
	}
	
}
