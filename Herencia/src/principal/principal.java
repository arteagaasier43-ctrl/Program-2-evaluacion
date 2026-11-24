package principal;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExcursionCultural excurCulturlEstudiantes = new ExcursionCultural("1", Destino.CIUDAD, 25, 150, 10 , true);
		System.out.println(excurCulturlEstudiantes.toString());
		System.out.println(excurCulturlEstudiantes.calcularPrecio());
		
		ExcursionCultural excurCulturl = new ExcursionCultural("1", Destino.CIUDAD, 25, 150, 10 , true);
		System.out.println(excurCulturl.toString());
		System.out.println(excurCulturl.calcularPrecio());
		
		
		ExcursionBuceo excurBuceoSinCertf = new ExcursionBuceo("1", Destino.CIUDAD, 25, 150, 10 , false, 6, false);
		System.out.println(excurBuceoSinCertf.toString());
		
		
	}

}
