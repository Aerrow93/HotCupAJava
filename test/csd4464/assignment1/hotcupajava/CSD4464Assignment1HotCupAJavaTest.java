/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd4464.assignment1.hotcupajava;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0538434
 */
public class CSD4464Assignment1HotCupAJavaTest {
    
    public CSD4464Assignment1HotCupAJavaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class CSD4464Assignment1HotCupAJava.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CSD4464Assignment1HotCupAJava.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    /**
     * Test of stringPower method, of class CSD4464Assignment1HotCupAJava.
     */
    @Test
    public void testEmptyStringShouldReturnEmptyString() {
        System.out.println("stringPower");
        String s = "";
        int num = 5;
        String expResult = "";
        String result = CSD4464Assignment1HotCupAJava.stringPower(s, num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("stringPower error: Expected empty string, result: " + result);
    }
    
    /**
     * Test if stringPower method less than one returns null, of class CSD4464Assignment1HotCupAJava
     */
    public void testLessThanOneShouldReturnNull() {
        System.out.println("stringPower");
        String s = "";
        int num = -1;
        String expResult = null;
        String result = CSD4464Assignment1HotCupAJava.stringPower(s, num);
        assertEquals(expResult, result);
    }
    
    /**
     * Test if stringPower method with sample string and integer 1 returns sample string, of class CSD4464 Assignment1HotCupAJava
     */
    public void testStringAndOneShouldReturnString() {
        System.out.println("stringPower");
        String s = "This is a string.";
        int num = 1;
        String expResult = s;
        String result = CSD4464Assignment1HotCupAJava.stringPower(s, num);
        assertEquals(expResult, result);
    }
    
    /**
     * Test if stringPower method with sample string and integer 2 returns sample string, of class CSD4464 Assignment1HotCupAJava
     */
    public void testStringAndTwoShouldReturnStringDoubled() {
        System.out.println("stringPower");
        String s = "bob";
        int num = 2;
        String expResult = s+s;
        String result = CSD4464Assignment1HotCupAJava.stringPower(s, num);
        assertEquals(expResult, result);
    }
}
