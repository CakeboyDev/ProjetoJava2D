package principais;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

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
	public static int chaoY=88*telalt;
	public static Jogador p1=new Jogador();
	public static int canvay;
	public static Color corzinha;
	public static int p;
	public static int p2;
	public static int pi2;
	public static int pi;
	public boolean tocara;
	Thread tred;
	Background bg= new Background();
	Som som = new Som();
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
		tocaBG(0);

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
	TimerTask tt;
	public void tocarplis() {
	tt = new TimerTask() {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("A");
			tocaSE(1);
			tt.cancel();
			tt=null;
		}
	};
	Timer t = new Timer();
	t.schedule(tt, 10);
	}
	
	@Override
	public void paint(Graphics g) {
		Graphics2D g2d=(Graphics2D) g;
		g2d.translate(-(p1.jogx2-(telarg*50)), 0);
		bg.Desenha(g2d);
		p1.Desenha(g2d);
	}
	public void update() {
		tocara = tec.tocarmus;
		p1.jogy2+=2*telalt;
		if(xis>=1) {
			gameStart=true;
		}
		if(gameStart) {
			tec.Aperta();
			checaColisao();
			if(tocara&&tt==null) {
				tocarplis();
			}
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
	public void tocaBG(int i) {
		// TODO Auto-generated method stub
		som.setFile(i);
		som.playbg();
		som.loop();
	}
	public void tocaSE(int i) {
		// TODO Auto-generated method stub
		som.setFile(i);
		som.playbg();
	}
}