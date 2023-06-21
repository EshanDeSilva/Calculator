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
    private double answer;
    private String function;

    public void initialize(){
        answer=0;
        function="empty";
        btnList = FXCollections.observableArrayList(btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnPoint,btnEq,
                btnSum,btnSubs,btnMulti,btnDev,btnC,btnCE);
        off();
        onOffFunction();
        setAnswer();

        functions();
    }

    private void functions() {
        btnC.setOnAction(event -> {
            txtShow.clear();
        });
        btnCE.setOnAction(event -> {
            function = "empty";
            answer = 0;
            lblAnswer.setText("0");
        });

        btn0.setOnAction(event -> {
            txtShow.setText(txtShow.getText()!=null? txtShow.getText()+"0":"0");
        });
        btn1.setOnAction(event -> {
            txtShow.setText(txtShow.getText()!=null? txtShow.getText()+"1":"1");
        });
        btn2.setOnAction(event -> {
            txtShow.setText(txtShow.getText()!=null? txtShow.getText()+"2":"2");
        });
        btn3.setOnAction(event -> {
            txtShow.setText(txtShow.getText()!=null? txtShow.getText()+"3":"3");
        });
        btn4.setOnAction(event -> {
            txtShow.setText(txtShow.getText()!=null? txtShow.getText()+"4":"4");
        });
        btn5.setOnAction(event -> {
            txtShow.setText(txtShow.getText()!=null? txtShow.getText()+"5":"5");
        });
        btn6.setOnAction(event -> {
            txtShow.setText(txtShow.getText()!=null? txtShow.getText()+"6":"6");
        });
        btn7.setOnAction(event -> {
            txtShow.setText(txtShow.getText()!=null? txtShow.getText()+"7":"7");
        });
        btn8.setOnAction(event -> {
            txtShow.setText(txtShow.getText()!=null? txtShow.getText()+"8":"8");
        });
        btn9.setOnAction(event -> {
            txtShow.setText(txtShow.getText()!=null? txtShow.getText()+"9":"9");
        });
        btnPoint.setOnAction(event -> {
            txtShow.setText(txtShow.getText()!=null? txtShow.getText()+".":"0.");
        });
        btnSum.setOnAction(event -> {
            action();
            function = "sum";
        });
        btnSubs.setOnAction(event -> {
            action();
            function = "sub";
        });
        btnMulti.setOnAction(event -> {
            action();
            function = "multi";
        });
        btnDev.setOnAction(event -> {
            action();
            function = "dev";
        });
        btnEq.setOnAction(event -> {
            action();
            function = "equal";
        });
    }

    private void setAnswer(){
        lblAnswer.setText(String.format("%.02f",answer));
        txtShow.clear();
    }

    private void action() {
        switch (function){
            case "empty" : answer = Double.parseDouble(txtShow.getText());
                            setAnswer();break;
            case "sum" : answer += Double.parseDouble(txtShow.getText());
                            setAnswer();break;
            case "sub" : answer -= Double.parseDouble(txtShow.getText());
                            setAnswer();break;
            case "multi" : answer *= Double.parseDouble(txtShow.getText());
                            setAnswer();break;
            case "dev" : answer /= Double.parseDouble(txtShow.getText());
                            setAnswer();break;
            case "equal" : setAnswer();break;
        }
    }

    private void off() {
        for (Button btn:btnList) {
            btn.setDisable(true);
        }
        txtShow.clear();
        answer = 0;
        setAnswer();
    }

    private void on() {
        for (Button btn:btnList) {
            btn.setDisable(false);
        }
        txtShow.clear();
        answer = 0;
        setAnswer();
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
