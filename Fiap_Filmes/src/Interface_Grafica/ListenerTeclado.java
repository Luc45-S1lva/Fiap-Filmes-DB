package Interface_Grafica;

	
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ListenerTeclado implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println(e.getKeyChar());
	}

	@Override
	public void keyPressed(KeyEvent e) {}

	@Override
	public void keyReleased(KeyEvent e) {}

	

}
