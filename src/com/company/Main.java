package com.company;

import com.sun.javafx.css.Style;
import com.sun.org.apache.bcel.internal.generic.Select;

public class Main {
    static double answer=0;
    static int x;
    static int y;
    static String sign;
    public static void main(String[] args) {

        GetInput.getNumbers();
        switch (sign){
            case "+":
                Addition.add();
                break;
            case "*":
                Multiplication.multiply();
                break;
            case "-":
                Subtraction.subtract();
                break;
            case "/":
                Division.divide();
                break;
        }
}
