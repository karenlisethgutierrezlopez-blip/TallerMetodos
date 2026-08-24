public class Ejercicio8 {
    public static int[] TablaMultiplicar(int numero){
        int[] tabla = new int[10];

        for(int i = 0; i < tabla.length; i++){
            tabla[i] = numero * (i+1);
        }
        return tabla;
    }
}
