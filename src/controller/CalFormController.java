package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

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

    public void initialize(){
        off();
        onOffFunction();
    }

    private void off() {
        btn0.setDisable(true);
        btn1.setDisable(true);
        btn2.setDisable(true);
        btn3.setDisable(true);
        btn4.setDisable(true);
        btn5.setDisable(true);
        btn6.setDisable(true);
        btn7.setDisable(true);
        btn8.setDisable(true);
        btn9.setDisable(true);
        btnEq.setDisable(true);
        btnPoint.setDisable(true);
        btnSum.setDisable(true);
        btnSubs.setDisable(true);
        btnMulti.setDisable(true);
        btnDev.setDisable(true);
        btnC.setDisable(true);
        btnCE.setDisable(true);
    }

    private void on() {
        btn0.setDisable(false);
        btn1.setDisable(false);
        btn2.setDisable(false);
        btn3.setDisable(false);
        btn4.setDisable(false);
        btn5.setDisable(false);
        btn6.setDisable(false);
        btn7.setDisable(false);
        btn8.setDisable(false);
        btn9.setDisable(false);
        btnEq.setDisable(false);
        btnPoint.setDisable(false);
        btnSum.setDisable(false);
        btnSubs.setDisable(false);
        btnMulti.setDisable(false);
        btnDev.setDisable(false);
        btnC.setDisable(false);
        btnCE.setDisable(false);
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
