/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.calculadora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;

/**
 * FXML Controller class
 *
 * @author Jorge Garcia Rodriguez
 */
public class CalculadoraController implements Initializable {

    @FXML
    private TextField ope1;
    @FXML
    private TextField ope2;
    @FXML
    private Button btnSumar;
    @FXML
    private Button btnRestar;
    @FXML
    private Button btnDividir;
    @FXML
    private Button btnMultiplicar;
    @FXML
    private TextField resultado;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        btnSumar.setStyle(
                "-fx-background-color: #3498db80;"
                + "-fx-border-color: #2980b9;"
                + "-fx-border-width: 2;"
                + "-fx-background-radius: 5;"
                + "-fx-border-radius: 5;"
        );

        btnRestar.setStyle(
                "-fx-background-color: #e74c3c;"
                + "-fx-border-color: #c0392b;"
                + "-fx-border-width: 2;"
                + "-fx-background-radius: 5;"
                + "-fx-border-radius: 5;"
        );

        btnMultiplicar.setStyle(
                "-fx-background-color: #2ecc71;"
                + "-fx-border-color: #27ae60;"
                + "-fx-border-width: 2;"
                + "-fx-background-radius: 5;"
                + "-fx-border-radius: 5;"
        );

        btnDividir.setStyle(
                "-fx-background-color: #f1c40f;"
                + "-fx-border-color: #d4ac0d;"
                + "-fx-border-width: 2;"
                + "-fx-background-radius: 5;"
                + "-fx-border-radius: 5;"
        );

    }

    @FXML
    private void Sumar(ActionEvent event) {
        try {
            resultado.setText(Integer.toString(Integer.parseInt(ope1.getText())
                    + Integer.parseInt(ope2.getText())));
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Formato incorrecto");
            alert.showAndWait();
        }
    }

    @FXML
    private void Restar(ActionEvent event) {
        try {
            resultado.setText(Integer.toString(Integer.parseInt(ope1.getText())
                    - Integer.parseInt(ope2.getText())));
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Formato incorrecto");
            alert.showAndWait();
        }
    }

    @FXML
    private void Dividir(ActionEvent event) {
        try {

            resultado.setText(Integer.toString(Integer.parseInt(ope1.getText())
                    / Integer.parseInt(ope2.getText())));
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Formato incorrecto");
            alert.showAndWait();
        } catch (ArithmeticException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Error aritmetico");
            alert.showAndWait();
        }
    }

    @FXML
    private void Multiplicar(ActionEvent event) {
        try {

            resultado.setText(Integer.toString(Integer.parseInt(ope1.getText())
                    * Integer.parseInt(ope2.getText())));
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Formato incorrecto");
            alert.showAndWait();
        }

    }

}
