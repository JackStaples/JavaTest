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
package testproject.utils;

import java.util.List;

/**
 *
 * @author Jack Staples
 */
public class Util {
    
    public static void say(){
        System.out.println("");
    }
    
    public static void say(Object o){
        System.out.println(o);
    }
    
    public static void say(Object... o){
        for (Object obj : o){
            say(obj);
        }
    }
    
    public static void say(List o){
        for(Object i : o){
            System.out.println(i);
        }
    }
}
