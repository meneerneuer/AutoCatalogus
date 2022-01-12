/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sennecuppens.cars.model;

import java.util.ArrayList;

/**
 *
 * @author cuppe
 */
public class MerkModel {
    
    private String naam;
    private String fotoLocatie;
    private String notitie;

    private ArrayList<AutoModel> autos;
    private static ArrayList<String> labels = new ArrayList<>();

    public MerkModel(String naam) {
        this.naam = naam;
        this.autos = new ArrayList<>();
    }

    
    /**
     * @param naam de naam van het autoModel.
     *
     * @return het autoModel voor de opgegeven naam. Null als deze niet bestaat.
     */
    public AutoModel getAuto(String naam) {
        for (AutoModel autoModel: this.autos) {
            if (autoModel.getNaam() == naam) {
                return autoModel;
            }
        }
        return null;
    }


    // Getters

    // Static getters
    public static ArrayList<String> getLabels() {
        return MerkModel.labels;
    }

    // Non-static getters
    public String getNaam() {
        return this.naam;
    }

    public String getFotoLocatie() {
        return this.fotoLocatie;
    }

    public String getNotitie() {
        return this.notitie;
    }


    // Setters

    // Static setters
    public static void setLabel(String label) {
        MerkModel.labels.add(label);
    }

    // Non-static setters
    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setNotitie(String notitie) {
        this.notitie = notitie;
    }

    public void setFotoLocatie(String locatie) {
        this.fotoLocatie = locatie;
    }

}
