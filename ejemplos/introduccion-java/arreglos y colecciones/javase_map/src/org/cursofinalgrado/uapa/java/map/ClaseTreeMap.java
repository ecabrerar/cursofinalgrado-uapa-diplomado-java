/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.cursofinalgrado.uapa.java.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author ecabrerar
 */
public class ClaseTreeMap {
    public static void main(String[] args) {
        
        TreeMap<String, String> libros = new TreeMap<String, String>();
          libros.put("principito", "El Principito");
        libros.put("gaviota", "Juan Salvador Gaviota");

        for (Map.Entry book : libros.entrySet()) {
            System.out.println("Llave: " + book.getKey() + " Valor:" + book.getValue());

        }
        
        System.out.println(" Llave principito es "+libros.get("principito"));

    }
}
