package aed;

/* Invariante de Representación:
- `tailsDeSusCarreras` cumple con el invariante de representacion de `ListaEnlazadaPointersDeMaterias`.
- Si `tailsDeSusCarreras` siempre contiene a los 'tails' de los nombres que tiene esta materia en todas las carreras
  en las que aparece.
- `cargosdocentes` es un arreglo con tamaño constante 4, sus valores son mayores o iguales a 0.
- `cupoPorCargo` es un arreglo con tamaño constante 4, sus valores son siempre los mismos (250, 100, 20, 30).
- `cupo` es el mínimo del producto de los valores de `cargosdocentes` y `cupoPorCargo` en un indice `i` igual para ambos.
- El valor de `inscriptos` es mayor o igual a 0.
*/

public class Materia {



    ListaEnlazada<NodoTrie<Materia>> tailsDeSusCarreras;
    int[] cargosdocentes;
    int[] cupoPorCargo;
    int cupo;
    int inscriptos;

    ListaEnlazada<Estudiante> estudiantes;


    public Materia() {
        this.tailsDeSusCarreras = new ListaEnlazada<NodoTrie<Materia>>();
        this.cargosdocentes = new int[]{0,0,0,0};//AY2[3],AY1[2],JTP[1],PROF[0]
        this.cupoPorCargo = new int[]{250, 100, 20,30};
        this.cupo = 0;
        this.inscriptos = 0;
        this.estudiantes = new ListaEnlazada<Estudiante>();



    }


    public void agregarCargoDocente(String cargo) {
        switch (cargo) {
            case "AY2" -> cargosdocentes[3] += 1;
            case "AY1" -> cargosdocentes[2] += 1;
            case "JTP" -> cargosdocentes[1] += 1;
            case "PROF" -> cargosdocentes[0] += 1;
            default -> throw new UnsupportedOperationException("NO PUEDE PASAR ESTO");
        }
        actualizarCupo(); // O(4)
    }

    public void actualizarCupo(){
        int minimo = cargosdocentes[0] * cupoPorCargo[0];

        for (int i = 0; i < cargosdocentes.length; i++){
            if (minimo > cargosdocentes[i] * cupoPorCargo[i]){
                minimo = cargosdocentes[i] * cupoPorCargo[i];
            }
        }
        cupo = minimo;
    }

    public void desincribirEstudiantes(){
        ListaEnlazada.NodoListaEnlazada<Estudiante> actual = estudiantes.raiz;
        while (actual != null){
            actual.dato.materiasCursando -= 1;
            actual = actual.siguiente;
        }
    }
}
