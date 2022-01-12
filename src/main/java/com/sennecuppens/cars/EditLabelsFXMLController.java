package com.sennecuppens.cars;

import java.net.URL;
import java.util.ResourceBundle;

import com.sennecuppens.cars.model.CarsModel;
import com.sennecuppens.cars.model.MerkModel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class EditLabelsFXMLController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button BtnVoegToe;

    @FXML
    private TextField TFLabelNaam;

    @FXML
    void initialize() {
        this.BtnVoegToe.setOnAction(this::onVoegToeIngedrukt);
    }

    private void onVoegToeIngedrukt(ActionEvent event) {
        if (TFLabelNaam.getText() != "") {
            MerkModel.setLabel(TFLabelNaam.getText());
            CarsModel.getModel().getController().update();
            
        }
        
    }

}
