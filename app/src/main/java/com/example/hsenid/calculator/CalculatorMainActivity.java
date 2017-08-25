package com.example.hsenid.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.example.hsenid.CalculatorOperations;

public class CalculatorMainActivity extends AppCompatActivity {
    CalculatorOperations calculatorOperations = new CalculatorOperations();
    private String KeybordInput;
    private EditText editTextDisplay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_main);
    }

    public void ClickOnZero(View view) {
        editTextDisplay = (EditText) findViewById(R.id.txtDisplay);
        KeybordInput = "0";
        calculatorOperations.setDisplayToString(KeybordInput, editTextDisplay);

    }

    public void ClickOnplusorMinus(View view) {

    }

    public void clickonequal(View view) {
        editTextDisplay = (EditText) findViewById(R.id.txtDisplay);
        editTextDisplay.setText(calculatorOperations.Calculate(editTextDisplay).toString());
    }

    public void clickonDot(View view) {
        editTextDisplay = (EditText) findViewById(R.id.txtDisplay);
        KeybordInput = " . ";
        calculatorOperations.setDisplayToString(KeybordInput, editTextDisplay);

    }


    public void clickonPlus(View view) {
        editTextDisplay = (EditText) findViewById(R.id.txtDisplay);
        KeybordInput = " + ";
        calculatorOperations.setDisplayToString(KeybordInput, editTextDisplay);
    }

    public void clickonThree(View view) {
        editTextDisplay = (EditText) findViewById(R.id.txtDisplay);
        KeybordInput = "3";
        calculatorOperations.setDisplayToString(KeybordInput, editTextDisplay);
    }

    public void clickonTwo(View view) {
        editTextDisplay = (EditText) findViewById(R.id.txtDisplay);
        KeybordInput = "2";
        calculatorOperations.setDisplayToString(KeybordInput, editTextDisplay);
    }

    public void clickonSubstract(View view) {
        editTextDisplay = (EditText) findViewById(R.id.txtDisplay);
        KeybordInput = " - ";
        calculatorOperations.setDisplayToString(KeybordInput, editTextDisplay);
    }

    public void clickonSix(View view) {
        editTextDisplay = (EditText) findViewById(R.id.txtDisplay);
        KeybordInput = "6";
        calculatorOperations.setDisplayToString(KeybordInput, editTextDisplay);
    }

    public void clickonFive(View view) {
        editTextDisplay = (EditText) findViewById(R.id.txtDisplay);
        KeybordInput = "5";
        calculatorOperations.setDisplayToString(KeybordInput, editTextDisplay);
    }

    public void clickonFour(View view) {
        editTextDisplay = (EditText) findViewById(R.id.txtDisplay);
        KeybordInput = "4";
        calculatorOperations.setDisplayToString(KeybordInput, editTextDisplay);
    }

    public void ClickonOne(View view) {
        editTextDisplay = (EditText) findViewById(R.id.txtDisplay);
        KeybordInput = "1";
        calculatorOperations.setDisplayToString(KeybordInput, editTextDisplay);
    }

    public void ClickonDivide(View view) {
        editTextDisplay = (EditText) findViewById(R.id.txtDisplay);
        KeybordInput = " / ";
        calculatorOperations.setDisplayToString(KeybordInput, editTextDisplay);
    }

    public void ClickOnPercentage(View view) {
        editTextDisplay = (EditText) findViewById(R.id.txtDisplay);
        KeybordInput = " % ";
        calculatorOperations.setDisplayToString(KeybordInput, editTextDisplay);
    }

    public void ClickOnAC(View view) {
        editTextDisplay.setText("");
        KeybordInput = null;
    }

    public void ClickOnMultiple(View view) {
        editTextDisplay = (EditText) findViewById(R.id.txtDisplay);
        KeybordInput = " * ";
        calculatorOperations.setDisplayToString(KeybordInput, editTextDisplay);
    }

    public void ClickOnNine(View view) {
        editTextDisplay = (EditText) findViewById(R.id.txtDisplay);
        KeybordInput = "9";
        calculatorOperations.setDisplayToString(KeybordInput, editTextDisplay);
    }

    public void ClickOnEight(View view) {
        editTextDisplay = (EditText) findViewById(R.id.txtDisplay);
        KeybordInput = "8";
        calculatorOperations.setDisplayToString(KeybordInput, editTextDisplay);
    }

    public void ClickOnSeven(View view) {
        editTextDisplay = (EditText) findViewById(R.id.txtDisplay);
        KeybordInput = "7";
        calculatorOperations.setDisplayToString(KeybordInput, editTextDisplay);
    }

    public void BackSpace(View view) {
        editTextDisplay = (EditText) findViewById(R.id.txtDisplay);
        String displayString = editTextDisplay.getText().toString();
        StringBuilder stringBuilder = new StringBuilder(displayString);
        stringBuilder.deleteCharAt((displayString.length() - 1));
        editTextDisplay.setText(stringBuilder.toString());
    }
}
