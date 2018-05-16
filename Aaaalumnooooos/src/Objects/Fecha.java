/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import java.io.Serializable;

/**
 *
 * @author Arturo
 */
public class Fecha implements Serializable {
    private Integer dia;
    private Integer mes;
    private Integer anio;

    public Fecha(Integer dia, Integer mes, Integer anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }
    public String toString(){
        return String.format("%d/%d/%d",dia, mes, anio);
    }
}
