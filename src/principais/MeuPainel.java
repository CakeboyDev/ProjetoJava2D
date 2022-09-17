package principais;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class MeuPainel extends JPanel implements Runnable{
	private static final long serialVersionUID = 1L;
	public static long fps=1000000000/60;
	public static long temPas=System.nanoTime();
	public static long tempAt;
	public int delta;
	public static Dimension canvad = Toolkit.getDefaultToolkit().getScreenSize();
	public static int canvalarg=(int) canvad.getWidth();
	public static int canvalt=(int) canvad.getHeight();
	Thread tred;
	
	public MeuPainel() {
		this.setPreferredSize(new Dimension(canvalarg,canvalt));
		this.setDoubleBuffered(true);
		tred=new Thread(this);
		tred.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(tred!=null) {
			tempAt=System.nanoTime();
			delta+=(tempAt-temPas)/fps;
			tempAt=temPas;
			if(delta>=1) {
				update();
				repaint();
				delta--;
			}
		}
	}
	public void update() {
		
	}
	@Override
	public void paint(Graphics g) {
		Graphics2D g2d=(Graphics2D) g;
		g2d.fillRect(0,0, 200, 200);
	}
	
	
	
	
	
	
	
	
	
	
	
}