package solucion;

public class CriterioDni extends Criterio<String>{

    @Override
    public boolean cumple(String str) {
        return str.matches("^[0-9]{8}[A-Z&&[^UIÑO]]$");
    }

}
