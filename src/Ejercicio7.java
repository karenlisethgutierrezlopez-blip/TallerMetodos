public class Ejercicio7 {
    public static double CalcularPromedioClase(double[] notas) {

        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        return suma / notas.length;
    }

    public static void main(String[] args) {
        double[] notas = {5.0, 3.5, 2.0, 4.5};
        double promedio = CalcularPromedioClase(notas);
        System.out.println("Promedio de clases es de "+promedio);
    }
}
