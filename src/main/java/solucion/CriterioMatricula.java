package solucion;

public class CriterioMatricula extends Criterio<String> {
    @Override
    public boolean cumple(String str) {
        return str.matches("^[0-9]{4}[A-Z&&[^AEIOU]]{3}$");
    }
}
