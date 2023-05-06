package controller;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class CalFormController {
    @FXML
    private Button btn0;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button btn6;

    @FXML
    private Button btn7;

    @FXML
    private Button btn8;

    @FXML
    private Button btn9;

    @FXML
    private Button btnC;

    @FXML
    private Button btnCE;

    @FXML
    private Button btnDev;

    @FXML
    private Button btnEq;

    @FXML
    private Button btnMulti;

    @FXML
    private Button btnOnOff;

    @FXML
    private Button btnPoint;

    @FXML
    private Button btnSum;

    @FXML
    private Button btnSubs;

    @FXML
    private Label lblAnswer;

    @FXML
    private TextField txtShow;

    private List<Button> btnList;

    public void initialize(){
        btnList = FXCollections.observableArrayList(btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnPoint,btnEq,
                btnSum,btnSubs,btnMulti,btnDev,btnC,btnCE);
        off();
        onOffFunction();
    }

    private void off() {
        for (Button btn:btnList) {
            btn.setDisable(true);
        }
    }

    private void on() {
        for (Button btn:btnList) {
            btn.setDisable(false);
        }
    }

    private void onOffFunction() {
        btnOnOff.setOnAction(event -> {
            if (btnOnOff.getText().equals("ON")){
                on();
                btnOnOff.setText("OFF");
            }else if (btnOnOff.getText().equals("OFF")){
                off();
                btnOnOff.setText("ON");
            }
        });
    }

}
