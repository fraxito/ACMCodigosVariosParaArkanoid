import java.awt.Color;
import java.awt.Font;

import acm.graphics.GLabel;


public class CambiarFuenteTTF extends acm.program.GraphicsProgram{

	GLabel marcador = new GLabel("HOLA");
	Font fuente;
	public void run(){
		try {
			fuente = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("Pacifico.ttf"));
		} catch (Exception e) {}
		marcador.setColor(Color.black);
		marcador.setFont(fuente.deriveFont(0, 78));
		add(marcador, 50, 80);
	}
}
