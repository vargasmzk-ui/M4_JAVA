public class Empleado {
    //atributos
    protected String nombre;
    protected int salariobase;

    //constructor
    public Empleado(String nombre, int salariobase) {
        this.nombre = nombre;
        this.salariobase = salariobase;
    }

    void mostrarInfo() {
        System.out.println("> nombre: " + nombre + "\n salariobase: " + salariobase + "");
    }

}
