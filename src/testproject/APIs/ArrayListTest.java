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


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static testproject.utils.Util.say;
/**
 *
 * @author Jack Staples
 */
public class ArrayListTest {
    private List integerArray;
    
    public ArrayListTest(Integer... intArray){
        this.integerArray = new ArrayList(Arrays.asList(intArray));
    }
    
    public void arrayListsTest(){
        List list = getList();
        
        say("===== Printing an ArrayList! =====");
        say(list);
        say();
        
        say("===== 42 added to List! =====");
        list.add(42);
        say(list);
        say();
        
        say("===== 16 removed from List! =====");
        list.remove(3);
        say(list);
        say();
        
        say("===== 16 added back to List! =====");
        list.add(3, 16);
        say(list);
        say();
        
        say("===== The size of the List is! =====");
        say(list.size());
        say();
        
        say("===== Is the list empty? =====");
        say(list.isEmpty());
        say();

        say("===== Does it contain a 16 =====");
        say(list.contains(16));
        say();
        
        say("===== Is the list the same as the original? =====");
        say(list.equals(this.integerArray));
        say("See!");
        say(this.integerArray);
        
        say("===== Lets shuffle it! =====");
        Collections.shuffle(list);
        say(list);
        say();

        say("===== Finally, lets resort it! =====");
        Collections.sort(list);
        say(list);
        say();
    }
    
    private List getList(){
        return this.integerArray;
    }
}
