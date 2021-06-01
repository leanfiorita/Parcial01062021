package unlam.progava.oia;

import java.util.ArrayList;

public class EjercicioOIA {
	
	ArrayList<Integer> sumadora = new ArrayList<Integer>();
	int resultado;

	public static void main(String[] args) {
		EjercicioOIA ejercicio = new EjercicioOIA();
		
		ejercicio.leer("src/unlam/progava/oia/in/00.in");
		ejercicio.resolver();
		ejercicio.escribir("src/unlam/progava/oia/out/00.out");
	}

	/**
	 * Este método se encarga de leer la entrada de la
	 * consigna desde el archivo.
	 */
	public void leer(String path) {
		
		sumadora = LectorDeArchivos.leer(path);
		//throw new RuntimeException("implementame");
		
	}
	
	/**
	 * Este método se encarga de escribir la salida de la
	 * consigna en el archivo.
	 */
	public void escribir(String path) {
		
		EscritorDeArchivos.escribir(path,this.resultado);
		//throw new RuntimeException("implementame");
	}
	
	/**
	 * Este método debe realizar la resolución del ejercicio.
	 * NO DEBE SITUARSE LA LOGICA AQUI, sino que se pueden
	 * utilizar clases adicionales, y los objetos creados en la
	 * etapa de lectura.
	 * Utilizar este mismo paquete para toda la resolución.
	 */
	public void resolver() {
		
		for(int i = 0; i<sumadora.size();i++) {
			this.resultado += sumadora.get(i);
		}
		//throw new RuntimeException("implementame");
	}
}
