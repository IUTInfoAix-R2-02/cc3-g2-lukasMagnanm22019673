package fr.amu.iut.cc3;

import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;


public class ToileController {

    @FXML
    private TextField comp1;

    @FXML
    private TextField comp2;

    @FXML
    private TextField comp3;

    @FXML
    private TextField comp4;

    @FXML
    private TextField comp5;

    @FXML
    private TextField comp6;

    @FXML
    private void tracerButtonClicked() {

        double note1 = Double.parseDouble(comp1.getText());
        double note2 = Double.parseDouble(comp2.getText());
        double note3 = Double.parseDouble(comp3.getText());
        double note4 = Double.parseDouble(comp4.getText());
        double note5 = Double.parseDouble(comp5.getText());
        double note6 = Double.parseDouble(comp6.getText());


        double x1 = getXRadarChart(note1, 1);
        double y1 = getYRadarChart(note1, 1);

        double x2 = getXRadarChart(note2, 2);
        double y2 = getYRadarChart(note2, 2);

        double x3 = getXRadarChart(note3, 3);
        double y3 = getYRadarChart(note3, 3);

        double x4 = getXRadarChart(note4, 4);
        double y4 = getYRadarChart(note4, 4);

        double x5 = getXRadarChart(note5, 5);
        double y5 = getYRadarChart(note5, 5);

        double x6 = getXRadarChart(note6, 6);
        double y6 = getYRadarChart(note6, 6);

    }

    @FXML
    private void viderButtonClicked() {

        comp1.clear();
        comp2.clear();
        comp3.clear();
        comp4.clear();
        comp5.clear();
        comp6.clear();
    }

    @FXML
    private void competenceTextFieldAction() {
        tracerButtonClicked();
    }

    private double getXRadarChart(double value, int axe) {
        double maxNote = 20.0;
        double angle = (2 * Math.PI / 6) * axe;
        double radius = (value / maxNote) * 20.0;
        return Math.cos(angle) * radius;
    }

    private double getYRadarChart(double value, int axe) {
        double maxNote = 20.0;
        double angle = (2 * Math.PI / 6) * axe;
        double radius = (value / maxNote) * 20.0;
        return Math.sin(angle) * radius;
    }
}
