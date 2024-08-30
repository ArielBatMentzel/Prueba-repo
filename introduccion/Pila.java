package introduccion;

public interface Pila<T> {
    T tope();
    void apilar(T elemento);
    T desapilar();
    boolean esVacia();
}