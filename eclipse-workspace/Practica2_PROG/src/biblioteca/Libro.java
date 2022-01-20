package biblioteca;

public class Libro {
	//Atributos privados
	private String titulo ; 
	private Autoria autoria;
	private int ejemplares; 			//Contiene el numero total de ejemplares de dicho libro aunque este prestado o no.
	private int prestados; 			    //numero de ejemplares prestados de dicho libre	
	
	
	/*Constructores*/
	
	/**
	 * Solo tiene el atributo titulo y numero de ejemplares porque solo estos datos necesito tomar del libro en esta clase.
	 * lo demas se pedira a parte en los otros apartados.
	 * solo estos dos en el main a la hora de crear un libro.
	 * @param titulo
	 * @param ejemplares
	 */
	public Libro(String titulo, int ejemplares, Autoria autoria) {
		this.titulo = titulo;
		this.ejemplares = ejemplares;
		this.autoria = autoria;
	}
	
														//GET Y SET 
	
	//Cada atributo tiene su metodo get y set para poder usarlos por separado
	// si es necesario...
	
	
	/**
	 * Titulo
	 * @param titulo
	 */
	public void setTitulo (String titulo) {
		this.titulo = titulo;
	}
	/**
	 * @param titulo
	 * @return titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	
	/**
	 * AUTORIA
	 * @param autoria
	 */
	public void setAutoria(Autoria autoria) {
		this.autoria = autoria;
	}
	/**
	 * AUTORIA
	 * @param autoria
	 * @return autoria
	 */
	public Autoria getAutoria() {
		return autoria;
	}
	
	/**
	 * EJEMPLARES
	 * @param ejemplares
	 */
	public void setEjemplares (int ejemplares) {
		this.ejemplares = ejemplares;
	}
	/**
	 * EJEMPLARES
	 * @param ejemplares
	 * @return ejemplares
	 */
	public int getEjemplares () {
		return ejemplares;
	}
	
	/**
	 * PRESTADOS
	 * @param prestados
	 */
	public void setPrestados (int prestados) {
		this.prestados = prestados;
	}
	/**
	 * PRESTADOS
	 * @param prestados
	 * @return prestados
	 */
	public int getPrestados () {
		return prestados;
	}
	
	
	
	//METODOS
	
	
	/**
	 ***PRESTAMO***
	 * @param ejemplares
	 * @param prestados
	 * @return ejemplares disponibles: dice cuantos libros disponibles hay en la biblioteca y esto nos dira si se podra o no hacer el prestamo.
	 */
	public int prestar ( int ejemplares){	
		
		if (this.ejemplares != 0) {									//al entrar aqui nos dice que hay algun ejemplar.
			  this.ejemplares =this.ejemplares-ejemplares;	
			  return ejemplares;
		} else {								
			return -1;						// en caso de no haber debe mostrar -1
		}
		
	}
	
	
	/**
	 * 
	 * @param ejemplares
	 * @param prestamo
	 * @return devolucion : Que nos indica si se pudo o no hacer la devolucion.
	 * si presta
	 */
	public int devolver( int prestados , int ejemplares) {
		
		int devolucion = 0;
		
		if (this.prestados == -1 || this.prestados == 0) {									//verifice si prestados es igual a -1 
			 devolucion = -1;			 
		} else {
			this.ejemplares += this.prestados;									// Si es distinto a -1 o no es 0 entra aqui y le suma lo prestado a ejemp
		}
			
		return devolucion;
	}
	
	/**
	 * toString 
	 * @return Datos de los libros agregados
	 */
	public String toString() {
		return  "Titulo: "  +titulo 
				+ "\nEjemplares: "+ ejemplares
				+ "\nAutoria:\n"+ autoria
				+ "\nPrestados: "+ prestados;	
	}
	
	
	
	
}

