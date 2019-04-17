package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import java.lang.Math;

import java.util.ArrayList;

import static java.lang.Math.sqrt;
import java.lang.String;



public class Controller {

    public TextField areaDisplay;
    String display = "";
    ArrayList<String> showNums = new ArrayList<>();
    ArrayList<String> operations = new ArrayList<>();


    public double varResult = 0;
    public int pos = 0;
    double pi;
    int a;

    public void Zero(ActionEvent actionEvent) {
        display+="0";
        areaDisplay.setText(display);
    }

    public void One(ActionEvent actionEvent) {
        display+="1";
        areaDisplay.setText(display);
    }

    public void Two(ActionEvent actionEvent) {
        display+="2";
        areaDisplay.setText(display);
    }

    public void Three(ActionEvent actionEvent) {
        display+="3";
        areaDisplay.setText(display);
    }

    public void Four(ActionEvent actionEvent) {
        display+="4";
        areaDisplay.setText(display);
    }

    public void Five(ActionEvent actionEvent) {
        display+="5";
        areaDisplay.setText(display);
    }

    public void Six(ActionEvent actionEvent) {
        display+="6";
        areaDisplay.setText(display);
    }

    public void Seven(ActionEvent actionEvent) {
        display+="7";
        areaDisplay.setText(display);
    }

    public void Eight(ActionEvent actionEvent) {

        display+="8";
        areaDisplay.setText(display);
    }

    public void Nine(ActionEvent actionEvent) {
        display+="9";
        areaDisplay.setText(display);
    }

    public void addNumbers(ActionEvent actionEvent) {
        operations.add("+");
        showNums.add(display);
        displayNumber();
        display = "";
    }
    public void minusNumbers(ActionEvent actionEvent) {
        operations.add("-");
        showNums.add(display);
        displayNumber();
        display = "";
    }


    public void multiplyNumbers(ActionEvent actionEvent) {
        operations.add("*");
        showNums.add(display);
        displayNumber();
        display = "";
    }
    public void divideNumbers(ActionEvent actionEvent) {
        operations.add("/");
        showNums.add(display);
        displayNumber();
        display = "";
    }
    public void insertPercentage(ActionEvent actionEvent) {
        operations.add("%");
        showNums.add(display);
        displayNumber();
    }

    public void getSQRT(ActionEvent actionEvent) {
        operations.add("S");
        showNums.add(display);
        displayNumber();
    }

    public void switchSign(ActionEvent actionEvent) {
        if (areaDisplay.getText().contains("-")){
            areaDisplay.setText(areaDisplay.getText().substring(1));
        }
        else {
            areaDisplay.setText("-" + areaDisplay.getText());
        }
    }

    public void addDecimal(ActionEvent actionEvent) {


        display+=".";
        areaDisplay.setText(display);

    }

    public void getTotalAns(ActionEvent actionEvent) {
        showNums.add(display);
        displayNumber();
        clearAll();
        display = areaDisplay.getText();
    }

    public double getAns(){

        varResult = Double.parseDouble(showNums.get(0));
        pos = 0;
        if (operations.get(pos).equals("S") | operations.get(pos).equals("%") | operations.get(pos).equals("^") ){
            a = 0;
        } else {
            a = 1;
        }


        for (int i=a; i<showNums.size();i++){
            if (operations.get(pos).equals("+")) {
                varResult+= Double.parseDouble(showNums.get(i));

            } else if(operations.get(pos).equals("-")){
                varResult-= Double.parseDouble(showNums.get(i));

            } else if(operations.get(pos).equals("*")){
                varResult*= Double.parseDouble(showNums.get(i));

            } else if(operations.get(pos).equals("/")){
                varResult/= Double.parseDouble(showNums.get(i));

            } else if(operations.get(pos).equals("S")){
                varResult = sqrt(varResult);
            } else if(operations.get(pos).equals("%")){
                varResult = varResult + varResult/100;
            } else if(operations.get(pos).equals("^")){
                varResult = varResult*varResult;
            }
            pos++;
        }

        return varResult;
    }


    void clearAll(){

        pos = 0;
        operations.clear();
        showNums.clear();
        display = "";

    }
    public void deleteLastInt(ActionEvent actionEvent) {
        display = areaDisplay.getText();
        if(display.length()>1) {
            display = display.substring(0, display.length() - 1);
            areaDisplay.setText(display);
        }else{
            display="0";
            areaDisplay.setText(display);
        }

    }

    public void insertPower(ActionEvent actionEvent) {
        operations.add("^");
        showNums.add(display);
        displayNumber();

    }

    public void addPi(ActionEvent actionEvent) {

        pi = 3.14159265359;
        display = Double.toString(pi);
        areaDisplay.setText(display);
    }

    public void clearInt(ActionEvent actionEvent) {
        areaDisplay.clear();
        areaDisplay.setText("0");
        display = "";
        varResult = 0;
        showNums.clear();
        operations.clear();
        varResult = 0;
        pos = 0;
        pi = 0;

    }
    boolean intCheck(Double n){
        if((n%1) == 0){
            return true;
        } else {
            return false;
        }
    }
    void displayNumber(){
        if(!showNums.isEmpty() & display !="") {
            if (intCheck(getAns())) {

                areaDisplay.setText(Integer.toString((int)getAns()));
            }
            else {
                areaDisplay.setText(Double.toString(getAns()));
            }
        }else{
            clearAll();
        }
    }
}
