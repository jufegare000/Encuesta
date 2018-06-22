/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.encuesta.controllers;


import javax.inject.Named;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import javax.faces.bean.ApplicationScoped;

/**
 *
 * @author Juan Gallo
 */
@Named(value = "anlService")
@ApplicationScoped
public class AnlService {

    private final static String[] edad;

    private final static String[] genero;

    private final static String[] carrera;

    private final static String[] bebida;

    private final static String[] comentario;

    static {
        edad = new String[10];
        edad[0] = "Black";
        edad[1] = "White";
        edad[2] = "Green";
        edad[3] = "Red";
        edad[4] = "Blue";
        edad[5] = "Orange";
        edad[6] = "Silver";
        edad[7] = "Yellow";
        edad[8] = "Brown";
        edad[9] = "Maroon";

        genero = new String[10];
        genero[0] = "BMW";
        genero[1] = "Mercedes";
        genero[2] = "Volvo";
        genero[3] = "Audi";
        genero[4] = "Renault";
        genero[5] = "Fiat";
        genero[6] = "Volkswagen";
        genero[7] = "Honda";
        genero[8] = "Jaguar";
        genero[9] = "Ford";

        carrera = new String[10];
        carrera[0] = "BMW";
        carrera[1] = "Mercedes";
        carrera[2] = "Volvo";
        carrera[3] = "Audi";
        carrera[4] = "Renault";
        carrera[5] = "Fiat";
        carrera[6] = "Volkswagen";
        carrera[7] = "Honda";
        carrera[8] = "Jaguar";
        carrera[9] = "Ford";

        bebida = new String[10];
        bebida[0] = "BMW";
        bebida[1] = "Mercedes";
        bebida[2] = "Volvo";
        bebida[3] = "Audi";
        bebida[4] = "Renault";
        bebida[5] = "Fiat";
        bebida[6] = "Volkswagen";
        bebida[7] = "Honda";
        bebida[8] = "Jaguar";
        bebida[9] = "Ford";

        comentario = new String[10];
        comentario[0] = "BMW";
        comentario[1] = "Mercedes";
        comentario[2] = "Volvo";
        comentario[3] = "Audi";
        comentario[4] = "Renault";
        comentario[5] = "Fiat";
        comentario[6] = "Volkswagen";
        comentario[7] = "Honda";
        comentario[8] = "Jaguar";
        comentario[9] = "Ford";
    }
     
     public List<String> getEdad() {
        return Arrays.asList(edad);
    }
     
     public List<String> getGenero() {
        return Arrays.asList(genero);
    }
     
     public List<String> getCarrera() {
        return Arrays.asList(carrera);
    }

      public List<String> getBebida() {
        return Arrays.asList(bebida);
    }
      
       public List<String> getComentario() {
        return Arrays.asList(comentario);
    }
       
       public AnlService(){}
}
