package habilidades;
import principais.MeuPainel;

public class Pulo {

	public static boolean subir=true, pular=true;
	public static boolean pulo=false;
	
	public static void pulo() {

		if (pulo) {

			if (subir && MeuPainel.p1.jogy2 > 250) {
				MeuPainel.p1.jogy2 -= 15;
			}
			if (subir && MeuPainel.p1.jogy2 > 280) {
				MeuPainel.p1.jogy2 -= 17;
			}
			if (subir && MeuPainel.p1.jogy2 > 300) {
				MeuPainel.p1.jogy2 -= 20;
			}
			if (MeuPainel.p1.jogy2 <= 250) {
				subir = false;
			}
		}
		if (pulo && MeuPainel.direitinha && !MeuPainel.esquerdinha) {
			MeuPainel.p1.jogx2 += 40;
			if (MeuPainel.chao) {
				MeuPainel.p1.jogx2 -= 40;
				MeuPainel.direitinha = false;
			}
			if (subir && MeuPainel.p1.jogy2 > 250) {
				MeuPainel.p1.jogy2 -= 15;
			}
			if (subir && MeuPainel.p1.jogy2 > 280) {
				MeuPainel.p1.jogy2 += 17;
			}
			if (subir && MeuPainel.p1.jogy2 > 300) {
				MeuPainel.p1.jogy2 += 20;
			}
			if (MeuPainel.p1.jogy2 <= 300) {
				subir = false;
			}
		}
		if (pulo && MeuPainel.esquerdinha && !MeuPainel.direitinha) {
			MeuPainel.p1.jogx2 -= 40;
			if (MeuPainel.chao) {
				MeuPainel.p1.jogx2 += 40;
				MeuPainel.esquerdinha = false;
			}
			if (subir && MeuPainel.p1.jogy2 > 250) {
				MeuPainel.p1.jogy2 -= 15;
			}
			if (subir && MeuPainel.p1.jogy2 > 280) {
				MeuPainel.p1.jogy2 += 17;
			}
			if (subir && MeuPainel.p1.jogy2 > 300) {
				MeuPainel.p1.jogy2 += 20;
			}
			if (MeuPainel.p1.jogy2 <= 300) {
				subir = false;
			}
		}
	}
}
