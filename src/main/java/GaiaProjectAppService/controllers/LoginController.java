package GaiaProjectAppService.controllers;

import GaiaProjectAppService.models.dao.entity.UserDAO;
import GaiaProjectAppService.models.dao.entity.UserDAOImp;
import GaiaProjectAppService.utils.Message;
import GaiaProjectAppService.utils.RenderingViews;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import javafx.event.ActionEvent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.net.URL;
import java.util.List;
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

    Message message = new Message();

    private UserDAO userDao = new UserDAOImp();

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

            if (usernameTextfield.getText().trim().isEmpty() || passwordTextfield.getText().isEmpty()) {
                message.messageDialogError("Campos Requeridos");
            } else {
                try {
                    User user = userDao.findByUserName(usernameTextfield.getText().trim(), passwordTextfield.getText());

                    if (user != null) {
                        renderingViews.newStageroot(stage,loginButton,"/views/DashboardView.fxml","probando",false, StageStyle.UNDECORATED,true);
                    } else {
                        message.messageDialogError("Error en Credenciales");
                    }
/*
                    User userInsert = new User();
                    userInsert.setIdUser(2);
                    userInsert.setIdStaff(2);
                    userInsert.setUsername("wuaso");
                    userInsert.setPassword("simon");
                    userInsert.setProfilePhoto("");
                    userInsert.setSecurityQuestion("QUe onda?");
                    userInsert.setSecurityAnswer("que norri");
                    userDao.saveOrUpdate(userInsert);*/

                    List<User> users = userDao.findAll();
                    users.forEach(user1 -> System.out.println(user1.getUsername()));

                } catch (Exception ex) {
                    ex.printStackTrace();
                    System.err.println("Error al cargar pantalla principal " + ex.getCause());
                }
            }
        }
    }

    public void setStage(Stage stage) { this.stage = stage;}

}
