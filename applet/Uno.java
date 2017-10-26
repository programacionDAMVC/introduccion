import javax.swing.JApplet;
import javax.swing.JLabel;

/**
 * Ejemplo sencillo de applet
 * @author Chuidiang
 *
 */
public class Uno extends JApplet {
	/**
	 * Pone un JLabel con el texto "Applet hola mundo" en el JApplet, de
	 * forma que es lo que se visualizará en el navegador.
	 */
	public void init() {
		JLabel etiqueta = new JLabel("Applet hola mundo");
		add(etiqueta);
	}
}

