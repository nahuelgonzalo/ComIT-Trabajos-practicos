
public class Alumno {
	private String apellido;
	private double nota;
	
	public Alumno(String unApellido) {
		this.apellido = unApellido;
	}
	
	public Alumno(String unApellido , double unaNota) {
		this.apellido = unApellido;
		this.nota = unaNota;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Alumno [apellido=" + apellido + ", nota=" + nota + "]";
	}
	
	
}
