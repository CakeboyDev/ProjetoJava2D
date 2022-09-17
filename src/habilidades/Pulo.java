package habilidades;
import principais.MeuPainel;

public class Pulo {

	public static boolean subir=true, pular=true;
	public static boolean pulo=false;
	public static int cris=MeuPainel.yis+2;
	public static void pulo() {

		if (MeuPainel.p1.jogy2>=220) {	
		if (!MeuPainel.tec.direitinha && !MeuPainel.tec.esquerdinha) {
			if (subir && MeuPainel.p1.jogy2 > 250) {
				MeuPainel.p1.jogy2 -= 15;
			}
			if (subir && MeuPainel.p1.jogy2 > 280) {
				MeuPainel.p1.jogy2 -= 17;
			}
			if (subir && MeuPainel.p1.jogy2 > 300) {
				MeuPainel.p1.jogy2 -= 20;
			}
		}
		if (MeuPainel.tec.direitinha && !MeuPainel.tec.esquerdinha) {
			MeuPainel.p1.jogx2 += 40;
			if (MeuPainel.chao) {
				MeuPainel.p1.jogx2 -= 40;
				MeuPainel.tec.direitinha = false;
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
		}
		if (MeuPainel.tec.esquerdinha && !MeuPainel.tec.direitinha) {
			MeuPainel.p1.jogx2 -= 40;
			if (MeuPainel.chao) {
				MeuPainel.p1.jogx2 += 40;
				MeuPainel.tec.esquerdinha = false;
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
		}
		}else {
			subir=false;

		}
		puloCD();
	}
	
	public static void puloCD() {

		if(MeuPainel.yis>=cris){
			cris+=2;
			MeuPainel.tec.dima=false;
			Pulo.subir=true;
			System.out.println("a");
		}
	}
}
