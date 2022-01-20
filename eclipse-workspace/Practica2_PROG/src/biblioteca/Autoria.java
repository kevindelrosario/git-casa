package biblioteca;

import java.time.LocalDate;

public class Autoria {
	
	//atributos
	private String nombre;
	private String apellido;
	private LocalDate fechaDeNacimiento;
	
	//constructores
	
	/**
	 * A la hora de la creacion de la clase autoria se pediran por pantalla nombre, fecha de nacimiento y apellido porque son los datos que necesito
	 * guardar de los autores de cada libro /revista.
	 * @param nombre
	 * @param apellido
	 * @param fechaDeNacimiento
	 */
	public Autoria(String nombre, String apellido, LocalDate fechaDeNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	
	//GET Y SET
	
	//NOMBRE
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	
	//APELLIDO
	public void setApellido (String apellido) {
		this.apellido = apellido;
	}
	public String getApellido() {
	return apellido;
	}
	
	//FECHA DE NACIMIENTO
	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	
	/**
	 * imprime la informacion de la autoria
	 */
	public String toString() {
		return "Nombre: " + this.nombre 
				+"\nApellido: " + this.apellido
				+ "\nFecha de nacimiento: " + this.fechaDeNacimiento;
	}
}
