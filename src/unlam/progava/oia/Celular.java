package unlam.progava.oia;

import java.util.ArrayList;

public class Celular {
	
	private ArrayList<Aplicacion> aplicaciones;
	private int cantidadAplicacionesAEliminar;
	
	public Celular() {
		aplicaciones = new ArrayList<Aplicacion>();
	}
	
	public int aplicacionesAEliminar(int megasNecesarios) {
		
		this.cantidadAplicacionesAEliminar = aplicaciones.size();
		int sumaMB = 0;
		
		for(int i = 0; i<aplicaciones.size();i++) {
			int j = i;
			while(j<aplicaciones.size() && sumaMB<megasNecesarios) {
				sumaMB+=aplicaciones.get(j).getCantidadMB();
				j++;
			}
			if(cantidadAplicacionesAEliminar>(j-i) && sumaMB>=megasNecesarios) {
				cantidadAplicacionesAEliminar = j-i;
			}
			sumaMB=0;
		}
		return cantidadAplicacionesAEliminar;
	}
	
	public void addAplicacion(Aplicacion aplicacion) {
		aplicaciones.add(aplicacion);
	}

}
