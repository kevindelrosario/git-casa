package rutas;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class leyendo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		leerFichero accediendo = new leerFichero();				// asi se llama la clase en el main
		accediendo.lee();
		
	}
}
class leerFichero{
	//inputStreamReader, FileReader es la clase que utilizaremos.
	public void lee() {
		try {
			FileReader entrada = new FileReader("C:/Users/kevin/OneDrive/Escritorio/pruebaRuta/nuevoDocumento.txt");// no usamos el \ usamos el /.
			//entrada es el nombre que le ponemos al FileReader
			int  guardar = 0; //guardamos los datos de la variable entrada aqui, es un int porque estan en binario.
							// siendo 0 escribe todo bien sin elimiar la primera.
			while (guardar != -1) { //El -1 en la linea de numeros binarios indica que acaba. Entonces mientras no acabe mostrara todo lo que encuentre.
				
				guardar = entrada.read(); // todo lo que este en entrada (la ruta) se guardara aqui hasta encontrar -1.
				
				char letra = (char) guardar;			// debemos crear un char que tome lo que tenga guardar para que los convierta en letras, 
														//ya que solo asi lo podremos entender, si esto no se hace salen solo numeros.
				System.out.print(letra);			// Luego imprimimos el char que tomo los numeros y los convirtio en letras.
			}		
			entrada.close(); 					//Tenemos que cerrarlo cuando termine.
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No se ha encontrado el archivo");
		}
	}
}