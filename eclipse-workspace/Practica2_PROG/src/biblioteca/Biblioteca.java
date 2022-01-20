package biblioteca;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * 
 * @author kevin francisco montero del rosario
 *
 */
public class Biblioteca {

	private static int prestar;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entradaDato = new Scanner(System.in);
		Libro libro1 = new Libro(null, 0, null);
		boolean llaveTodo = true;			//Esto lo mantendra dentro del menu hasta que diga 0.
		int contador= 0;				//Contador para libro
		int contador2= 0;				//Contador para revistas
		int prestamo = 0;
		int ejemplares = 0;
		
		
		while(llaveTodo){				//El valor booleano lo utilizo para acabar el menu, mientras llaveTodo sea true no terminara, cuando digan 0 llaveTodo sera false.
			
		try {										
			
			                                 
			System.out.println("Menu: \n"
								+ "1.Crea el libro\n"
								+ "2.Crea la revista\n"
								+ "3.Presta el libro\n"
								+ "4.Devuelve el libro\n"
								+ "5.Presta la revista\n"
								+ "6.Devuelve la revista\n"
								+ "0.Salir");
			int respuesta = entradaDato.nextInt();
			
			switch(respuesta){				//Menu de opciones
			case 1: 
				//CREAR LIBRO
					
				if (contador != 0) {
					contador = borrarLibro();// siempre que contador no sea 0 entrara aqui y hara la pregunta de borrar o no el libro anterior.
					break;
				}	
				//variables libro y autoria
							String nombre;
							String apellido;
							LocalDate fecha;
							ejemplares = 0;
							String titulo;
					
							//Datos para rellenar la Autoria del libro
						System.out.println("Crear libro...");
							titulo = titulo();
							ejemplares = ejemplares();
							nombre = nombreAutoria();
							apellido = apellidoAutoria();
							fecha =fechaAutoria();
						    Autoria autoriaLibro = new Autoria(nombre, apellido,fecha);		//se crea la autoria 
							 libro1 = new Libro (titulo,ejemplares,autoriaLibro);		//se crea el libro
							System.out.println("Libro creado...");
							contador++;										// al terminar el contador sera igual a 1 para que ya no pueda entrar aqui y vaya directo a la otra opcion.
					break;
													
				
			case 2: 
				//CREAR REVISTA
				if (contador2 != 0) {
					contador2 = borrarRevista();		// siempre que contador no sea 0 entrara aqui y hara la pregunta de borrar o no la revista anterior.
					break;
				}
				
				//variables a usar
				    String nombreRevista;
					String apellidoRevista;
					LocalDate fechaRevista;
					int ejemplaresRevista;
					String tituloRevista;
						//Datos para rellenar la Autoria del libro
						System.out.println("Crear revista...");
						tituloRevista = titulo();
						ejemplaresRevista = ejemplares();
						nombreRevista = nombreAutoria();
						apellidoRevista = apellidoAutoria();
						fechaRevista =fechaAutoria();
						Autoria autoriaRevista = new Autoria(nombreRevista, apellidoRevista,fechaRevista);		//se crea la autoria 
						Revista revista1 = new Revista (tituloRevista, autoriaRevista);							//Se crea la revista
						System.out.println("Revista creada...");
						
					contador2 ++;				
				break;

			case 3: 
				
				if (libro1.getTitulo() != null) {
					
				System.out.println("Cuantos ejemplares quieres prestar: ");
			
				int prestados = entradaDato.nextInt();
				prestamo = libro1.prestar(prestados);
				ejemplares = prestamo;
				System.out.println(libro1.toString());
				} else {
					System.out.println("Antes debes crear un libro...");
					
				}
				
				break;
				
			case 4: 
				//DEVOLVER LIBRO
				
				int devolverlo = libro1.devolver(ejemplares, prestamo);
				System.out.println(devolverlo);
				System.out.println(libro1.toString());
				
				
				
				break;
				
			case 5: 
				// Prestar revista
				
				break;
				
			case 6: 
				//DEVOLVER REVISTA

				break;
				
			case 0: 
				//SALIR
				llaveTodo = false;
				break;
				
			default:
				System.out.println("Por favor elige un numero entre las opciones mostradas...");
				break;
			}
			
			
			
			} catch(InputMismatchException e){
				System.out.println("El dato ingresado es erroneo");
				
			}               
	}
	}
	

	
	/**
	 * borrarLibro
	 * Borra el ultimo libro creado o lo deja como estaba antes.
	 */
