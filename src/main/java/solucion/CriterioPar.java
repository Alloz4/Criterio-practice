package solucion;

public class CriterioPar extends Criterio<Integer> {

    @Override
    public boolean cumple(Integer num) {
        if(num == null) return false;
        return num % 2 == 0;
    }
}
