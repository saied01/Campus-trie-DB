package aed;

/* Invariante de Representación:
- `carreras` y `nombresEnCarreras` son arreglos de igual longitud.
- El número de elementos en `carreras` y `nombresEnCarreras` es igual a la longitud del arreglo `listaPares` pasado en el constructor.
- Cada elemento en `carreras` un correspondiente elemento en `nombresEnCarreras`, el cual contiene al menos un nombre que representa una materia de la carrera.
- No hay valores `null` en los arreglos `carreras` y `nombresEnCarreras`.
 */

public class InfoMateria{
    String[] carreras;
    String[] nombresEnCarreras;

    public InfoMateria(ParCarreraMateria[] listaPares){
        this.carreras = new String[listaPares.length];
        this.nombresEnCarreras = new String[listaPares.length];
        for(int i = 0; i<listaPares.length; i++) {
            this.carreras[i] = listaPares[i].getCarrera();
            this.nombresEnCarreras[i] = listaPares[i].getNombreMateria();
        }
    }

    public int longitud() {
        return carreras.length;
    }

    public String obtenerCarrera(int i) {
        if (i < 0 || i >= longitud()) {
            throw new IndexOutOfBoundsException("indice fuera de rango.");
        }
        return carreras[i];
    }

    public String obtenerNombresMateria(int i) {
        if (i < 0 || i >= longitud()) {
            throw new IndexOutOfBoundsException("indice fuera de rango.");
        }
        return nombresEnCarreras[i];
    }

}