/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.encuesta.controllers;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Juan Gallo
 */
@Named(value = "analisisBean")
@Dependent
public class AnalBean {

  /**
     * Creates a new instance of AnalisisBean
     */
    private String limInf;

    private String limSup;

    private String total;

    /**
     * Get the value of total
     *
     * @return the value of total
     */
    public String getTotal() {
        return total;
    }

    /**
     * Set the value of total
     *
     * @param total new value of total
     */
    public void setTotal(String total) {
        this.total = total;
    }

    /**
     * Get the value of limSup
     *
     * @return the value of limSup
     */
    public String getLimSup() {
        return limSup;
    }

    /**
     * Set the value of limSup
     *
     * @param limSup new value of limSup
     */
    public void setLimSup(String limSup) {
        this.limSup = limSup;
    }

    /**
     * Get the value of limInf
     *
     * @return the value of limInf
     */
    public String getLimInf() {
        return limInf;
    }

    /**
     * Set the value of limInf
     *
     * @param limInf new value of limInf
     */
    public void setLimInf(String limInf) {
        this.limInf = limInf;
    }

    public AnalBean() {
    }

    public void filtroEdad() {

    }
    public void filtroGenero() {

    }
    
    public void filtroCarrera() {

    }
    
    public void filtroBebida1() {

    }
    
     public void filtroBebida2() {

    }
     
    public void reestablecer(){
        
    }
    

    
}
