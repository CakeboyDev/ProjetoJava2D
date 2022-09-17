package principais;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class MeuPainel extends JPanel implements Runnable{
	private static final long serialVersionUID = 1L;



	public static long timer=0;
	public static int timers=0;

	public static Dimension canvad = Toolkit.getDefaultToolkit().getScreenSize();
	public static int canvalarg=(int) canvad.getWidth();
	public static int canvalt=(int) canvad.getHeight();
	public static Jogador p1=new Jogador();
	public static int canvay;
	public static Color corzinha;
	Thread tred;
	Background bg= new Background();
	public int xis=0;
	public int yis=0;
	public MeuPainel() {
		this.setPreferredSize(new Dimension(canvalarg,canvalt));
		this.setDoubleBuffered(true);
		tred=new Thread(this);
		tred.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		double fps=1000000000/60;
		double delta=0;
		long temPas=System.nanoTime();
		long tempAt;
		while(tred!=null) {
			tempAt=System.nanoTime();
			delta+=(tempAt-temPas)/fps;
			timer+=(tempAt-temPas);
			temPas=tempAt;
			if(delta>=1) {
				update();
				repaint();
				delta--;
				xis++;
				timers++;
			}
			if(timer>=1000000000) {
				System.out.println("FPS: "+timers);
				timer=0;
				timers=0;
			}
		}
	}

	@Override
	public void paint(Graphics g) {
		Graphics2D g2d=(Graphics2D) g;
		g2d.translate(0, 0);
		bg.Desenha(g2d);
		p1.Desenha(g2d);
	}
	
	public void update() {
		p1.jogy2+=5;
	}
	
	
	
	
	
	
	
	
	
}