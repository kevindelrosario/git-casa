package rutas;
import java.io.*;
import java.util.Iterator;
public class acceso_Ficheros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			File ruta = new File ("C:\\Users\\kevin\\OneDrive\\Escritorio\\pruebaRuta\\archivoPrueba"); //Dos \\ =\ en las ubicaciones normales
			
			
			System.out.println(ruta.getAbsolutePath()); //Nos muestra la ruta absoluta
			
			
			//crear lista de archivos
			String[] nombreArchivos = ruta.list(); // Para crear lista de archivos de una carpeta. primero lo vuelve String para poder mostrarlo.
			
			System.out.println(nombreArchivos);
			
			// para crear la lista necesitamos un FOR, esto para correr todos los archivos de la lista, la "i" sera la posicion de los arrays
			//el [.length lo usamos como el nomero de posiciones ocupados en la carpeta de la ubicacion. ]
			
			//nombreArchivos es donde metimos la ubicacion antes, esta arriba.
			for(int i = 0; i < nombreArchivos.length;i++) {
			 System.out.println(nombreArchivos[i]);	
			 
			 //ver dentro de las carpetas de la url, osea, mostrar los elementos de las demas carpetas de ese sitio.
			 
			 File verCarpeta2 = new File(ruta.getAbsoluteFile(), nombreArchivos[i]); // creamos un objeto FILE que a la ruta normal le agregue el 
			 //nombre del archivo que querramos ver, aqui vera en todos los que sean Directorios.
			 
			 //para eso debemos comprobar que el archivo al que queremos entrar sea un directorio (Carpeta y asi pueda entrar).
			 // para esto usamos el [ .isDirectory ], pegado al elemento que tendra la ruta con el nombre de los archivos concatenada.
			 
			 if(verCarpeta2.isDirectory()) { // verCarpeta2 tiene la ruta + nombre de los archivos en un for, para que vaya viendo 1 * 1 y comprabando
				 //comprobando cual es un directory y mostrar los datos de este como lista.	
				 
				 String [] archivosCarpeta2 = verCarpeta2.list(); // Creamos un array para que vaya tomando las posiciones de los archivos a mostrar.
				 
				 for(int j = 0; j < archivosCarpeta2.length; j++) { // el for le dara las posiciones a los archivos en el array
					 System.out.println(archivosCarpeta2[j]); //J sera el nomero de la posicion del archivo al terminar el for entonces al mostrar 
					 // archivosCarpetas2[i] indicamos que j es la posicion de cada archivo.
					 
				 }
			 }
			 
			}
			
			
			
	}

}
