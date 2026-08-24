public class Ejercicio8 {
    public static int[] TablaMultiplicar(int numero){
        int[] tabla = new int[10];

        for(int i = 0; i < tabla.length; i++){
            tabla[i] = numero * (i+1);
        }
        return tabla;
    }
    public static void main(String[] args) {
        int[] resultado = TablaMultiplicar(5);
        for(int i = 0; i < resultado.length; i++){
            System.out.println("5 x "+ (i + 1) + " = " + resultado[i]);
        }
    }
}
