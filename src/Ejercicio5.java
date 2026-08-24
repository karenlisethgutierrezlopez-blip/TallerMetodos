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
}
