package aplicativo;
import java.util.Locale;
import java.util.Scanner;
import principais.MeuFrame;

public class Testiego {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		new MeuFrame();
		sc.close();
	}
}