package principais;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;

import habilidades.Tiro;

public class Mouse implements MouseListener{

	public static boolean cliqzei;
	public boolean pdr;
	public static boolean pqd;
	public static boolean pcm;
	public static boolean pbx=false;
	public static boolean segurei=false;
	ImageIcon msimg2;;
	public Image msimg;
	public void Desenha(Graphics g2d) {
		msimg2=new ImageIcon(getClass().getClassLoader().getResource("e39.png"));
		msimg =msimg2.getImage();
		g2d.drawImage(msimg, MeuPainel.p2, MeuPainel.pi2, 15, 20,null);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		if(MeuPainel.p>=MeuPainel.telarg*55) {
			pdr=true;
			pqd=false;
		}else if(MeuPainel.p<=MeuPainel.telarg*50) {
			pqd=true;
			pdr=false;
			System.out.println("salve");
		}else {
			pdr=false;
			pqd=false;
		}
		if(MeuPainel.pi<MeuPainel.p1.jogy2+((MeuPainel.p1.alt)/4)) {
			pcm=true;
			pbx=false;
		}else if(MeuPainel.pi>MeuPainel.p1.jogy2+((MeuPainel.p1.alt)/4)*3) {
			pbx=true;
			pcm=false;
		}else {
			pbx=false;
			pcm=false;
		}
		Tiro.Atira();
		}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		segurei=true;
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		segurei=false;
	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	}
}
