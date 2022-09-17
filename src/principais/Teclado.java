package principais;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import habilidades.Pulo;

public class Teclado implements KeyListener{
	public boolean baixo, cima, direita, esquerda, dash, load;
	public boolean direitinha;
	public boolean esquerdinha;
	public boolean dima;
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
	
	public void Aperta() {
		if(direita&&MeuPainel.chao) {
			direitinha=true;
			esquerdinha=false;
			MeuPainel.p1.jogx2+=MeuPainel.p1.vel;
		}else if(esquerda&&MeuPainel.chao) {
			esquerdinha=true;
			direitinha=false;
			MeuPainel.p1.jogx2-=MeuPainel.p1.vel;
		}
		if(cima&&MeuPainel.chao) {
			dima=true;
		}
		if(dima) {
			Pulo.pulo();
		}

	}
}