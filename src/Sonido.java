//Reproducir un MP3 en Java 

import java.applet.AudioClip;

import acm.util.SoundClip;

public class Sonido extends acm.program.GraphicsProgram {


	
	
	public void run() {

		SoundClip miSonido = new SoundClip("rayo.mp3");
		miSonido.play();
		

	}
	

}
