package principais;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;

public class Mouse implements MouseListener{

	public static boolean cliqzei,pdr,pqd,pcm,pbx=false;
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

		if(MeuPainel.p>=670) {
			pdr=true;
			pqd=false;
		}else if(MeuPainel.p<=610) {
			pqd=true;
			pdr=false;
		}else {
			pdr=false;
			pqd=false;
		}
		if(MeuPainel.pi<MeuPainel.p1.jogy2+80) {
			pcm=true;
			pbx=false;
		}else if(MeuPainel.pi>MeuPainel.p1.jogy2+30+MeuPainel.p1.alt) {
			pbx=true;
			pcm=false;
		}else {
			pbx=false;
			pcm=false;
		}
		MeuPainel.Atirar();
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
