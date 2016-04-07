/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.model;

/**
 *
 * @author campitos
 */
public class Avion {
    
    private Integer id_avion;
    private String tipo;
    private Integer num_asientos;

    public Avion(Integer id_avion, String tipo, Integer num_asientos) {
        this.id_avion = id_avion;
        this.tipo = tipo;
        this.num_asientos = num_asientos;
    }

    public Integer getId_avion() {
        return id_avion;
    }

    public void setId_avion(Integer id_avion) {
        this.id_avion = id_avion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getNum_asientos() {
        return num_asientos;
    }

    public void setNum_asientos(Integer num_asientos) {
        this.num_asientos = num_asientos;
    }
    
}
