package introduccion;

import java.util.HashMap;
import java.util.Map;

public class ejer_25_g2 {
    public static void main(String[] args) {
        int[] numeros = {3, 3, 3, 4, 2};

        int resultado = encontrarValorMasFrecuente(numeros);
        System.out.println("El Valor más frecuente es " + resultado);
    }

    private static int encontrarValorMasFrecuente(int[] numeros) {
        Map<Integer, Integer> frecuencia = new HashMap<>();

        int nlen = numeros.length;
        int frecuenciaMax = 0;
        int numMasFrecuente = numeros[0];
        // in numMayoria;

        for (int num: numeros){
            frecuencia.put(num, frecuencia.getOrDefault(num, 0) + 1);
            
            if (frecuencia.get(num) > frecuenciaMax) {
                frecuenciaMax = frecuencia.get(num);
                numMasFrecuente = num;
            }
        }

        if (frecuenciaMax <= nlen/2){
            numMasFrecuente = -1;

        }
        return numMasFrecuente;

        // if (frecuencia.get(numMasFrecuente) > nlen/2){
        //numMayoria = numMasFrecuente;}
    }

}