public static int borrarLibro() {	
	int contador;
	
	Scanner entradaDato = new Scanner (System.in);
	System.out.println("Ya hay un libro creado \n¿Quieres borrarlo y crear uno nuevo?"
			+ "\n 1.SI"
			+ "\n 2.NO");
	int respuesta =entradaDato.nextInt();
	
	switch(respuesta) {
	case 1: 
		System.out.println("Libro borrado...");
		contador = 0;
		return contador;
	case 2:
		System.out.println("Perfecto, el libro no se borrara");
		contador = 1;
		return contador;
	default:
		System.out.println("Has introducido un dato fuera del rango");
		break;
	}
	return (Integer) null;
}
/**
 * borrarRevista
 * Se asegura de que el usuario no pueda crear otra revista si ya ha creado una antes. Se pregunta si quiere sustituir la anterior.
 */
public static int borrarRevista() {	
	int contador;
	Scanner entradaDato = new Scanner (System.in);
	System.out.println("Ya hay una revista creada \n¿Quieres borrarla y crear una nueva?"
			+ "\n 1.SI"
			+ "\n 2.NO");
	int respuesta =entradaDato.nextInt();
	
	switch(respuesta) {
	case 1: 
		System.out.println("Revista borrada...");
		contador = 0;
		return contador;	
	case 2:
		System.out.println("Perfecto, la revista no se borrara");
		contador = 1;
		return contador;
	default:
		System.out.println("Has introducido un dato fuera del rango");
		break;
	}
	
	return (Integer) null;
	
}

//AQUI TODOS LOS DATOS PEDIDOS PARA LA CREACION DE LA AUTORIA.
/**
 * Nombre
 * Datos de la autoria: nombre
 * @return nombre
 */
public static String nombreAutoria() {
	Scanner entradaDato = new Scanner (System.in);
	
	try {
	System.out.println("Nombre: ");				   		 //Nombre
	String nombre = entradaDato.next();
	return nombre;
	} catch(InputMismatchException e){
		System.out.println("El dato ingresado es erroneo");
		
	}
	return null;
	
}

/**
 * Apellido
 * Datos de la autoria: Apellido
 * @return apellido
 */
public static String apellidoAutoria() {
	Scanner entradaDato = new Scanner (System.in);
	try {
	System.out.println("Apellido: ");				   		 //Apellido
	String apellido= entradaDato.next();
	return apellido;
	} catch(InputMismatchException e){
		System.out.println("El dato ingresado es erroneo");
		
	}
	return null;
}
/**
 * Datos de la autoria: fecha
 * @return fecha
 */
public static LocalDate fechaAutoria() {
	Scanner entradaDato = new Scanner (System.in);
	try {
		System.out.println("Dia de nacimiento: ");						//Pide el dia
		int dia = entradaDato.nextInt();
		
		System.out.println("Mes de nacimiento: ");						//Pide el mes
		int mes = entradaDato.nextInt();
		
		System.out.println("año de nacimiento: ");						//Pide el año
		int anio = entradaDato.nextInt();
		
		LocalDate fecha = LocalDate.of (anio, mes, dia);
		return fecha;
	} catch(InputMismatchException e){
		System.out.println("El dato ingresado es erroneo");
		
	}
	return null;
}
/**
 * titulo del libro o revista se tomara aqui
 * @return titulo del libro o revista
 */
public static String titulo() {
	Scanner entradaDato = new Scanner (System.in);
	try {
	System.out.println("Titulo: ");				   		 //Titulo
	String titulo = entradaDato.nextLine();
	return titulo;
	} catch(InputMismatchException e){
		System.out.println("El dato ingresado es erroneo");	
	}
	return null;
	
}
/**
 * Ejemplares
 * pide los ejemplares de un libro o revista
 * @return numero de ejemplares
 */
public static int ejemplares() {
	Scanner entradaDato = new Scanner (System.in);
	
	try {
	System.out.println("Numero de ejemplares: ");				   		 //ejemplares
	int ejemplares = entradaDato.nextInt();
	return ejemplares;
	} catch(InputMismatchException e){
		System.out.println("El dato ingresado es erroneo");
	}

	return (Integer) null;
}
/**
 * creaRevista
 * Crea una revista en caso de no estar creada.
 */


	

}
