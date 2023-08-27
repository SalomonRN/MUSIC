import java.util.Scanner;
public class datos extends Thread {
    Scanner scanner = new Scanner(System.in);
    
    public void run() {

        System.out.print("Nombre del estudiante: ");
        String name = scanner.nextLine();

        System.out.print("Apellido del estudiante: ");
        String lastname = scanner.nextLine();

        System.out.print("Edad del estudiante: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Carrera del estudiante: ");
        String carrer = scanner.nextLine();

        System.out.print("Semestre del estudiante: ");
        int semester = Integer.parseInt(scanner.nextLine());

        System.out.print("Codigo del estudiante: ");
        long code = Long.parseLong(scanner.nextLine());

        System.out.print("Jornada del estudiante: ");
        String Journey = scanner.nextLine();

        System.out.println(
                "Name: " + name + "\n" +
                        "Apelldio: " + lastname + "\n" +
                        "Edad: " + age + "\n" +
                        "Carrera: " + carrer + "\n" +
                        "Semestre: " + semester + "\n" +
                        "Codigo: " + code + "\n" +
                        "Jornada: " + Journey);
    }

}