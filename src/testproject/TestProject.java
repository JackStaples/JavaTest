/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproject;

import testproject.APIs.DateTest;
import testproject.APIs.EqualityTest;
import testproject.APIs.StringTest;

/**
 *
 * @author Jack Staples
 */
public class TestProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //dateTest();
        //stringTest();
        equalityTest();
    }
    
    private static void equalityTest(){
        EqualityTest equalityTest = new EqualityTest();
        equalityTest.equalsTest();
    }
    
    private static void stringTest(){
        StringTest stringTest = new StringTest();
        //stringTest.stringify();
        stringTest.stringBuildify();
    }
    
    private static void dateTest(){
        DateTest dateTest = DateTest.getDateTestObject();
        System.out.println(dateTest);
    }
}
