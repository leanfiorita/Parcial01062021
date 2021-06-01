package unlam.progava.oia;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class LectorDeArchivos {
	
	public static int leer(String path) {
		ArrayList<Aplicacion> aplicaciones = new ArrayList<Aplicacion>();
		
		File file = new File(path);
		Scanner scanner;
		try {
			scanner = new Scanner(file);
			scanner.useLocale(Locale.ENGLISH);

			int cant = scanner.nextInt();
			int megasNecesarios = scanner.nextInt();
			for (int i = 0; i < cant; i++) {
				aplicaciones.add(new Aplicacion(scanner.nextInt()));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return megasNecesarios;
	}
}
