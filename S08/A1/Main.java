public class Main {
        public static void main(String[] args) {
        Pelicula p = new Pelicula("Coco antes de Chanel (Coco avant Chanel, 2009)", 110, "Caroline Benjo, Carole Scotta y Philippe Carcassonne.");
        Serie s = new Serie("Oh My Venus (conocida en español como El peso del amor)", 70, 1);

        System.out.println("=".repeat(60));
        System.out.println("PELICULA DE ESTRENO");
        System.out.println("=".repeat(60));
        p.mostrarInfo();
        System.out.println("=".repeat(60));
        System.out.println("SERIE FAVORITA");
        System.out.println("=".repeat(60));
        s.mostrarInfo();
        System.out.println("=".repeat(60));
    }
}