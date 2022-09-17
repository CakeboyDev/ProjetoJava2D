package principais;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Jogador{
	public int jogx2;
	public int jogy2;
	public int alt=MeuPainel.telalt*18;
	public int larg= MeuPainel.telarg*11;
	int larg2=40;
	public int vel=10;
	ImageIcon p1img2;
	public Image p1img;

	public Jogador(){	
	}
	public void Desenha(Graphics g2d) {
		p1img2=new ImageIcon(getClass().getClassLoader().getResource("e39.png"));
		p1img =p1img2.getImage();
		g2d.setColor(Color.green);
		g2d.fillRect(jogx2, jogy2+MeuPainel.telalt*6, MeuPainel.telarg*5, MeuPainel.telalt*12);
		g2d.setColor(Color.red);
		g2d.fillRect(jogx2+MeuPainel.telarg*2, jogy2, MeuPainel.telarg*2, alt);
		g2d.drawImage(p1img, jogx2-MeuPainel.telarg*3,jogy2-MeuPainel.telalt*4,larg+MeuPainel.telarg,alt+MeuPainel.telalt*4,null);
	}
}
