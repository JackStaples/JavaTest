/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproject.APIs;

/**
 *
 * @author Jack
 */
public class StringTest {
    
    public StringTest(){}
    
    public void stringify(){
        String test = "This is a string. It is immutable";
        System.out.println("Hello, this is what test says: "+ test 
        + "\nImportant things to now about test.\nIt is " + test.length() + " characters long."
        + "\nIts ninth character is an " + test.charAt(8) 
        +".\nThe first time a s shows up is at index " + test.indexOf('s')
        +".\nFrom index 4 to 17 it looks like: " + test.substring(4,17)
        +".\nIn all caps it looks like: " + test.toUpperCase()
        +".\nDoes it start with the word banana? " + test.startsWith("banana")
        +".\nDoes it contain the word string? " + test.contains("string"));
        String concatTest = test + " This won't show in test, but will in concatTest                 ";
        System.out.println("test: "  + test + "\nconcatTest: " + concatTest + "Wow thats alot of whitespace!");
        System.out.println("Lets remove it: " + concatTest.trim() +"See, its gone!");
    }
    
}
