package principal;

public class ExcursionBuceo extends Excursion {

	private boolean certificadoExcur;
	private double profundidad;
	private boolean alquiler;
	public ExcursionBuceo(String codigo, Destino destino, int numeroParticipantes, double distanciaRecorrida,
			double duracion, boolean certificadoExcur, double profundidad, boolean alquiler) {
		super(codigo, destino, numeroParticipantes, distanciaRecorrida, duracion);
		this.certificadoExcur = certificadoExcur;
		this.profundidad = profundidad;
		this.alquiler = alquiler;
	}
	public boolean isCertificadoExcur() {
		return certificadoExcur;
	}
	public void setCertificadoExcur(boolean certificadoExcur) {
		this.certificadoExcur = certificadoExcur;
	}
	public double getProfundidad() {
		return profundidad;
	}
	public void setProfundidad(double profundidad) {
		this.profundidad = profundidad;
	}
	public boolean isAlquiler() {
		return alquiler;
	}
	public void setAlquiler(boolean alquiler) {
		this.alquiler = alquiler;
	}
	@Override
	public String toString() {
		return super.toString() +"\nExcursionBuceo [certificadoExcur=" + certificadoExcur + ", profundidad=" + profundidad + ", alquiler="
				+ alquiler + "]";
	}
	
}
