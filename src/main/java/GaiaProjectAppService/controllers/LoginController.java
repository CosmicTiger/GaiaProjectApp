package GaiaProjectAppService.controllers;

import GaiaProjectAppService.utils.Message;
import GaiaProjectAppService.utils.RenderingViews;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.event.ActionEvent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    private TextField usernameTextfield;
    @FXML
    private Button exitButton;

    @FXML
    private Button loginButton;

    @FXML
    private PasswordField passwordTextfield;

    Stage stage;

    // Master Credentials
    private String user = "admin";
    private String password = "admin";

    Message message = new Message();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    public void handleButtonAction(ActionEvent actionEvent) {
        Button buttonVerifier = (Button) actionEvent.getSource();

        if (exitButton.equals(buttonVerifier)) {
            System.exit(0);
        }

        if (loginButton.equals(buttonVerifier)) {
            RenderingViews renderingViews = new RenderingViews();

            if (usernameTextfield.getText().isEmpty() || passwordTextfield.getText().isEmpty()) {
                message.messageDialogError("Campos Requeridos");
            } else {
                try {
                    if (usernameTextfield.getText().equalsIgnoreCase(user) && passwordTextfield.getText().equals(password)) {
                       renderingViews.newStageroot(stage,loginButton,"/views/DashboardView.fxml","probando",false, StageStyle.UNDECORATED,true);
                    } else {
                        message.messageDialogError("Error en Credenciales");

                        clean();
                    }

                } catch (Exception ex) {
                    System.err.println("Error al cargar pantalla principal " + ex.getCause());
                }
            }
        }
    }

    public void setStage(Stage stage) { this.stage = stage;}

    private void clean() {
        usernameTextfield.setText("");
        passwordTextfield.setText("");
    }
}
