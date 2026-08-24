import java.util.Scanner;

public class Ejercicio3 {
    public static double CalcularArea(double base, double altura){
        double area = base*altura;
        return area;
    }
    public static void main(String[] args) {
        double resultado = CalcularArea(12.5,23);

        System.out.println("El area del triangulo es de " +resultado);
    }
}
