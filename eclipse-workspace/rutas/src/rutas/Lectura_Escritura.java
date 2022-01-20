package rutas;
import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;

public class Lectura_Escritura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Para leer o enviar cualquier tipo de archivo a otro sitio (copiarlo)*/
		
		
		//es necesario saber cuantos byte hay, asi que creamos un contador inicializado en 0 para que cuente.
		int contador  = 0;
		
		//ESTE ES EL ARRAY QUE COPIARA LOS BYTES
		int datos_entrada []= new int [752985]; // creamos un array con el numero de espacios que nos indico el contador para saber el numero de espacios 
		// que necesitamos guardar.
		
		try{
			//FileInputStream
			//pide una ubicacion para leer los bytes que tenga ese archivo.
			// esta podemos usarla luego si la ponemos en un array para copiar esos bytes y crear un archivo parecido al de la ubicacion.
			
			
			
			//Indicamos la ruta:
			FileInputStream archivo_lectura = new FileInputStream("C:/Users/kevin/OneDrive/Escritorio/pruebaRuta/Nueva carpeta/imagen.jpg"); 
			
			boolean final_ar = false;
			
			while (!final_ar) {		//! significa no,  cuando no sea true
				
				int byte_entrada = archivo_lectura.read(); // para que vaya leyendo byte a byte del archivo inficado en la ruta
				
				
				// luego del array creamos esto:
				if(byte_entrada !=-1)	{			// 1. le indicamos que cuando llegue al final -1 no tome ese dato, simpre que no sea -1 lo leera
													//cuando ya sea -1 nos indica el final.
					datos_entrada[contador]= byte_entrada;
				}	else
					final_ar = true;		//para que cuando sea igual a -1 (lo que significa que no encuentra mas datos) sea true y se salga del boocle.
				
				System.out.println(datos_entrada[contador]); // cuando termine de hacer todo imprimirar todo lo que haya encontrado.
				
				contador ++;			// para que vaya contando
				
				
			}
			archivo_lectura.close();   // cuando termine se cerrara el programa.
		}catch (IOException e) {
			System.out.println("No se encuentra el archivo");
		}
		
		System.out.println("numero de bytes: " +contador); 		//lo ponemos aqui para que cuando se termine de ejecutar nos diga el total.
		crea_fichero(datos_entrada); 					//cuando termina todo llama la funcion copiar y le envia los datos optenidos en el array.
	}

	/**
	 * Toma los datos del array creado con el FileInputStream y lo copia en otro sitio. 
	 * @param datos_nuevo_fichero
	 * Es static porque el main es static y void porque no retorna nada.
	 * 
	 */
	static void crea_fichero(int datos_nuevo_fichero[]) {
		
		//FileOutputStream : 
		/*
		 *En este debemos ingresar la ubicacion y al final en vez de poner el nombre del archivo copiado antes ponemos el nombre del nuevo archivo que sera la copia. 
		 */
		try {
			FileOutputStream fichero_nuevo = new FileOutputStream ("C:/Users/kevin/OneDrive/Escritorio/pruebaRuta/Nueva carpeta/imagen_copia2.jpg");
			
			/*
			 * creamos un boocle for que va a leer todos los parametros que esten dentro del array que entrara.
			 */
			for (int i = 0; i < datos_nuevo_fichero.length; i ++) {
					fichero_nuevo.write(datos_nuevo_fichero[i]);	// para que vaya escribiendo todo en un fichero nuevo.
			}
			
			fichero_nuevo.close();
			
		}catch (IOException e) {
			System.out.println("Error al crear el archivo");
		}
		
		
	}
}
