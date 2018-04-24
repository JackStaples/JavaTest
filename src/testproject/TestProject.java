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
