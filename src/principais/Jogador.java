package principais;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Jogador{
	int jogx;
	int jogy;
	public int jogx2;
	public int jogy2;
	public int alt=100;
	public int larg=100;
	int larg2=40;
	int vel=10;
	ImageIcon p1img2;
	public Image p1img;

	public Jogador(){	
	}
	public void Desenha(Graphics g2d) {
		p1img2=new ImageIcon(getClass().getClassLoader().getResource("e39.png"));
		p1img =p1img2.getImage();
		g2d.setColor(MeuPainel.corzinha);
		g2d.fillRect(jogx2, jogy2+23, 40, ((alt/100)*59));
		g2d.setColor(MeuPainel.corzinha);
		g2d.fillRect(jogx2+8, jogy2, 25, ((alt/100)*21));
		g2d.drawImage(p1img, jogx2-29,jogy2-18,larg,alt,null);
	}
}
