/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sennecuppens.cars.view;

import javafx.scene.control.Label;
import javafx.scene.layout.Region;

/**
 *
 * @author cuppe
 */
 
public class LabelView extends Region {
    
    private String label;
    
    public LabelView(String label) {
        this.label = label;
        createLabel();
    }

    private void createLabel() {
        Label naam = new Label(this.label);
        //textvak
        this.getChildren().add(naam);
    }
}
