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
    
    public void stringBuildify(){
        StringBuilder test = new StringBuilder("I am a new StringBuilder.");
        int len = test.length();
        System.out.println(test);
        test.append(" This will be appended.");
        System.out.println(test);
        test.insert(len, " This will be inserted.");
        System.out.println(test);
        test.delete(len, test.length());
        System.out.println(test);
        test.reverse();
        System.out.println(test);
    }
}
