public class Persona {
    
    private String nombre;
    private int edad;

    //constructor
    public Persona (String nombre, int edad) {
        this. nombre = nombre;
        this.edad = edad;

    }

    //metodo set
    public int setEdad(int nuevaEdad) {
        return edad = nuevaEdad;
    }

    //metodo get
    public string getNombre () {
        return nombre;
    }

    //metodo get
    public int setEdad (int nuevaEdad) {
        return edad = nuevaEdad;

    }

    void mostrarDatos() {
        System.out.println("=".repeat(count:20));
        System.out.println("=".repeat(20));
        System.out.println("ACTIVIDAD ENCAPSULAMIENTO");
        System.out.println("Nombre: " + nombre + "\nEdad: " + edad);
        System.out.println("=".repeat(20));

    }

}