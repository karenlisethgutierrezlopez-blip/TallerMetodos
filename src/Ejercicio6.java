public class Ejercicio6 {

    private String nombre;
    private double nota;

    public Ejercicio6(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public void mostrarBoletin() {
        System.out.println(this.nombre + ", su nota es " + this.nota);
    }

    public static double compararNotas(double nota1, double nota2) {
        return nota1 - nota2;
    }

    // Método para mostrar la comparación entre dos objetos
    public static void mostrarComparacion(Ejercicio6 e1, Ejercicio6 e2) {

        double diferencia = compararNotas(e1.nota, e2.nota);

        if (diferencia == 0.0) {
            System.out.println("Los estudiantes tienen la misma nota: " + e1.nota);

        } else if (diferencia > 0.0) {
            System.out.println(e1.nombre + " tiene la nota mayor con " + e1.nota);

        } else {
            System.out.println(e2.nombre + " tiene la nota mayor con " + e2.nota);
        }
    }
}
