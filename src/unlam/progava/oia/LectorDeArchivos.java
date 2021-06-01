package unlam.progava.oia;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class LectorDeArchivos {
	
	public static int leer(String path, Celular celular) {
		
		int megasNecesarios = 0;
		File file = new File(path);
		Scanner scanner;
		try {
			scanner = new Scanner(file);
			scanner.useLocale(Locale.ENGLISH);

			int cant = scanner.nextInt();
			megasNecesarios = scanner.nextInt();
			for (int i = 0; i < cant; i++) {
				celular.addAplicacion(new Aplicacion(scanner.nextInt()));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return megasNecesarios;
	}
}
