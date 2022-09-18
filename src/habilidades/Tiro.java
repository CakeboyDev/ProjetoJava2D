package habilidades;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

import principais.MeuPainel;
import principais.Mouse;

public class Tiro {
	static ImageIcon tirimg22;
	public Image tirimgg;
	public BufferedImage tirimgg33;
	public int ju=MeuPainel.p1.jogx2;
	public int ju2=420;
	public int velt=0;
	public int velt2=0;
	public int larg=250,alt=100;
	public static int tir=0;
	
	public void Desenha(Graphics g2d, int x, int y, int larg, int alt) {
		tirimg22=new ImageIcon(getClass().getClassLoader().getResource("dindin.png"));
		tirimgg =tirimg22.getImage();
		//g2d.drawImage(tirimgg,x-100,y-20,larg,alt,null);
		g2d.drawImage(tirimgg,x-100,y-20,larg,alt,null);
	}
	public static void Atira() {
			Tiro ts=new Tiro();
			ts.ju=MeuPainel.p1.jogx2;
			ts.ju2=MeuPainel.p1.jogy2+MeuPainel.telalt*9;
			ts.velt=MeuPainel.p2/100;
			ts.velt2=0;
			MeuPainel.tiros[tir]=ts;
			tir++;
	}
	
}
