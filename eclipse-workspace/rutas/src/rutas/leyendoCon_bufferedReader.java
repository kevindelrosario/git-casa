package rutas;

	import java.io.BufferedReader;
import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;

	public class leyendoCon_bufferedReader {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			leerFichero accediendo = new leerFichero();				// asi se llama la clase en el main
			accediendo.lee();
			
		}
	
		//inputStreamReader, FileReader es la clase que utilizaremos.
		public void lee() {
			try {
				FileReader entrada = new FileReader("C:/Users/kevin/OneDrive/Escritorio/pruebaRuta/nuevoDocumento.txt");// no usamos el \ usamos el /.
				//entrada es el nombre que le ponemos al FileReader
				
				BufferedReader miBuffer = new BufferedReader(entrada);		// toma lo que este indicado en la ubicacion de antes y les crea un espacio	
				String linea = ""; // inicia en "" un espacio vacio para que la primera letra no se borre.
				
				
				while (linea != null) { //El -1 en la linea de numeros binarios indica que acaba. Entonces mientras no acabe mostrara todo lo que encuentre.
					
					
					linea = miBuffer.readLine(); //sera igual a lo que tenga el documento dentro y los lee por lineas.		
					
				/*evitar dejar una linea vacia solo con un espacio para que no salga un ? al final*/
						
					System.out.println(linea);			// Luego imprimimos lo que tenga letra escrito.
					
				}		
				entrada.close(); 					//Tenemos que cerrarlo cuando termine.
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("No se ha encontrado el archivo");
			}
		}
	}

