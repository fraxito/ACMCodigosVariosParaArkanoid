import javafx.scene.media.Media.*;
import javafx.scene.media.MediaPlayer.*;


import javax.sound.sampled.AudioInputStream;

import acmx.export.java.io.FileInputStream;
public class Sonido extends acm.program.GraphicsProgram{

	public void run(){
		String bip = "bip.mp3";
		Media hit = new Media(bip);
		MediaPlayer mediaPlayer = new MediaPlayer(hit);
		mediaPlayer.play();
		try {
			InputStream ficheroEntrada = new FileInputStream("/sonido1.mp3");
			AudioInputStream cancion = new AudioInputStream(arg0, arg1, arg2)
		} catch (Exception e) {
		}
		
	}
	
}
