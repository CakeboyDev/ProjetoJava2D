package principais;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;

import javax.swing.JPanel;

import habilidades.Pulo;

public class MeuPainel extends JPanel implements Runnable{
	private static final long serialVersionUID = 1L;


	public static boolean gameStart=false,chao=false;
	public static long timer=0;
	public static int timers=0;
	public static long timer2=0;
	public static int timers2=0;
	public static Dimension canvad = Toolkit.getDefaultToolkit().getScreenSize();
	public static int canvalarg=(int) canvad.getWidth();
	public static int canvalt=(int) canvad.getHeight();
	public static int telarg=canvalarg/100;
	public static int telalt=canvalt/100;
	public static int chaoY=90*telalt;
	public static Jogador p1=new Jogador();
	public static int canvay;
	public static Color corzinha;





	public static int p;


	public static int p2;


	public static int pi2;


	public static int pi;
	Thread tred;
	Background bg= new Background();
	public static Teclado tec = new Teclado();
	public static double xis=0;
	public static int yis=0;
	public MeuPainel() {
		this.setPreferredSize(new Dimension(canvalarg,canvalt));
		this.setDoubleBuffered(true);
		this.addKeyListener(tec);
		this.setFocusable(true);
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
			timer2+=(tempAt-temPas);
			temPas=tempAt;
			if(delta>=1) {
				update();
				repaint();
				delta--;
				timers++;
				timers2++;
			}
			if(timer>=1000000000) {
				//System.out.println("FPS: "+timers);
				timer=0;
				timers=0;
				yis+=1;
				
			}
			if(timer2>=100000000) { 
				timer2=0;
				timers2=0;
				xis+=0.1;
			}
		}
	}

	@Override
	public void paint(Graphics g) {
		Graphics2D g2d=(Graphics2D) g;
		g2d.translate(-(p1.jogx2-(telarg*50)), 0);
		bg.Desenha(g2d);
		p1.Desenha(g2d);
	}
	
	public void update() {
		if(xis>=0.5) {
			gameStart=true;
		}
		if(gameStart) {
			p1.jogy2+=10;
			
			tec.Aperta();
			checaColisao();
		}
	}	
	public void checaColisao() {
		if(p1.jogy2+p1.alt>=chaoY) {
			p1.jogy2=chaoY-p1.alt;
			chao=true;
		}else {
			chao=false;
		}
	}
	public static void Atirar() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}