package principais;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Background {
	public static int startpos=0;
	public static int newdis=0;
	public static int j = 2200;
	static ImageIcon bg2;
	static Image bg;
	public void Desenha(Graphics g2d) {
		bg2= new ImageIcon(getClass().getClassLoader().getResource("dbpg.png"));
		bg=bg2.getImage();
		if(MeuPainel.p1.jogx2<j) {
			g2d.drawImage(bg,startpos+newdis-MeuPainel.canvalarg-1000,MeuPainel.canvay-150,MeuPainel.canvalarg+1000,MeuPainel.canvalt+195,null);
			g2d.fillRect(startpos+newdis-MeuPainel.canvalarg-1000,MeuPainel.canvay-400, MeuPainel.canvalarg+1000,300);
			g2d.drawImage(bg,startpos+newdis,MeuPainel.canvay-150,MeuPainel.canvalarg+1000,MeuPainel.canvalt+195,null);
			g2d.fillRect(startpos+newdis,MeuPainel.canvay-400, MeuPainel.canvalarg+1000,300);
			g2d.drawImage(bg,startpos+newdis+MeuPainel.canvalarg+1000,MeuPainel.canvay-150,MeuPainel.canvalarg+1000,MeuPainel.canvalt+195,null);
			g2d.fillRect(startpos+newdis+MeuPainel.canvalarg+1000,MeuPainel.canvay-400, MeuPainel.canvalarg+1000,300);
		}else {
			j+=MeuPainel.canvalarg+1000;
			newdis+=MeuPainel.canvalarg+1000;
			g2d.drawImage(bg,startpos+newdis-MeuPainel.canvalarg-1000,MeuPainel.canvay-150,MeuPainel.canvalarg+1000,MeuPainel.canvalt+195,null);
			g2d.fillRect(startpos+newdis-MeuPainel.canvalarg-1000,MeuPainel.canvay-400, MeuPainel.canvalarg+1000,300);
			g2d.drawImage(bg,startpos+newdis,MeuPainel.canvay-150,MeuPainel.canvalarg+1000,MeuPainel.canvalt+195,null);
			g2d.fillRect(startpos+newdis,MeuPainel.canvay-400, MeuPainel.canvalarg+1000,300);
			g2d.drawImage(bg,startpos+newdis+MeuPainel.canvalarg+1000,MeuPainel.canvay-150,MeuPainel.canvalarg+1000,MeuPainel.canvalt+195,null);
			g2d.fillRect(startpos+newdis+MeuPainel.canvalarg+1000,MeuPainel.canvay-400, MeuPainel.canvalarg+1000,300);
		}
		if(MeuPainel.p1.jogx2<j-MeuPainel.canvalarg-1000){
			j-=MeuPainel.canvalarg+1000;
			newdis-=MeuPainel.canvalarg+1000;
			g2d.drawImage(bg,startpos+newdis-MeuPainel.canvalarg-1000,MeuPainel.canvay-150,MeuPainel.canvalarg+1000,MeuPainel.canvalt+195,null);
			g2d.fillRect(startpos+newdis-MeuPainel.canvalarg-1000,MeuPainel.canvay-400, MeuPainel.canvalarg+1000,300);
			g2d.drawImage(bg,startpos+newdis,MeuPainel.canvay-150,MeuPainel.canvalarg+1000,MeuPainel.canvalt+195,null);
			g2d.fillRect(startpos+newdis,MeuPainel.canvay-400, MeuPainel.canvalarg+1000,300);
			g2d.drawImage(bg,startpos+newdis+MeuPainel.canvalarg+1000,MeuPainel.canvay-150,MeuPainel.canvalarg+1000,MeuPainel.canvalt+195,null);
			g2d.fillRect(startpos+newdis+MeuPainel.canvalarg+1000,MeuPainel.canvay-400, MeuPainel.canvalarg+1000,300);
		}
	}
	
}
