/*
 * Examples of LocalDate, LocalTime, and LocalDateTime
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
