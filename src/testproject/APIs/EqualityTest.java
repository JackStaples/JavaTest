/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproject.APIs;

/**
 *
 * @author Jack Staples
 */
public class EqualityTest extends EqualityTestParent{
    
    public void equalsTest(){
        EqualityTest equals = new EqualityTest();
        EqualityTestParent equalsParent = new EqualityTestParent();
        
        boolean testChild = equals instanceof EqualityTestParent;
        System.out.println("Is a child part of the parent class? " + testChild);
        
        boolean testParent = equalsParent instanceof EqualityTest;
        System.out.println("Is a child part of the parent class? " + testParent);
        
        boolean wrong = (equals == equalsParent);
        System.out.println("Do they == each other? " + wrong);
        
        boolean right = equals.equals(equalsParent);
        System.out.println("Do they .equals() each other since we overrode? " + right);
        
        boolean itself = equals == equals;
        System.out.println("Does it equal itself? " + itself);
        
    }
    
}

class EqualityTestParent {

    @Override
    public boolean equals(Object o){
        return o instanceof EqualityTestParent;
    }
    
}