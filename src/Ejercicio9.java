public class Ejercicio9 {
    public static String ClasificarNota(double nota) {
        if (nota < 3.0) {
            return "Reprobado";
        } else if (nota < 4.5) {
            return "Aprobado";
        } else {
            return "Excelente";
        }
    }
    public static void main(String[] args) {

        String resultado = ClasificarNota(4.7);

        System.out.println("Resultado: " + resultado);
    }
}
