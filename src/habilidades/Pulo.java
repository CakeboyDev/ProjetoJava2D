package habilidades;

import principais.MeuPainel;

public class Pulo {

	public static boolean subir = true, pular = true;
	public static boolean pulo = false;
	public static double cris = MeuPainel.xis + 0.6;
	public static double dris = MeuPainel.xis + 1;
	public static int maxalt=0,midalt=0,minalt=0;

	public static void pulo() {

		if (MeuPainel.p1.jogy2 >= maxalt) {
			if (MeuPainel.p1.vel==0) {
				maxalt=34*MeuPainel.telalt;
				midalt=38*MeuPainel.telalt;
				minalt=42*MeuPainel.telalt;
				if (subir && MeuPainel.p1.jogy2 > maxalt) {
					MeuPainel.p1.jogy2 -= 4*MeuPainel.telalt;
				}
				if (subir && MeuPainel.p1.jogy2 > midalt) {
					MeuPainel.p1.jogy2 -= 5*MeuPainel.telalt;
				}
				if (subir && MeuPainel.p1.jogy2 > minalt) {
					MeuPainel.p1.jogy2 -= 6*MeuPainel.telalt;
				}
			}else if (MeuPainel.p1.vel>0) {
				maxalt=50*MeuPainel.telalt;
				MeuPainel.p1.jogx2 += 6*MeuPainel.telarg;
				if (MeuPainel.chao) {
					MeuPainel.p1.jogx2 -= 6*MeuPainel.telarg;
				}
				if (subir && MeuPainel.p1.jogy2 > maxalt) {
					MeuPainel.p1.jogy2 -= 4*MeuPainel.telalt;;
				}
				if (subir && MeuPainel.p1.jogy2 > 387) {
					MeuPainel.p1.jogy2 -= 5*MeuPainel.telalt;
				}
				if (subir && MeuPainel.p1.jogy2 > 421) {
					MeuPainel.p1.jogy2 -= 6*MeuPainel.telalt;
				}
			}else if (MeuPainel.p1.vel<0) {
				maxalt=50*MeuPainel.telalt;
				MeuPainel.p1.jogx2 -= 6*MeuPainel.telarg;
				if (MeuPainel.chao) {
					MeuPainel.p1.jogx2 += 6*MeuPainel.telarg;

				}
				if (subir && MeuPainel.p1.jogy2 > maxalt) {
					MeuPainel.p1.jogy2 -= 4*MeuPainel.telalt;
				}
				if (subir && MeuPainel.p1.jogy2 > 387) {
					MeuPainel.p1.jogy2 -= 5*MeuPainel.telalt;
				}
				if (subir && MeuPainel.p1.jogy2 > 421) {
					MeuPainel.p1.jogy2 -= 6*MeuPainel.telalt;
				}
			}
		} else {
			subir = false;
		}
		puloCD();
	}

	public static void puloCD() {

		if (MeuPainel.xis >= cris) {
			cris += 0.6;
			Pulo.subir = true;
			MeuPainel.tec.dima = false;
		}
	}
}
