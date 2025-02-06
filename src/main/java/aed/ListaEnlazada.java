package aed;

import java.util.NoSuchElementException;

/* Invariante de Representación:
- `raiz` es la referencia al primer nodo de la lista enlazada. Es `null` si y solo si la lista está vacía.
- No existe ningun nodo el cual su siguiente sea la raiz.
- si el tamaño de la lista es mayor a cero, entonces un elemento tiene valor siguiente = null si y solo si es el ultimo elemento de la lista.
- El tamaño de la lista es mayor o igual a cero.
 */

public class ListaEnlazada<T> {

    static class NodoListaEnlazada<T> {
        NodoListaEnlazada<T> siguiente;
        T dato;

        public NodoListaEnlazada(T dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    NodoListaEnlazada<T> raiz;
    int tamaño;

    public ListaEnlazada() {
        this.raiz = null;
        this.tamaño = 0;
    }

    public void insertar(T dato) {
        NodoListaEnlazada<T> nuevoNodoLisEnl = new NodoListaEnlazada<>(dato);

        if (raiz == null) {
            raiz = nuevoNodoLisEnl;
        } else {
            nuevoNodoLisEnl.siguiente = raiz;
            raiz = nuevoNodoLisEnl;
        }
        tamaño++;
    }

    public T obtenerPrimero() {
        if (raiz == null) {
            throw new NoSuchElementException("La lista está vacía");
        }
        return raiz.dato;
    }

    public int tamaño() {
        return tamaño;
    }

    // Método para imprimir la lista (solo para depuración)
    public void imprimirLista() {
        NodoListaEnlazada<T> actual = raiz;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }
    
    }
