package org.example.models;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Resultado <t>{
    private boolean Succes;
    private String Error;
    private t Clase;

    public boolean isSucces() {
        return Succes;
    }

    public void setSucces(boolean succes) {
        Succes = succes;
    }

    public String getError() {
        return Error;
    }

    public void setError(String error) {
        Error = error;
    }

    public t getClase() {
        return Clase;
    }

    public void setClase(t clase) {
        Clase = clase;
    }
}
