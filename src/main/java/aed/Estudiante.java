package aed;

/* Invariante de Representacion:
- El largo de LU es siempre mayor o igual a 1 y menor o igual a 7.
- El valor de materias cursando es mayor o igual a 0.
* */

public class Estudiante {
    String LU;
    int materiasCursando;

    public Estudiante(String LU) {
        this.LU = LU;
        this.materiasCursando = 0;
    }
}
