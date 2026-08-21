public class Main {

        public static void main(String[] args) {
        Pelicula p = new Pelicula(">> COCO ANTES DE CHANEL <<", 110, "Caroline Benjo");
        Serie s = new Serie(" >> EL PESO DEL AMOR <<", 70, 1);

        //System.out.println("=".repeat(60));
        //System.out.println("".repeat(60));
        System.out.println("");
        System.out.println("      PELICULA DE ESTRENO");
        System.out.println("=".repeat(40));
        p.mostrarInfo();
        System.out.println(".".repeat(40));
        System.out.println("");
        System.out.println("          SERIE FAVORITA");
        System.out.println("=".repeat(40));
        s.mostrarInfo();
        System.out.println(".".repeat(40));
    }
}