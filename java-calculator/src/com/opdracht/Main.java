package com.opdracht;

public class Main {

    public static void main(String[] args) {
        int numb1 = 10;
        int numb2 = 5;
        String operator = "-" ;
        String result = calculateAmount(numb1, numb2, operator);

        System.out.println(result);
    }

    private static String calculateMultiplication(int numb1, int numb2) {
        return "Het antwoord is " + (numb1 * numb2);
    }

    private static String calculatePlus(int numb1, int numb2){
        return "Het antwoord is " + (numb1 + numb2);
    }

    private static String calculateDivide(int numb1, int numb2){
        return "Het antwoord is " + (numb1 - numb2);
    }

    public static String calculateAmount(int numb1, int numb2, String operator) {
        if (operator.equals("*")) {
            return calculateMultiplication(numb1, numb2);
        }
         else if(operator.equals("+")) {
            return calculatePlus(numb1, numb2);
        }
        else if (operator.equals("-")) {
            return calculateDivide(numb1, numb2);
        }
        return "ik ondersteun de operater: " + operator + " niet";
    }
}
