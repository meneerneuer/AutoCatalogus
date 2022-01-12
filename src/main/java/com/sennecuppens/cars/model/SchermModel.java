/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sennecuppens.cars.model;

import java.io.IOException;
import java.util.ArrayList;

import com.sennecuppens.cars.App;

import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author cuppe
 */
public class SchermModel {
    
    private static ArrayList<Stage> stages = new ArrayList<>();
    private static ArrayList<String> stagesString = new ArrayList<>();


    public static boolean newScherm(String fxml) {
        try {
            Stage stage = new Stage();
            Scene scene = new Scene(App.loadFXML(fxml), 400, 500);
            stage.setScene(scene);
            stage.show();
            stages.add(stage);
            stagesString.add(fxml);
            return true;
        } catch(IOException ex) {
            ex.printStackTrace();
        }
        return false;
    }


    public static void closeScherm(String fxml) {
        int index = stagesString.indexOf(fxml);
        Stage stage = stages.get(index);
        stage.close();
        stages.remove(index);
        stagesString.remove(index);
    }

}
