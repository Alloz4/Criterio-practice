package solucion;

import java.util.ArrayList;
import java.util.List;

public abstract class Criterio<T> {

    public static Criterio get(String str) {

        switch (str) {
            case "par":
                return new CriterioPar();
            case "palindromo":
                return new CriterioPalindromo();
            case "listaNoNulos":
                return new CriterioListaNoNulos();
            case "dni":
                return new CriterioDni();
            case "matricula":
                return new CriterioMatricula();
            case "fecha":
                return new CriterioFecha();
        }

        return null;

    }

    public abstract boolean cumple(T t);

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return (this.getClass() == o.getClass());
    }

    @Override
    public String toString() {
        return getClass().getName();
    }

}
