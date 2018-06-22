/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.encuesta.controllers;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Juan Gallo
 */
@Named(value = "loginUserBean")
@RequestScoped
public class UserBean1 {

    private String usuarioLog;
    private String passLog;
    private String fnacReg;
    private String usuarioNomReg;
    private String passReg;
    private String passReg2;
    private String usuarioReg;

    /**
     * Creates a new instance of NewJSFManagedBean
     * @return 
     */
    

    public String registro() {
        return "encuesta";
    }
    
    public String loggeo() {
        //return "encuesta"
        return "analisis";
    }
    
    public String forgot() {
        return "forgot";
    }
    
    public String reestablecer(){
        return "index";
    }

    public String getUsuarioLog() {
        return usuarioLog;
    }

    public void setUsuarioLog(String usuarioLog) {
        this.usuarioLog = usuarioLog;
    }

    public String getPassLog() {
        return passLog;
    }

    public void setPassLog(String passLog) {
        this.passLog = passLog;
    }

    public String getFnacReg() {
        return fnacReg;
    }

    public void setFnacReg(String fnacReg) {
        this.fnacReg = fnacReg;
    }

    public String getUsuarioNomReg() {
        return usuarioNomReg;
    }

    public void setUsuarioNomReg(String usuarioNomReg) {
        this.usuarioNomReg = usuarioNomReg;
    }

    public String getPassReg() {
        return passReg;
    }

    public void setPassReg(String passReg) {
        this.passReg = passReg;
    }

    public String getPassReg2() {
        return passReg2;
    }

    public void setPassReg2(String passReg2) {
        this.passReg2 = passReg2;
    }

    public String getUsuarioReg() {
        return usuarioReg;
    }

    public void setUsuarioReg(String usuarioReg) {
        this.usuarioReg = usuarioReg;
    }
    

}
