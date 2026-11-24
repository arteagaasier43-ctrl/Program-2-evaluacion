package principal;



public class ExcursionCultural extends Excursion {
		private boolean estudiantes;
		private final int DESCUENTO=10;

		public ExcursionCultural(String codigo, Destino destino, int numeroParticipantes, double distanciaRecorrida,
				double duracion, boolean estudiantes) {
			super(codigo, destino, numeroParticipantes, distanciaRecorrida, duracion);
			this.estudiantes = estudiantes;
		}

		public boolean isEstudiantes() {
			return estudiantes;
		}

		public void setEstudiantes(boolean estudiantes) {
			this.estudiantes = estudiantes;
		}

		@Override
		public String toString() {
			return super.toString() + " \nExcursionCultural :  [estudiantes=" + estudiantes + "]";
		}
		@Override
		public double calcularPrecio() {
			//return super.calcularPrecio()*0.9;
			return super.calcularPrecio()-super.calcularPrecio()* DESCUENTO/100;
		}
	
}
