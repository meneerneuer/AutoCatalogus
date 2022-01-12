package com.sennecuppens.cars;

import java.net.URL;
import java.util.ResourceBundle;

import com.sennecuppens.cars.model.CarsModel;
import com.sennecuppens.cars.model.MerkModel;
import com.sennecuppens.cars.model.SchermModel;
import com.sennecuppens.cars.view.LabelView;
import com.sennecuppens.cars.view.MerkView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class MainMenuFXMLController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane apMainMenu;

    @FXML
    private VBox vbItemField;

    @FXML
    private VBox vbLabels;

    @FXML
    private ImageView ivImage;

    @FXML
    private Label lblBrand;

    @FXML
    private MenuItem btnClose;

    @FXML
    private MenuItem btnSave;

    @FXML
    private MenuItem btnAdd;

    @FXML
    private MenuItem btnLabels;

    @FXML
    private MenuItem btnLabels2;

    @FXML
    private Button btnWatchCars;

    @FXML
    private Button btnEditBrand;

    @FXML
    private Button btnDeleteBrand;


    private CarsModel model;

    @FXML
    void initialize() {
        this.model = CarsModel.getModel();
        this.model.addController(this);
        this.model.addMerkModel("TestNaam");
        this.model.addMerkModel("TweedeNaam");

        initButtons();
        update();
    }


    private void initButtons() {
        // Voeg merk toe knop
        this.btnAdd.setOnAction((ActionEvent ae) -> {
            SchermModel.newScherm("EditMerkFXML");
        });

        // Voeg label knop toe
        this.btnLabels.setOnAction((ActionEvent ae) -> {
            SchermModel.newScherm("EditLabelsFXML");
        });
    }


    public void update() {
        this.vbItemField.getChildren().clear();
        this.vbLabels.getChildren().clear();

        for (MerkModel merkModel: this.model.getMerkModels()) {
            MerkView merkView = new MerkView(merkModel);
            this.vbItemField.getChildren().add(merkView);
        }
        for (String label: MerkModel.getLabels()) {
            LabelView labelView = new LabelView(label);
            this.vbLabels.getChildren().add(labelView);
        }
    }

}