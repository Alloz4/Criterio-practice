package solucion;

public class CriterioPalindromo extends Criterio<String>{

    @Override
    public boolean cumple(String str) {
        str = str.replaceAll(" ", "");
        String inverter = new StringBuilder(str).reverse().toString();
        return inverter.equals(str);
    }

}
