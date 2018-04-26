/* 
 * Copyright (C) 2018 Jack Staples
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package testproject.APIs;

import static testproject.utils.Util.say;

/**
 *
 * @author Jack Staples
 */
public class EqualityTest extends EqualityTestParent{
    
    public void equalsTest(){
        EqualityTest equals = new EqualityTest();
        EqualityTestParent equalsParent = new EqualityTestParent();
        
        boolean testChild = equals instanceof EqualityTestParent;
        say("Is a child part of the parent class? " + testChild);
        
        boolean testParent = equalsParent instanceof EqualityTest;
        say("Is a child part of the parent class? " + testParent);
        
        boolean wrong = (equals == equalsParent);
        say("Do they == each other? " + wrong);
        
        boolean right = equals.equals(equalsParent);
        say("Do they .equals() each other since we overrode? " + right);
        
        boolean itself = equals == equals;
        say("Does it equal itself? " + itself);
        
    }
    
}

class EqualityTestParent {

    @Override
    public boolean equals(Object o){
        return o instanceof EqualityTestParent;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }
    
}