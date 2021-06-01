package unlam.progava.oia;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class LectorDeArchivos {
	public static ArrayList<Integer> leer(String path) {
		ArrayList<Integer> sumadora = new ArrayList<Integer>();
		
		File file = new File(path);
		Scanner scanner;
		try {
			scanner = new Scanner(file);
			scanner.useLocale(Locale.ENGLISH);

			int cant = scanner.nextInt();
			for (int i = 0; i < cant; i++) {				
				sumadora.add(scanner.nextInt());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return sumadora;
	}
}
