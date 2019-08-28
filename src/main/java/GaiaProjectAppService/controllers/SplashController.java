package GaiaProjectAppService.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import GaiaProjectAppService.Animations.*;
import GaiaProjectAppService.utils.HibernateUtil;
import GaiaProjectAppService.utils.RenderingViews;
import javafx.animation.AnimationTimer;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SplashController implements Initializable {
    
    private Integer i = 0;

    @FXML
    private Text lblWelcome;
    @FXML
    private Text lblLoad;
    @FXML
    private VBox vboxBottom;
    @FXML
    private Label lblClose;
    Stage stage;
    private Timeline timeline;
    private AnimationTimer timer;
    final Text text = new Text(i.toString());

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        timeline = new Timeline();
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.setAutoReverse(true);

        FadeInLeftTransition fadeIn = new FadeInLeftTransition(lblWelcome);
        fadeIn.play();
        FadeInRightTransition fadeOut = new FadeInRightTransition(lblLoad);



        fadeOut.setDelay(Duration.seconds(2));
        fadeOut.play();
        FadeInTransition fadeIn2 = new FadeInTransition(vboxBottom);
        fadeIn2.play();

        fadeOut.setOnFinished((e) -> {
            System.out.println("Iniciando...");
            fadeIn.stop();

            HibernateUtil.getInstance().buildSessionFactory();
            HibernateUtil.getInstance().openSessionAndBindToThread();

            RenderingViews render= new RenderingViews();
            render.renderStage(stage, lblClose, "/views/LoginView.fxml", "Inicio de Sesion", true, StageStyle.TRANSPARENT, false);
        });

        lblClose.setOnMouseClicked((event) -> {
            Platform.exit();
            System.exit(0);
        });
    }

}
