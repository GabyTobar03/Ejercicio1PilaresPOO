package pilaresPOO;

import java.util.Scanner;

public class ejercicio {
    public static void main(String[] args) {
        // Acceso a cada clase
        Futbolista futbolista = null;
        Entrenador entrenador = null;
        Masajista masajista = null;

        // variable del switch
        int Opciones;

        // Instancia Scanner
        Scanner entrada = new Scanner(System.in);

        // Opciones para seleccionar para llenar datos
        System.out.println("Seleccione el rol que desea llenar:");
        System.out.println("1- Futbolista");
        System.out.println("2- Entrenador");
        System.out.println("3- Masajista");
        System.out.print("Opcion: ");
        Opciones = entrada.nextInt();
        System.out.println();

        switch (Opciones) {
            case 1:
                System.out.println("Ingresa los datos del futbolista:");
                System.out.print("Id: ");
                int idFutbolista = entrada.nextInt();

                System.out.print("Nombre: ");
                String nombreFutbolista = entrada.nextLine();

                System.out.print("Apellido: ");
                String apellidoFutbolista = entrada.nextLine();

                System.out.print("Edad: ");
                int edadFutbolista = entrada.nextInt();

                System.out.print("Dorsal: ");
                String dorsalFutbolista = entrada.nextLine();

                System.out.print("Demarcacion: ");
                String demarcacion = entrada.nextLine();

                futbolista = new Futbolista(idFutbolista, nombreFutbolista, apellidoFutbolista,
                        edadFutbolista, dorsalFutbolista, demarcacion);
                futbolista.viajar();
                futbolista.concentrarse();
                break;

            case 2:
                System.out.println("Ingresa los datos del entrenador:");
                System.out.print("Id: ");
                int idEntrenador = entrada.nextInt();

                System.out.print("Nombre: ");
                String nombreEntrenador = entrada.nextLine();

                System.out.print("Apellido: ");
                String apellidoEntrenador = entrada.nextLine();

                System.out.print("Edad: ");
                int edadEntrenador = entrada.nextInt();

                System.out.print("Años de experiencia: ");
                String aniosExperiencia = entrada.nextLine();

                entrenador = new Entrenador(idEntrenador, nombreEntrenador,
                        apellidoEntrenador, edadEntrenador, aniosExperiencia);
                entrenador.viajar();
                entrenador.concentrarse();
                break;

            case 3:
                System.out.println("Ingresa los datos del masajista:");

                System.out.print("Id: ");
                int idMasajista = entrada.nextInt();

                System.out.print("Nombre: ");
                String nombreMasajista = entrada.nextLine();

                System.out.print("Apellido: ");
                String apellidoMasajista = entrada.nextLine();

                System.out.print("Edad: ");
                int edadMasajista = entrada.nextInt();

                System.out.print("Titulacion: ");
                String titulacionMasajista = entrada.nextLine();

                System.out.print("Años de experiencia: ");
                int aniosExperienciaMasajista = entrada.nextInt();

                masajista = new Masajista(idMasajista, nombreMasajista, apellidoMasajista, edadMasajista,
                        titulacionMasajista, aniosExperienciaMasajista);
                masajista.viajar();
                masajista.concentrarse();
                break;

            default:
                System.out.println("Seleccione una opcion que sea valida");
                break;
        }

        entrada.close();
    }
}

class superClass {
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected int edad;

    public superClass() {
    }

    public superClass(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public void viajar() {
        System.out.println("Informacion de la clase");
        System.out.println("El id de la persona es: " + id);
        System.out.println("El nombre de la persona: " + nombre);
        System.out.println("El apellido de la persona es: " + apellidos);
        System.out.println("La edad de la persona es: " + edad);
    }

    public void concentrarse() {
        System.out.println("");
    }
}

class Futbolista extends superClass {
    private String dorsal;
    private String demarcacion;

    public Futbolista() {
    }

    public Futbolista(int id, String nombre, String apellidos, int edad, String dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    @Override
    public void concentrarse() {
        System.out.println("Soy un futbolista y me concentro en los partidos");
    }

    @Override
    public void viajar() {
        System.out.println("Soy un futbolista y me gusta viajar por el mundo");
    }

    public void jugarPartido() {
        System.out.println("Soy un futbolista y me gusta jugar mucho");
    }

    public void entrenar() {
        System.out.println("Soy futbolista y entreno constantemente");
    }
}

class Entrenador extends superClass {
    private String aniosExperiencia;

    public Entrenador() {
    }

    public Entrenador(int id, String nombre, String apellidos, int edad, String aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public void concentrarse() {
        System.out.println("Soy entrenador y me concentro mucho");
    }

    @Override
    public void viajar() {
        System.out.println("Soy entrenador y me gusta viajar");
    }

    public void dirigirPartido() {
        System.out.println("Soy entrenador y me gusta dirigir partidos");
    }

    public void dirigirEntrenamiento() {
        System.out.println("Soy entrenador y entreno constantemente");
    }
}

class Masajista extends superClass {
    private String titulacion;
    private int aniosExperiencia;

    public Masajista() {
    }

    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public void concentrarse() {
        System.out.println("Soy masajista y me concentro mucho");
    }

    @Override
    public void viajar() {
        System.out.println("Soy masajista y me gusta viajar");
    }

    public void darMasaje() {
        System.out.println("Soy masajista y me gusta dar masajes");
    }
}
