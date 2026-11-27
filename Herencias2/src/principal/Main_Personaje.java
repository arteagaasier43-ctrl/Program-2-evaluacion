package principal;

public class Main_Personaje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Mago mago =new Mago("Pepe", 8, 8, 8, ataque.FUEGO);
		System.out.println(mago.toString());
		mago.meditar(6);
		mago.play();
		
		
		
	}

}
