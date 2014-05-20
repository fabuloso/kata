/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.ale.stringcalculator;

import jdk.nashorn.internal.objects.NativeArray;

/**
 *
 * @author Fabuloso
 */
public class StringCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    //"^//+(.)\\\\n(.+)","$1"

    public int add(String numbersToAdd) {
        String delimiters = ",|\n";
        delimiters += (numbersToAdd.matches("^//(.+)\\\\n(.+)")) ? numbersToAdd.replaceAll("^//(.+)\\\\n(.+)", "|$1") : "";
        numbersToAdd = numbersToAdd.replaceAll("^//(.+)\\\\n(.+)","$2");
        String[] numbersFromString = numbersToAdd.split(delimiters);
        return (numbersFromString[0].equals("")) ? 0 : sumMoreStringAsNumbers(numbersFromString);
    }

    private int sumMoreStringAsNumbers(String[] numbersFromString) throws NumberFormatException {
        int sum = 0;
        for (String number : numbersFromString) {
            sum += Integer.parseInt(number);
        }
        return sum;
    }

}
