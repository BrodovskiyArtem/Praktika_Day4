package com.example.pr;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.print.PrinterJob;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import java.net.URL;
import java.util.ResourceBundle;

public class Magazin {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button button5;

    @FXML
    private Button button4;

    @FXML
    private Button button3;

    @FXML
    private Button button2;

    @FXML
    private TextField TE1;

    @FXML
    private TextField TE6;

    @FXML
    private TextField TE5;

    @FXML
    private TextField TE4;

    @FXML
    private TextField TE3;

    @FXML
    private TextField TE2;

    @FXML
    private ComboBox<?> ComboBox1;

    @FXML
    private Button button6;

    @FXML
    void initialize() {
        assert button5 != null : "fx:id=\"button5\" was not injected: check your FXML file 'form1.fxml'.";
        assert button4 != null : "fx:id=\"button4\" was not injected: check your FXML file 'form1.fxml'.";
        assert button3 != null : "fx:id=\"button3\" was not injected: check your FXML file 'form1.fxml'.";
        assert button2 != null : "fx:id=\"button2\" was not injected: check your FXML file 'form1.fxml'.";
        assert TE1 != null : "fx:id=\"TE1\" was not injected: check your FXML file 'form1.fxml'.";
        assert TE6 != null : "fx:id=\"TE6\" was not injected: check your FXML file 'form1.fxml'.";
        assert TE5 != null : "fx:id=\"TE5\" was not injected: check your FXML file 'form1.fxml'.";
        assert TE4 != null : "fx:id=\"TE4\" was not injected: check your FXML file 'form1.fxml'.";
        assert TE3 != null : "fx:id=\"TE3\" was not injected: check your FXML file 'form1.fxml'.";
        assert TE2 != null : "fx:id=\"TE2\" was not injected: check your FXML file 'form1.fxml'.";
        assert ComboBox1 != null : "fx:id=\"ComboBox1\" was not injected: check your FXML file 'form1.fxml'.";
        assert button6 != null : "fx:id=\"button6\" was not injected: check your FXML file 'form1.fxml'.";
        ComboBox1.setDisable(true);
        button6.setDisable(true);
    }
    @FXML
    void button4(ActionEvent event) {
        TE1.setText("5831");
        TE2.setText("EGLO Австрия");
        TE3.setText("60");
        TE4.setText("Висота - 170, Ширина - 38");
        ComboBox1.setDisable(false);
        button6.setDisable(false);
    }
    @FXML
    void button2(ActionEvent event) {
        TE1.setText("980");
        TE2.setText("VASMAR Украина");
        TE3.setText("50");
        TE4.setText("Висота - 117, Ширина - 6");
        ComboBox1.setDisable(false);
        button6.setDisable(false);
    }
    @FXML
    void button3(ActionEvent event) {
        TE1.setText("89");
        TE2.setText("VASMAR Украина");
        TE3.setText("11");
        TE4.setText("Висота - 12, Ширина - 6");
        ComboBox1.setDisable(false);
        button6.setDisable(false);
    }
    @FXML
    void button5(ActionEvent event) {
        TE1.setText("1985");
        TE2.setText("KANLUX Польша");
        TE3.setText("6.5");
        TE4.setText("Висота - 67, Ширина - 6.4, Діагональ - 17.3");
        ComboBox1.setDisable(false);
        button6.setDisable(false);
    }
    @FXML
    void button6(ActionEvent event) {
        // Создаем узел для печати текста
        String comboBoxValue = ComboBox1.getValue() != null ? ComboBox1.getValue().toString() : "";
        Text textToPrint = new Text("TE1: " + TE1.getText() + "\n" +
                "TE2: " + TE2.getText() + "\n" +
                "TE3: " + TE3.getText() + "\n" +
                "TE4: " + TE4.getText() + "\n" +
                "Selected value: " + comboBoxValue);
        PrinterJob job = PrinterJob.createPrinterJob();
        if (job != null) {
            boolean printed = job.printPage(textToPrint);
            if (printed) {
                job.endJob();
            } else {
                System.out.println("Failed to print.");
            }
        } else {
            System.out.println("Could not create printer job.");
        }
    }
    @FXML
    void button8(ActionEvent event) {
        // Получаем данные из полей и комбо бокса
        String field2 = TE2.getText();
        String field3 = TE3.getText();
        String field4 = TE4.getText();
        String comboBoxValue = ComboBox1.getValue() != null ? ComboBox1.getValue().toString() : "";
        if (comboBoxValue.isEmpty()) {
            showErrorAlert("Помилка", "Виберіть кількість товару");
            return;
        }
        int field1Value = Integer.parseInt(TE1.getText());
        int comboBoxIntValue = Integer.parseInt(comboBoxValue);
        int result = field1Value * comboBoxIntValue;
        String message = "Виробник: " + field2 + "\n" +
                "Потужність (ВТ): " + field3 + "\n" +
                "Розміри (см): " + field4 + "\n" +
                "Кількість (шт): " + comboBoxValue + "\n" +
                "Загальна сумма в грн: " + result;
        showAlert("Данні", message, AlertType.INFORMATION);
    }
    private void showAlert(String title, String message, AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    private void showErrorAlert(String title, String message) {
        showAlert(title, message, AlertType.ERROR);
    }
    }
