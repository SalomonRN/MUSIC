import javax.sound.sampled.*;
import java.io.*;

/**
 * @param a
 * 
 */
public class music extends Thread {

    private static String ruta = "./sonido.wav";
    private static File song = new File(ruta);
    private static Clip clip;
    /*
     * El bloque static se ejecutará cuando la clase AudioPlayer se cargue (Se cree
     * un objeto)
     * 
     */
    static {
        try {
            // Objeto AudioInputStream para obtener un flujo de audio desde un archivo de
            // audio
            AudioInputStream audio = AudioSystem.getAudioInputStream(song);

            // Obtiene una instancia de la clase Clip, que se utiliza para reproducir audio
            clip = AudioSystem.getClip();
            // Abre el clip con el formato y datos de audio.
            clip.open(audio);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error al inicializar el reproductor.");
        }

    }

    // Metodo run proporcioando por la Clase Thread (Sobrecarga de metodos)
    @Override
    public void run() {
        play();
    }

    // Funcion para iniciar el clip
    public void play() {
        try {
            clip.start();
            Thread.sleep(clip.getFrameLength());
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
