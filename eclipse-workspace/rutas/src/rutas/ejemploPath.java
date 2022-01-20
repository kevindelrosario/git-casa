package rutas;

import java.io.*;
import java.io.File;
import java.nio.file.Paths;
import java.util.Scanner;

public class ejemploPath {
	public static void main(String[]args) {
		
		File archivo = new File("C:\\Users\\kevin\\OneDrive\\Escritorio\\pruebaRuta"); //aqui dentro iria la ruta, como ponemos un nombre se pondra lo que se cree dentro del archivo del 
		//proyecto.
		
		
		//para imprimir la ruta absoluta de un archivo usamos  [ nombreArchivo+.getAbsolutePath() ] que va al lado del nombre del archivo creado.
		
		System.out.println(archivo.getAbsolutePath());
		
		//para comproprobar si existe el archivo usamos [ .exists() ]
		System.out.println(archivo.exists());   //nos indica FALSE porque no existe.
		
		// para ver si otro archivo existe en esa misma ruta solo es escribir lo mismo con el nombre que sabemos que tiene,
		//esto donde va el nombre del new FILE [ File archivo = new File("AQUI IRIA EL NOMBRE"); ]
		//	File archivo = new File("bin");    //este archivo existe en esta ruta, por lo tanto nos dira TRUE
		
		
		
		
		
	}

}
