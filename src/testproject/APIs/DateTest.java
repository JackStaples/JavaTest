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

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 *
 * @author Jack Staples
 */
public final class DateTest {

    LocalDate localDate;
    LocalTime localTime;
    LocalDateTime localDateTime;
    LocalDate birthDay;
    LocalTime birthTime;
    LocalDateTime birthDayTime;

    private DateTest() {
        this.localDate = LocalDate.now();
        this.localTime = LocalTime.now();
        this.localDateTime = LocalDateTime.now();
        this.birthDay = LocalDate.of(1993, Month.APRIL, 7);
        this.birthTime = LocalTime.of(23, 15);
        this.birthDayTime = LocalDateTime.of(this.birthDay, this.birthTime);
    }

    static public DateTest getDateTestObject() {
        DateTest retVal = new DateTest();

        return retVal;
    }

    @Override
    public String toString() {
        String retVal = "LocalDate: " + this.localDate.toString() 
                + "\nLocalTime: " + this.localTime.toString() 
                + "\nLocalDateTime: " + this.localDateTime.toString()
                + "\nBirthDay: " + this.birthDay.toString()
                + "\nBirthTime: " + this.birthTime.toString()
                + "\nBirthDayTime: " + this.birthDayTime.toString();

        return retVal;
    }
}
