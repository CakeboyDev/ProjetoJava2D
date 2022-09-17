package principais;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Teclado implements KeyListener{
	public static boolean baixo, cima, direita, esquerda, dash, load;
	long tpp = System.nanoTime();
	long tpa;
	int dlt=0;
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		int key = e.getKeyChar();;
		if(key==119) {
			cima=true;
		}
	}
	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if(key==65) {
			esquerda=true;
		}
		if(key==68) {
			direita=true;
		}
		if(key==83) {
			baixo=true;
		}
		if(key==17) {
			dash=true;
		}
		if(key==32) {
			load=true;
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		int key = e.getKeyCode();
		if(key==65) {
			esquerda=false;
		}
		if(key==87) {
			cima=false;
		}
		if(key==68) {
			direita=false;
		}
		if(key==83) {
			baixo=false;
		}
		if(key==17) {
			dash=false;
		}
		if(key==32) {
			load=false;
		}
	}
}