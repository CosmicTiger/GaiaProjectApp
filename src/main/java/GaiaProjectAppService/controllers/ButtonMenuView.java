package GaiaProjectAppService.controllers;

import com.jfoenix.controls.JFXButton;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ButtonMenuView implements Initializable {

    @FXML
    private JFXButton bttnAdmin;

    @FXML
    private JFXButton bttnVet;

    @FXML
    private JFXButton bttnBotanical;

    @FXML
    private JFXButton bttnCaretaker;

    @FXML
    private JFXButton bttnSecurity;

    @FXML
    private JFXButton bttnHide;

    @FXML
    private AnchorPane adaptativePanel;

    private MainViewController homeViewController;

    private BorderPane borderPane;

    private void setIconAdmin() {
        FontAwesomeIconView fontAwesomeIconView =
                new FontAwesomeIconView(FontAwesomeIcon.ARCHIVE);

        fontAwesomeIconView.setFill(Paint.valueOf("WHITE"));
        fontAwesomeIconView.setGlyphSize(40);

        bttnAdmin.setGraphic(fontAwesomeIconView);
    }

    private void setIconVet() {
        FontAwesomeIconView fontAwesomeIconView =
                new FontAwesomeIconView(FontAwesomeIcon.PAW);

        fontAwesomeIconView.setFill(Paint.valueOf("WHITE"));
        fontAwesomeIconView.setGlyphSize(40);

        bttnVet.setGraphic(fontAwesomeIconView);
    }

    private void setIconBotanical() {
        FontAwesomeIconView fontAwesomeIconView =
                new FontAwesomeIconView(FontAwesomeIcon.TREE);

        fontAwesomeIconView.setFill(Paint.valueOf("WHITE"));
        fontAwesomeIconView.setGlyphSize(40);

        bttnBotanical.setGraphic(fontAwesomeIconView);
    }

    private void setIconCaretaker() {
        FontAwesomeIconView fontAwesomeIconView =
                new FontAwesomeIconView(FontAwesomeIcon.BINOCULARS);

        fontAwesomeIconView.setFill(Paint.valueOf("white"));
        fontAwesomeIconView.setGlyphSize(40);

        bttnCaretaker.setGraphic(fontAwesomeIconView);
    }

    private void setIconSecurity() {
        FontAwesomeIconView fontAwesomeIconView =
                new FontAwesomeIconView(FontAwesomeIcon.USER_SECRET);

        fontAwesomeIconView.setFill(Paint.valueOf("white"));
        fontAwesomeIconView.setGlyphSize(40);

        bttnSecurity.setGraphic(fontAwesomeIconView);
    }

    private void setIconHide() {
        FontAwesomeIconView fontAwesomeIconView =
                new FontAwesomeIconView(FontAwesomeIcon.HOURGLASS_END);

        fontAwesomeIconView.setFill(Paint.valueOf("white"));
        fontAwesomeIconView.setGlyphSize(40);

        bttnHide.setGraphic(fontAwesomeIconView);
    }

    public void handleButtonAction(ActionEvent actionEvent) throws IOException {
        JFXButton jfxButtonVerifier = (JFXButton) actionEvent.getSource();

        if (bttnAdmin.equals(jfxButtonVerifier)) {
            Parent administrationParent = FXMLLoader.load(getClass().getResource("/views/AdministrationView.fxml"));
            Scene administrationScene = new Scene(administrationParent);

            Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            window.setScene(administrationScene);
            window.setMaxWidth(200);
            window.show();
        }

        if (bttnVet.equals(jfxButtonVerifier)) {
            Parent administrationParent = FXMLLoader.load(getClass().getResource("/views/VeterinaryView.fxml"));
            Scene administrationScene = new Scene(administrationParent);

            Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

            window.setScene(administrationScene);
            window.setResizable(true);
            window.setTitle("Celestia Application Service Provider - Veterinario");
            window.show();
        }

        if (bttnBotanical.equals(jfxButtonVerifier)) {
            AnchorPane botanicalViewPane = FXMLLoader.load(getClass().getResource("/views/BotanicalView.fxml"));


        }

        if (bttnCaretaker.equals(jfxButtonVerifier)) {
            Parent administrationParent = FXMLLoader.load(getClass().getResource("/views/CaretakerView.fxml"));
            Scene administrationScene = new Scene(administrationParent);

            Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

            window.setScene(administrationScene);
            window.setResizable(true);
            window.setTitle("Celestia Application Service Provider - Cuidador");
            window.show();
        }

        if (bttnSecurity.equals(jfxButtonVerifier)) {
            Parent administrationParent = FXMLLoader.load(getClass().getResource("/views/SecurityView.fxml"));
            Scene administrationScene = new Scene(administrationParent);

            Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

            window.setScene(administrationScene);
            window.setResizable(true);
            window.setTitle("Celestia Application Service Provider - Seguridad");
            window.show();
        }

        if (bttnHide.equals(jfxButtonVerifier)) {

        }
    }

    public void ShowingScene(MouseEvent mouseEvent, String nameScene, String title) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource(nameScene));
        Stage stage = new Stage();
        Scene scene = new Scene(parent);
        stage.setScene(scene);

        stage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setIconAdmin();
        setIconBotanical();
        setIconCaretaker();
        setIconSecurity();
        setIconVet();
        setIconHide();
    }


}
