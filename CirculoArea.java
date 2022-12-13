import java.util.Scanner;

public class CirculoArea {
    public static void main (String args []){
        int Radio;

        System.out.println("Ingrese el tamaño del readio: ");
        Scanner radio = new Scanner(System.in);
        Radio = radio.nextInt();
        double Area = Math.PI*Math.pow (Radio, 2);
        System.out.println("El area del circulo es de "+Area);
    }
}
