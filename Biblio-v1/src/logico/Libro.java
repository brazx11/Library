package logico;

public class Libro extends Publicacion {
	
	private String editorial;
	

	public Libro(String id, String titulo, String autor, int cant,
			String materia, String editorial) {
		super(id, titulo, autor, cant, true, materia);
		this.editorial = editorial;
	}


	public String getEditorial() {
		return editorial;
	}


	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

}
