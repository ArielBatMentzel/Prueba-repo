package introduccion;

import java.util.HashMap;
import java.util.Map;

public class arreglo {

    public static void main(String[] args) {
        int[] numeros = {3, 3, 4, 2};
        int resultado = encontrarValorMasFrecuente(numeros);
        System.out.println("El Valor más frecuente es " + resultado);
    }

    private static int encontrarValorMasFrecuente(int[] numeros) {
        Map<Integer, Integer> frecuencia = new HashMap<>();

        int frecuenciaMax = 0;
        int numMasFrecuente = numeros[0];

        for (int num: numeros){
            frecuencia.put(num, frecuencia.getOrDefault(num, 0) + 1);
            
            if (frecuencia.get(num) > frecuenciaMax) {
                frecuenciaMax = frecuencia.get(num);
                numMasFrecuente = num;
            }
        }
        return numMasFrecuente;
    }
}
