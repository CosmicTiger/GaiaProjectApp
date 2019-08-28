package GaiaProjectAppService.utils;

import com.jfoenix.controls.JFXButton;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

/**
 *
 * @author Oliverhacker
 */
public class RenderingViews {

    public static ObservableList<String> cargos = FXCollections.observableArrayList();
    public static int id;
    public static String fechahoy;
    public static int MedicoId;

    public RenderingViews() {


    }
    public static void dialog(Alert.AlertType alertType, String s){
        Alert alert = new Alert(alertType,s);
        alert.initStyle(StageStyle.UTILITY);
        alert.initModality(Modality.APPLICATION_MODAL);
        alert.setTitle("Info");
        alert.showAndWait();
    }

    public void renderStage(Stage stage, Label lb, String load, String judul, boolean resize, StageStyle style, boolean maximized){
        try {
            Stage stageRendered = new Stage();
            stage = (Stage) lb.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource(load));
            Scene scene = new Scene(root);
            stageRendered.initStyle(style);
            stageRendered.setResizable(resize);
            stageRendered.setMaximized(maximized);
            stageRendered.setTitle(judul);
            stageRendered.setScene(scene);
            stageRendered.show();
            stage.close();
        } catch (Exception e) {
        }
    }

    public void renderStageButton(Stage stage, JFXButton lb, String load, String judul, boolean resize, StageStyle style, boolean maximized){
        try {
            Stage stageRendered = new Stage();
            stage = (Stage) lb.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource(load));
            Scene scene = new Scene(root);
            stageRendered.initStyle(style);
            stageRendered.setResizable(resize);
            stageRendered.setMaximized(maximized);
            stageRendered.setTitle(judul);
            stageRendered.setScene(scene);
            stageRendered.show();
            stage.close();
        } catch (Exception e) {
        }
    }

    public void newStage(int i,ObservableList<String> c, Stage stage, Label lb, String load, String judul, boolean resize, StageStyle style, boolean maximized){
        try {
            id=i;
            System.out.println(id);
            cargos=c;
            System.out.println(cargos);
            Stage st = new Stage();
            stage = (Stage) lb.getScene().getWindow();
            System.out.println("Abriendo nuevo scene");
            Parent root = FXMLLoader.load(getClass().getResource(load));
            Scene scene = new Scene(root);
            st.initStyle(style);
            st.setResizable(resize);
            st.setMaximized(maximized);
            st.setTitle(judul);
            st.setScene(scene);
            st.show();
            stage.close();
        } catch (Exception e) {
        }
    }


    public void newStageroot(Stage stage, Button btnCancelar, String load, String judul, boolean resize, StageStyle style, boolean maximized){
        try {

            Stage st = new Stage();
            stage = (Stage) btnCancelar.getScene().getWindow();
            System.out.println("Abriendo nuevo scene");
            Parent root = FXMLLoader.load(getClass().getResource(load));
            Scene scene = new Scene(root);
            st.initStyle(style);
            st.setResizable(resize);
            st.setMaximized(maximized);
            st.setTitle(judul);
            st.setScene(scene);
            st.show();
            stage.close();
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
        }
    }

    public void renderingUI(String ui, BorderPane adaptivePane){
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource(ui));
        } catch (IOException e) {
            e.printStackTrace();
        }

        adaptivePane.setCenter(root);
    }

    public void newStage2(Stage stage, Button lb, String load, String judul, boolean resize, StageStyle style, boolean maximized){
        try {
            Stage st = new Stage();
            stage = (Stage) lb.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource(load));
            Scene scene = new Scene(root);
            st.initStyle(style);
            st.setResizable(resize);
            st.setMaximized(maximized);
            st.setTitle(judul);
            st.setScene(scene);
            st.show();
            stage.close();
        } catch (Exception e) {
        }
    }

    public static void setModelColumn(TableColumn tb, String a){
        tb.setCellValueFactory(new PropertyValueFactory(a));
    }

}
