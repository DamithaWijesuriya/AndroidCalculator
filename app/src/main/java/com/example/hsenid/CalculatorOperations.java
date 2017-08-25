package com.example.hsenid;

import android.widget.EditText;

import java.util.Stack;
import java.util.TreeMap;

/**
 * Created by hsenid on 8/24/17.
 */

public class CalculatorOperations {
    private String displayToString;

    public void setDisplayToString(String buttonClicked, EditText currentDisplay) {
        displayToString = currentDisplay.getText().toString();

        if (!displayToString.matches("")) {
            currentDisplay.setText(displayToString + buttonClicked);
        } else {
            currentDisplay.setText(buttonClicked);
        }
    }

    public Double Calculate(EditText valuesToCalculate) {
        displayToString = valuesToCalculate.getText().toString();
        String[] inputvalueArray = displayToString.split(" ");

        Stack<String> operator = new Stack<>();
        Stack<Double> operand = new Stack<>();
        TreeMap<String, Integer> precedence = new TreeMap();

        precedence.put("+", 1);
        precedence.put("-", 1);
        precedence.put("*", 2);
        precedence.put("/", 2);

        for (int i = 0; i < inputvalueArray.length; i++) {
            String currentToken = inputvalueArray[i];
            if (!precedence.containsKey((currentToken))) {
                operand.push(Double.valueOf(currentToken));
                continue;
            }

            while (true) {
                if (operator.isEmpty() || (precedence.get(currentToken) > precedence.get(operator.peek()))) {
                    operator.push(currentToken);
                    break;
                }
                String op = operator.pop();
                double value2 = Double.valueOf(operand.pop());
                double value1 = Double.valueOf(operand.pop());
                operand.push(evaluateValue(op, value1, value2));
            }

        }
        while (!operator.isEmpty()) {
            String op = operator.pop();
            double value2 = operand.pop();
            double value1 = operand.pop();
            operand.push(evaluateValue(op, value1, value2));
        }
        return operand.pop();

    }

    public double evaluateValue(String op, double value1, double value2) {
        if (op.equals("+")) return value1 + value2;
        if (op.equals("-")) return value1 - value2;
        if (op.equals("/")) return value1 / value2;
        if (op.equals("*")) return value1 * value2;
        throw new RuntimeException("Invalid operator");
    }
}

