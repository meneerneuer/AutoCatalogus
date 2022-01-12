/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sennecuppens.cars.view;

import com.sennecuppens.cars.model.CarsModel;
import com.sennecuppens.cars.model.MerkModel;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author cuppe
 */
public class MerkView extends Region {
    
    MerkModel model;
    
    public MerkView(MerkModel model) {
        this.model = model;
        maakView();
    }

    private void maakView() {
        Rectangle achtergrond = new Rectangle(714, 140);
        achtergrond.setLayoutY(10);
        achtergrond.setFill(Color.valueOf("#a1a1a1"));
        achtergrond.setArcHeight(20);
        achtergrond.setArcWidth(20);
        this.getChildren().add(achtergrond);

        ImageView fotoView = new ImageView();
        //Image foto = ImageModel.stringToImage(model.getFotoLocatie());
        this.getChildren().add(fotoView); 

        TextArea notities = new TextArea();
        notities.setPrefSize(350,90);
        notities.setLayoutX(150);
        notities.setLayoutY(45);
        notities.setPromptText("Notities");
        this.getChildren().add(notities);

        Button openButton = new Button("Open");
        openButton.setStyle("-fx-background-color: #939393; -fx-border-color: #AFAFAF;");
        openButton.setLayoutX(570);
        openButton.setLayoutY(65);
        openButton.setPrefSize(100, 30);
        openButton.setOnMouseClicked(this::openButtonClicked);
        this.getChildren().add(openButton);

        Button wijzigButton = new Button("Wijzig");
        wijzigButton.setStyle("-fx-background-color: #939393; -fx-border-color: #AFAFAF;");
        wijzigButton.setLayoutX(570);
        wijzigButton.setLayoutY(25);
        wijzigButton.setPrefSize(100, 30);
        this.getChildren().add(wijzigButton);

        Button verwijderButton = new Button("Verwijder");
        verwijderButton.setStyle("-fx-background-color: #939393; -fx-border-color: #AFAFAF;");
        verwijderButton.setLayoutX(570);
        verwijderButton.setLayoutY(105);
        verwijderButton.setPrefSize(100, 30);
        this.getChildren().add(verwijderButton);

        Label label = new Label(model.getNaam());
        this.getChildren().add(label);
    }

    private void openButtonClicked(MouseEvent me) {
        CarsModel carsModel = CarsModel.getModel();
        carsModel.selecteerMerk(this.model.getNaam());
    }

}