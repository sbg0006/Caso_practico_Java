package Instituto;

public class Alumno extends Persona {
	
	private String curso;
	private Integer creditos;
	
	public Alumno() {
		super();
	}
	public Alumno(String nombre, String apellidos, Integer edad, String curso, Integer creditos) {
		super(nombre, apellidos, edad);
		this.curso=curso;
		this.creditos = creditos;
	}
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public Integer getCreditos() {
		return creditos;
	}
	public void setCreditos(Integer creditos) {
		this.creditos = creditos;
	}	
	
	// Otros metodos
	public String toString() {
		return "Nombre = " + getNombre() + "; Apellidos = " + getApellidos() + "; Edad = " + getEdad() + "; Curso = " + getCurso() + "; Creditos = " + getCreditos();
	}

}
