package GaiaProjectAppService.controllers;

import GaiaProjectAppService.utils.RenderingViews;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainViewController implements Initializable {

    @FXML
    public AnchorPane nestedAdaptativeCenterPane;
    public JFXButton logoutButton;
    @FXML
    private JFXButton roleButton;

    @FXML
    Stage stage;

    @FXML
    public void handleButtonAction(ActionEvent actionEvent) throws IOException {
       JFXButton jfxButtonVerifier =  (JFXButton) actionEvent.getSource();

        if(roleButton.equals(jfxButtonVerifier)){
            AnchorPane nestedViewParent = FXMLLoader.load(getClass().getResource("/views/ProfileView.fxml"));

            nestedAdaptativeCenterPane.getChildren().setAll(nestedViewParent);
        }

        if(logoutButton.equals(jfxButtonVerifier)) {
            RenderingViews render= new RenderingViews();
            render.renderStageButton(stage, logoutButton, "/views/LoginView.fxml", "Inicio de Sesion", true, StageStyle.TRANSPARENT, false);
        }

    }

    public void setStage (Stage stage) {
        this.stage = stage;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
}
