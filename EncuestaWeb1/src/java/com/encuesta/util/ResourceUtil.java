/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.encuesta.util;
import javax.faces.context.FacesContext;
/**
 *
 * @author Juan Gallo
 */
public class ResourceUtil {
    public static String getString(String key) {
        FacesContext context = FacesContext.getCurrentInstance();
        String value = context.getApplication().evaluateExpressionGet(context, key, String.class);
         
        return value;
    }
}
