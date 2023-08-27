public class main {
    public static void main(String[] args) {

        music Thread1 = new music(); // Objeto para usar la clase music.java
        datos Thread2 = new datos(); // Objeto para usar la clase datos.java
        Thread1.start(); // Inicio del Hilo1
        Thread2.start(); // Inicio del Hilo2

    }
}
