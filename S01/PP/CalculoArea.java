public class CalculoArea {

    public static double calcularArea(double base, double altura) {
        return base * altura / 2;
        /* 36*27/2 */
    } 
   
    public static void main(String[] args) {
        double base = 36;
        double altura = 27;
        double area = calcularArea(base, altura);
        System.out.println(" =========================== \n El área del triangulo es: "+area);
    }  
}