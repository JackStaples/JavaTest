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
 */
public class MethodsTest {
    public void publicGo(){
        say("Here I go in public!");
    }
    void defaultGO(){
        say("Here I go in default!");
    }
    protected void protectedGo(){
        say("Here I go in protected!");
    }
    private void privateGo(){
        say("Here I go in private");
    }
    static public void staticGo(){
        say("Here I go statically!");
    }
    public void exceptionGo() throws Exception {
        throw new RuntimeException("RuntimeException is an Exception!");
    }
    
}

class babyMethodsTest extends MethodsTest{
    @Override
    public void publicGo(){
        say("The child can see the parents publicGo method"
                + "so an override is needed!");
    }
    @Override
    protected void protectedGo(){
        say("The child can see the parents protectedGo method"
                + "so an override is needed!");
    }
    void defaultGo(){
        say("The child cannot see the parent method of defaultGo, "
                + "so no override is needed!");
    }
    private void privateGo(){
        say("The child cannot see the parent method of privateGo, "
                + "so no override is needed!");
    }
    static public void staticGo(){
        say("staticGo doesnt need to be overridden because of method hiding");
    }
    @Override
    public void exceptionGo() throws RuntimeException {
        throw new NullPointerException("NullPointerException is a RuntimeException"
                + " is an Exception!");
    }
}
