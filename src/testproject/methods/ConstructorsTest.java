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
package testproject.methods;

import static testproject.utils.Util.say;

/**
 *
 * @author Jack Staples
 * 
 * should be a builder 
 */
public class ConstructorsTest {
    public ConstructorsTest(){
        super(); // this doesnt need to be here, it will be added automatically
        say("This is the default constructor!");
    }
    public ConstructorsTest(int i){
        say("This is the int constructor!");
        // super() cannot be here, must be first
    }
    public ConstructorsTest(String i){
        say("This is the String constructor!");
    }
    public ConstructorsTest(int i, String j){
        say("This is the int and String constructor!");
    }
    public ConstructorsTest(String j, int i){
        say("This is the String and int constructor!");
    }
    public ConstructorsTest(Object i){
        // not called
        say("This is the object constructor");
    }
    public ConstructorsTest(int i, String j, String f){
        ConstructorsTest constructorTest = new ConstructorsTest(i, j);
        constructorTest = new ConstructorsTest(j, i);
        constructorTest = new ConstructorsTest(j);
        constructorTest = new ConstructorsTest(i);
        constructorTest = new ConstructorsTest();
    }
}
