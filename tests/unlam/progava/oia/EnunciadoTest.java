package unlam.progava.oia;

import java.io.File;

import org.junit.Test;

import junitx.framework.FileAssert;

public class EnunciadoTest {

	EjercicioOIA ejercicio = new EjercicioOIA();
	
	@Test
	public void enunciado() {
		ejecutarCaso(0);
	}
	
	//Modificar nombre de los casos de prueba
	@Test
	public void prueba() {
		ejecutarCaso(1);
	}
	
	@Test
	public void prueba2() {
		ejecutarCaso(2);
	}
	
	@Test
	public void prueba3() {
		ejecutarCaso(3);
	}
	
	@Test
	public void prueba4() {
		ejecutarCaso(4);
	}
	
	@Test
	public void prueba5() {
		ejecutarCaso(5);
	}
	
	public void ejecutarCaso(int numCaso) {	
		String caso = "0" + numCaso;
		
		String in = "src/unlam/progava/oia/in/" + caso + ".in";
		String expected = "src/unlam/progava/oia/expected/" + caso + ".out";
		String actual = "src/unlam/progava/oia/out/" + caso + ".out";
		
		ejercicio.leer(in);
		ejercicio.resolver();
		ejercicio.escribir(actual);
		
		FileAssert.assertEquals(new File(expected), new File(actual));
	}
	
}
