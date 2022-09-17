package principais;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Load {

	public static void load() {
		try {
			try (BufferedReader br = new BufferedReader(new FileReader("saveGame.txt"))) {
				MeuPainel.p1.jogx2=Integer.parseInt(br.readLine());
				MeuPainel.p1.jogy2=Integer.parseInt(br.readLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
