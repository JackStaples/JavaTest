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

import java.util.Arrays;
import static testproject.utils.Util.say;

/**
 *
 * @author Jack Staples
 */
public class ArrayTest {
    int[] intArray = {3,2,1};
    String stringArray[] = new String[5];
    byte byteArray [] = {1,0,0,1,1,1};
    Object [] objectArray = new Object[10];
    Integer integerArray[] = new Integer[3];
    Object[][] objectMultiArray = new Object[5][];
    
    public ArrayTest(){
        super();
    }
    
    public void arraysTest(){
        objectArray[0] = "Index one";
        objectArray[1] = 2;
        objectArray[2] = byteArray; // stores ref
        objectArray[3] = 5L;
        objectArray[4] = stringArray[0]; // stores null
        say("======== Object Array ========");
        for(Object obj : objectArray){
            say(obj);
        }
        for(int i = 0; i<intArray.length; i++){
            integerArray[i] = intArray[i];
        }
        say("======== Integer Array ========");
        for(int i = 0; i<intArray.length; i++){
            say(intArray[i] + " " + integerArray[i] + " " 
                    + integerArray[i].equals(intArray[i]) + " " // boxing
                    + (integerArray[i] == intArray[i])); // unboxing
        }
        say("======== Integer Array Sorted ========");
        Arrays.sort(integerArray);
        for (Integer i : integerArray){
            say(i);
        }
        objectMultiArray[0] = stringArray;
        objectMultiArray[1] = integerArray;
        objectMultiArray[2] = objectMultiArray;
        objectMultiArray[3] = objectMultiArray;
        objectMultiArray[4] = objectMultiArray;
        say("======== Object Array ========");
        for(Object[] i : objectMultiArray){
            for(Object j : i){
                say(j);
            }
            say();
        }
        say("========  Array Search ========");
        say();
    }
    
}
