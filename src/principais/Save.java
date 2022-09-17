package principais;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Save {

	public static void save() {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("saveGame.txt"));
			bw.write(""+MeuPainel.p1.jogx2);
			bw.newLine();
			bw.write(""+MeuPainel.p1.jogy2);
			System.out.println("sexo");
			bw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
