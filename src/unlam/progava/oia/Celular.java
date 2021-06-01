package unlam.progava.oia;

import java.util.ArrayList;

public class Celular {
	
	private ArrayList<Aplicacion> aplicaciones;
	private int cantidadAplicacionesAEliminar;
	private int cantidadMemoria;
	
	public int aplicacionesAEliminar(int megasNecesarios) {
		
		int mejorCaso;
		int sumaMB = 0;
		
		for(int i = 0; i<aplicaciones.size();i++) {
			mejorCaso = 1;
			int j = i;
			while(j<aplicaciones.size() && sumaMB<megasNecesarios) {
				sumaMB+=aplicaciones.get(j).getCantidadMB();
			}
		}
		return 0;
	}

}
