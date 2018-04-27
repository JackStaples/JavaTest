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
 * No setters with private methods
 * 
 * @author Jack Staples
 */
public class ImmutableTest {
    
    private String wave;
    private String hello;
    private String goodbye;
    
    public ImmutableTest(String hello, String wave, String goodbye){
        this.hello = hello;
        this.wave = wave;
        this.goodbye = goodbye;
        this.sayHello();
    }
    
    public void sayWave(){
        say(getWave());
    }
    
    @Override
    public void finalize(){
        this.sayGoodbye();
    }
    
    private void sayHello(){
        say(getHello());
    }
    
    private void sayGoodbye(){
        say(getGoodbye());
    }
    
    private String getHello(){
        return this.hello;
    }
    
    private String getWave(){
        return this.wave;
    }
    
    private String getGoodbye(){
        return this.goodbye;
    }
}
