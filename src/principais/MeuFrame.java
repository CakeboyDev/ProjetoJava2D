package principais;

import java.awt.Cursor;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JRootPane;

public class MeuFrame extends JFrame{
	private static final long serialVersionUID = 1L;
	MeuPainel painel;
	BufferedImage cursorImg = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);
	Cursor blankCursor = Toolkit.getDefaultToolkit().createCustomCursor(cursorImg, new Point(0, 0), "blank cursor");
	public MeuFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		painel = new MeuPainel();
		this.add(painel);
		this.setExtendedState(MeuFrame.MAXIMIZED_BOTH);
		setUndecorated(true);
		getRootPane().setWindowDecorationStyle(JRootPane.NONE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setResizable(false);
		this.getContentPane().setCursor(blankCursor );
		this.pack();
	}	
}
