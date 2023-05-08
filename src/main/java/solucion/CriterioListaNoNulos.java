package solucion;

import java.util.ArrayList;
import java.util.List;

public class CriterioListaNoNulos extends Criterio<List> {

    @Override
    public boolean cumple(List list) {
        for (Object l: list) {
            if (l == null){
                return false;
            }
        }
        return true;
    }
}
