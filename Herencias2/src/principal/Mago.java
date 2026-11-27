package principal;

public class Mago extends Personaje {
	
	private int hechizos;
	 private ataque ataque;
	 
	 
	 
	 public Mago(String nombre, int nivel, int puntosVida, int hechizos, principal.ataque ataque) {
		super(nombre, nivel, puntosVida);
		this.hechizos = hechizos;
		this.ataque = ataque;
	}

	public int getHechizos() {
		return hechizos;
	}

	public void setHechizos(int hechizos) {
		this.hechizos = hechizos;
	}

	public ataque getAtaque() {
		return ataque;
	}

	public void setAtaque(ataque ataque) {
		this.ataque = ataque;
	}

	@Override
	public String toString() {
		return super.toString() + "\nMago [hechizos=" + hechizos + ", ataque=" + ataque + "]";
		
		
	}
	public void meditar(int cantidad) {
		
		System.out.println("Meditando....");
		System.out.println("Hechizos aumentados en "+cantidad);
		hechizos+=cantidad;
		System.out.println("Numero de hechizos "+hechizos);
	}
		public void play() {
			if(hechizos>=10) {
				hechizos--;
				System.out.println("Ataque magico "+ataque +"!!!" );
			}else {
				System.out.println("No hay hechizos suficientes para hacer un ataque magico");
			}
		}
	
	 
}
