/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GaiaProjectAppService.utils;

import javafx.scene.control.Alert;
import javafx.stage.StageStyle;

/**
 *
 * @author joker
 */
public class Message {

    public Message() {
    }

    public void messageDialogError(String ContentText) {
        Alert alert = new Alert(Alert.AlertType.ERROR);

        alert.setTitle("Error");
        alert.setContentText(ContentText);
        alert.initStyle(StageStyle.TRANSPARENT);
        alert.showAndWait();
    }

    public void messageDialogInformation(String ContentText) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        alert.setTitle("Accept");
        alert.setContentText(ContentText);
        alert.initStyle(StageStyle.TRANSPARENT);
        alert.showAndWait();
    }

}
