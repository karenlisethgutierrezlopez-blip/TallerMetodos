import java.util.Scanner;

public class Ejercicio4 {
    public static boolean esPar(int numero){
        if (numero%2==0){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        boolean resultado = esPar(5);

        System.out.println(resultado);
    }
}
