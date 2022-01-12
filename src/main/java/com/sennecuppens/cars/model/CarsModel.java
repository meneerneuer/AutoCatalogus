/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sennecuppens.cars.model;

import java.util.ArrayList;

import com.sennecuppens.cars.MainMenuFXMLController;

/**
 *
 * @author cuppe
 */
public class CarsModel {
    
    private static CarsModel model;
    private static MainMenuFXMLController controller;
    private ArrayList<MerkModel> MerkModels;
    public String geselecteerdMerk;

    public CarsModel() {
        this.MerkModels = new ArrayList<>();
    }


    public void addController(MainMenuFXMLController controller) {
        CarsModel.controller = controller;
    }

    public MainMenuFXMLController getController() {
        return CarsModel.controller;
    }

    public static CarsModel getModel() {
        if (CarsModel.model == null) {
            CarsModel.model = new CarsModel();
        }
        return CarsModel.model;
    }


    public void addMerkModel(String naam) {
        this.MerkModels.add(new MerkModel(naam));
    }
    

    public ArrayList<MerkModel> getMerkModels() {
        return this.MerkModels;
    }


    public void selecteerMerk(String merkNaam) {
        this.geselecteerdMerk = merkNaam;
    }

    public String getGeselecteerdMerk() {
        return this.geselecteerdMerk;
    }

    public boolean isMerkGeselecteerd() {
        if (this.geselecteerdMerk == null) {
            return false;
        }

        return true;
    }

    public void deselecteerMerk() {
        this.geselecteerdMerk = null;
    }
}
