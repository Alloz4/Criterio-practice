package solucion;

public class CriterioFecha extends Criterio<String>{

    @Override
    public boolean cumple(String str) {
        return str.matches("^(0?[1-9]|[12][0-9]|3[01])\\/(0?[1-9]|1[0-2])\\/(19|20)\\d{2}$");
    }

}
