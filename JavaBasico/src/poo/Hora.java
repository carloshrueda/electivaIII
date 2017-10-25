/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author ESTUDIANTE
 */
public class Hora {

    private int hora;   //0 - 23
    private int minutos;    //0 - 59
    private int segundos;   //0 - 59

    public Hora() {
        this(0, 0, 0);
    }

    public Hora(int hora) {
        this(hora, 0, 0);
    }

    public Hora(int hora, int minutos) {
        this(hora, minutos, 0);
    }

    public Hora(int hora, int minutos, int segundos) {
        if (hora < 0 || hora >= 24) {
            throw new IllegalArgumentException("La hora debe estar 0-23");
        }

        if (minutos < 0 || minutos >= 60) {
            throw new IllegalArgumentException("Los minutos debe estar 0-59");
        }

        if (segundos < 0 || segundos >= 60) {
            throw new IllegalArgumentException("Los segundos debe estar 0-59");
        }

        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public Hora(Hora objhora) {
        this(objhora.getHora(), objhora.getMinutos(), objhora.getSegundos());
    }

    /**
     *
     * @return retorna la hora
     */
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora < 0 || hora >= 24) {
            throw new IllegalArgumentException("La hora debe estar 0-23");
        }

        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        if (minutos < 0 || minutos >= 60) {
            throw new IllegalArgumentException("Los minutos debe estar 0-59");
        }

        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        if (segundos < 0 || segundos >= 60) {
            throw new IllegalArgumentException("Los segundos debe estar 0-59");
        }

        this.segundos = segundos;
    }

    public void setObjHora(int hora, int minutos, int segundos) {
        if (hora < 0 || hora >= 24) {
            throw new IllegalArgumentException("La hora debe estar 0-23");
        }

        if (minutos < 0 || minutos >= 60) {
            throw new IllegalArgumentException("Los minutos debe estar 0-59");
        }

        if (segundos < 0 || segundos >= 60) {
            throw new IllegalArgumentException("Los segundos debe estar 0-59");
        }

        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d %s",
                ((getHora() == 0 || getHora() == 12) ? 12 : getHora() % 12),
                getMinutos(), getSegundos(),
                (getHora() < 12 ? "AM" : "PM"));
    }

}
