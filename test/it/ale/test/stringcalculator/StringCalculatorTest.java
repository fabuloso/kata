/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.ale.test.stringcalculator;

import it.ale.stringcalculator.StringCalculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fabuloso
 */
public class StringCalculatorTest {

    public StringCalculatorTest() {
    }

    @Test
    public void addAnEmptyString() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    public void addANumericString() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }

    @Test
    public void addTwoNumbersAsString() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1 + 2, stringCalculator.add("1,2"));
    }

    @Test
    public void addMoreNumbersAsString() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1 + 2 + 3 + 4 + 5, stringCalculator.add("1,2,3,4,5"));
    }

    @Test
    public void addMoreNumbersAsStringWithNewLineAsDelimiterToo() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1 + 2 + 3, stringCalculator.add("1\n2,3"));
    }

    @Test
    public void addMoreNumbersAsStringUsingCustomDelimiters() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1 + 2, stringCalculator.add("//;\\n1;2"));
    }

}
