public class Ejercicio5 {
    public static double CalculaPromedio(double nota1, double nota2){
        return (nota1+nota2)/2;
    }

    public static double CalcularPromedio(double[] notas){
        double suma = 0;

        for(int i=0;i<notas.length;i++){
            suma += notas[i];
        }
        return suma/notas.length;
    }
    public static void main(String[] args) {
        double promedionotas = CalculaPromedio(3.5, 5.0);
        double[] notas = {3.5, 4.5, 5.0, 2.0};
        double promedioarreglo = CalcularPromedio(notas);

        System.out.println("Promedio de la dos notas es de "+promedionotas);
        System.out.println("Promedio de todas las notas ingresadas es de "+promedioarreglo);
    }
}
