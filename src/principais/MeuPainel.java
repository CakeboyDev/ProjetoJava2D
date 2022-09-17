package principais;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class MeuPainel extends JPanel implements Runnable{
	private static final long serialVersionUID = 1L;
	public static Dimension canvad = Toolkit.getDefaultToolkit().getScreenSize();
	public static int canvalarg=(int) canvad.getWidth();
	public static int canvalt=(int) canvad.getHeight();
	
	public MeuPainel() {


		this.setPreferredSize(new Dimension(canvalarg,canvalt));
		this.setDoubleBuffered(true);
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
	
	
	
}