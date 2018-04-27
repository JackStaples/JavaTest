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
package testproject.operators;

import static testproject.utils.Util.say;

/**
 *
 * @author Jack Staples
 */
public class OperatorTest {
    
    public void smoothOperator(){
        say(1 == 1);
        say(1 == 2);
        say(1 | 0); //or
        say(1 & 0); //and
        int i = 0;
        say(++i); //prefix
        i=0;
        say(i++); //postfix
        sayBool(true);
        sayBool(false);
        Integer integerI = new Integer(i);
        Integer integerI2 = new Integer(i);
        sayBool(integerI instanceof Integer);
        sayBool(integerI == integerI2); //compares ref
        sayBool(integerI.equals(integerI2)); //compares val
        i=0;
        say(i += 5);
        {int l = i; say( l -= 5);}
        say(i); //l doesnt exist here
        say(i >> 2);
        say(i);
        say(i << 2);
        say(i);
        say(i >>>= 2); //actually changes i
        say(i);
    }
    
    public static void sayBool(boolean i){
        say((i)? "its true!" : "Its false!");
    }
    
}
