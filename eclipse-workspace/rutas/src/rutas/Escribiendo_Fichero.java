package rutas;

import java.io.FileWriter;
import java.io.IOException;

public class Escribiendo_Fichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Escribiendo escrito1 = new Escribiendo();		// asi lo llamamos en el main
		
		escrito1.escribir();		//asi llamamos el metodo.
		
	}

}
 class Escribiendo{
	 public void escribir() {
		 
		 String frase = " \n hoy hice 4 horas mas";			// seria lo que queremos que aparezca en el documento.
		 
		 try {
			FileWriter escritura = new FileWriter("C:/Users/kevin/OneDrive/Escritorio/pruebaRuta/nuevoDocumento.txt", true);
		//	FileWriter escritura = new FileWriter("C:/Users/kevin/OneDrive/Escritorio/pruebaRuta/nuevoDocumento.txt", true); 
			// (,true) se pone al final para que no cree el ultimo documento, sino que escriba en uno ya creado.
			
			
			// le damos la ubicacion de donde debe escribir todo y lo ultimo es el nombre del archivo que creara y le escribira eso.
			
			for (int i = 0; i < frase.length(); i++) {
				//El for es para que mida la longitud de lo que se haya ingresado en el string de escritura y escriba todo segun la longitud de este.
				escritura.write(frase.charAt(i));		// luego imprime i
			}
			escritura.close(); 		// cuando termine se cerrara.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	 }
	 
 }