package biblioteca;

public class Revista {
	//atributos
	private String titulo;
	private Autoria autoria;
	private int prestados;
	
	//constructores
	
	/**
	 * Pide por pantalla el titulo y la autoria ya que son los datos que necesito para la creacion de la revista, los demas atributos los usare para los metos.
	 * @param titulo
	 * @param autoria
	 */
	public Revista (String titulo, Autoria autoria){
		this.titulo = titulo;
		this.autoria = autoria;
	}
	
	//get y set
	
	//Titulo
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTitulo () {
		return titulo;
	}
	//Autoria
	
	public void setAutoria (Autoria autoria) {
		this.autoria = autoria;
	}
	public Autoria getAutoria () {
		return autoria;
	}
		
	//Prestados
	
	public void setPrestados (int prestados) {
		this.prestados = prestados;
	}
	
	
	//METODOS
	
	/**
	 ***PRESTAMO***
	 * @param ejemplares
	 * @param prestados
	 * @return ejemplares disponibles: dice cuantos libros disponibles hay en la biblioteca y esto nos dira si se podra o no hacer el prestamo.
	 */
	public int prestar ( int ejemplares , int prestados ){	
		this.prestados = prestados;
		
		if (ejemplares != 0) {									//al entrar aqui nos dice que hay algun ejemplar.
			  ejemplares -= prestados;	
			  return ejemplares;
		} else {								
			int vacio = -1;	
			return vacio;		  								// en caso de no haber debe mostrar -1
		}
		
	}
	
	/**
	 * Este metodo realiza una devolucion en caso de haber algo que devolver
	 * @param ejemplares
	 * @param prestamo
	 * @return devolucion : Que nos indica si se pudo o no hacer la devolucion.
	 * si presta
	 */
	public int devolver( int prestados) {
		this.prestados = prestados;
		int ejemplares = 0;
		int devolucion = 0;
		
		if (prestados == -1 || prestados == 0) {									//verifice si prestados es igual a -1 
			 devolucion = -1;
			 return devolucion;
		} else {
			ejemplares += prestados;									// Si es distinto a -1 o no es 0 entra aqui y le suma lo prestado a ejemplares.
			return ejemplares;
		}
	}
			
	public String toString () {
			return "titulo: " + titulo
					+"\nautoria: " + autoria
					+ "\nprestados: " + prestados;
			
		}
	
	
	
	
}
