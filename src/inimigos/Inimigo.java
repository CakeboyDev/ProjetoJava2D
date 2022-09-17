package inimigos;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Inimigo {
	public int x;
	public int y;
	public int vel;
	public int larg=100;
	public int vida =10;
	public boolean morrendo=false;
	static ImageIcon p1img22;
	public Image imgg;
	public Image imgg3;
	
	public void Desenha(Graphics g2d, int x, int y, int larg, int alt) {
		p1img22=new ImageIcon(getClass().getClassLoader().getResource("chute.png"));
		imgg =p1img22.getImage();
		g2d.drawImage(imgg,x,y,larg,alt,null);
		
	}
}
