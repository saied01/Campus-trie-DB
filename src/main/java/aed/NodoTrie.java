package aed;

/* Invariante de Representación:``
- `letra` puede ser `null` o puede ser un caracter (con valor String).
- Un nodo no tiene nodo padre si y solo si ese nodo es la raiz.
- El hijo de un nodo es un arreglo de tamaño 256 que contiene nodos de `NodoTrie` o valores `null`.
- No existen dos hijos de un mismo nodo, con valores distintos de `null`, y con el mismo valor.
- Si `esFinalPalabra` = false, entonces el nodo tiene al menos un nodo hijo con valor distinto a `null`.
- Si un nodo no tiene hijos, entonces su valor `esFinalPalabra` es true.
- Dado un nodo, su valor `dato` es distinto de `null` si y solo si su valor `esFinalPalabra` es True.
 */

public class NodoTrie<T> {
    boolean esFinalPalabra;
    NodoTrie<T>[] hijo;
    NodoTrie<T> padre;
    T dato;
    String letra;

    public NodoTrie() {
        this.letra = null;
        this.padre = null;
        this.hijo = (NodoTrie<T>[]) new NodoTrie[256];
        this.esFinalPalabra = false;
        this.dato = null;
    }

    public NodoTrie(String letra, NodoTrie<T> padre, T dato) {
        this.letra = letra;
        this.padre = padre;
        this.hijo = (NodoTrie<T>[]) new NodoTrie[256];
        this.esFinalPalabra = false;
        this.dato = dato;
    }

    public boolean EsFinalPalabra() {
        return esFinalPalabra;
    }

    public void setEsFinalPalabra(boolean v) {
        this.esFinalPalabra = v;
    }

    public NodoTrie<T>[] getHijo() {
        return hijo;
    }

    public void setHijo(NodoTrie<T>[] hijo) {
        this.hijo = hijo;
    }

    public NodoTrie<T> getPadre() {
        return padre;
    }

    public void setPadre(NodoTrie<T> padre) {
        this.padre = padre;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
}
