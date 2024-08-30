package introduccion;

import java.util.Arrays;

import javax.management.RuntimeErrorException;

public class PilaEstatica implements Pila<Integer>{
    private static final int AUMENTO_CAPACIDAD = 10;
    private Integer[] elementos;
    private int tamaño;

    //public PilaEstatica(){
    //    this(capacidad:10);
    //}

    public PilaEstatica(int capacidad){
        elementos = new Integer[capacidad];
        tamaño = 0;
    }

    @Override
    public Integer tope() {
        if (esVacia()){
            throw new RuntimeException("Pila vacía");
        }
        return elementos[tamaño -1];        
    }

    @Override
    public void apilar(Integer elemento) {
        if (estaLlena()){
            elementos = Arrays.copyOf(elementos, tamaño + AUMENTO_CAPACIDAD);
        }
        elementos[tamaño++] = elemento;
    }

    private boolean estaLlena() {
        return tamaño >= elementos.length;
     }

    @Override
    public Integer desapilar() {
        Integer tope = tope();
        tamaño--; //Esto "saca un elemento de la pila" no lo saca literal, pero como usamos tamaño para acceder al tope del array, al restarle uno

        if (tamaño < elementos.length/2){
            elementos = Arrays.copyOf(elementos, tamaño + AUMENTO_CAPACIDAD)
        }
        return tope;
    }

    @Override
    public boolean esVacia() {
        return tamaño == 0;
        }

}
