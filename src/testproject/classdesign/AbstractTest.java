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
package testproject.classdesign;

import static testproject.utils.Util.say;

/**
 *
 * @author Jack Staples
 */
public class AbstractTest {

    private final AbstractExample first;
    private final AbstractExample second;

    public AbstractTest() {
        this.first = new FirstAbstractExtendorExample("First extendor wave!");
        this.second = new SecondAbstractExtendorExample("Second extendor wave!");
    }

    public void abstractTest() {
        say(first, second);
    }

    abstract class AbstractExample {

        private final String wave;
       
        public AbstractExample(String wave) {
            this.wave = wave;
        }

        abstract protected String sayHello();

        abstract protected String sayWave();

        abstract protected String sayGoodbye();

        String getWave() {
            return this.wave;
        }

        @Override
        public String toString() {
            String retVal = sayHello() + '\n' + sayWave() + '\n' + sayGoodbye();

            return retVal;
        }

    }

    class FirstAbstractExtendorExample extends AbstractExample {

        public FirstAbstractExtendorExample(String wave) {
            super(wave);
        }

        @Override
        public String sayGoodbye() {
            return "Goodbye, this is the first extendor class goodbye string";
        }

        @Override
        protected String sayHello() {
            return "Hello, this is the first extendor class hello string";
        }

        @Override
        protected String sayWave() {
            return "Here is the first extendor classes wave: " + getWave();
        }

    }

    class SecondAbstractExtendorExample extends AbstractExample {

        public SecondAbstractExtendorExample(String wave) {
            super(wave);
        }

        @Override
        protected String sayHello() {
            return "Hello, this is the second extendor class hello string";
        }

        @Override
        protected String sayWave() {
            return "The second extendor class doesn't want to wave";
        }

        @Override
        protected String sayGoodbye() {
            return "Goodbye, this is the second extendor class goodbye string";
        }

    }
}
