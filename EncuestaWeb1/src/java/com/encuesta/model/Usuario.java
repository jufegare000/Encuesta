/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.encuesta.model;

/**
 *
 * @author Juan Gallo
 */
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "tbl_usuario",
        uniqueConstraints = {
            @UniqueConstraint(columnNames = {"id_user"})})

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user", nullable = false, unique = true, length = 11)
    private String id_user;

    @Column(name = "nom_user", length = 200, nullable = true)
    private String nom_user;

    @Column(name = "pass", length = 20, nullable = true)
    private String pass;

    @Column(name = "fechaNac", nullable = true)
    private Date fechaNac;
    
    @Column(name = "tipousuario", length = 20, nullable = true)
    private String tipousuario;
    
    @Column(name = "descrtipo", length = 200, nullable = true)
    private String descrtipo;

    
    @Column(name = "nombre", length = 200, nullable = true)
    private String nombre;

    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Get the value of fechaNac
     *
     * @return the value of fechaNac
     */
    public Date getFechaNac() {
        return fechaNac;
    }

    /**
     * Set the value of fechaNac
     *
     * @param fechaNac new value of fechaNac
     */
    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    /**
     * Get the value of descrtipo
     *
     * @return the value of descrtipo
     */
    public String getDescrtipo() {
        return descrtipo;
    }

    /**
     * Set the value of descrtipo
     *
     * @param descrtipo new value of descrtipo
     */
    public void setDescrtipo(String descrtipo) {
        this.descrtipo = descrtipo;
    }

    /**
     * Get the value of tipousuario
     *
     * @return the value of tipousuario
     */
    public String getTipousuario() {
        return tipousuario;
    }

    /**
     * Set the value of tipousuario
     *
     * @param tipousuario new value of tipousuario
     */
    public void setTipousuario(String tipousuario) {
        this.tipousuario = tipousuario;
    }

    /**
     * Get the value of pass
     *
     * @return the value of pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * Set the value of pass
     *
     * @param pass new value of pass
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * Get the value of nom_user
     *
     * @return the value of nom_user
     */
    public String getNom_user() {
        return nom_user;
    }

    /**
     * Set the value of nom_user
     *
     * @param nom_user new value of nom_user
     */
    public void setNom_user(String nom_user) {
        this.nom_user = nom_user;
    }

    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public String getId_user() {
        return id_user;
    }

    /**
     * Set the value of id
     *
     * @param id_user new value of id
     */
    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

}
