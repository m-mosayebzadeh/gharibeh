package ir.soheil.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class JalaliCalendarTest {

    @Test
    public void jalaliToGregorianTest() {
        YearMonthDate date1 = JalaliCalendar.jalaliToGregorian(new YearMonthDate(1403, 1, 1));
        YearMonthDate date2 = JalaliCalendar.jalaliToGregorian(new YearMonthDate(1403, 1, 31));
        YearMonthDate date3 = JalaliCalendar.jalaliToGregorian(new YearMonthDate(1403, 2, 1));
        YearMonthDate date4 = JalaliCalendar.jalaliToGregorian(new YearMonthDate(1403, 2, 31));
        YearMonthDate date5 = JalaliCalendar.jalaliToGregorian(new YearMonthDate(1403, 3, 1));
        YearMonthDate date6 = JalaliCalendar.jalaliToGregorian(new YearMonthDate(1403, 3, 31));
        YearMonthDate date7 = JalaliCalendar.jalaliToGregorian(new YearMonthDate(1403, 4, 1));
        YearMonthDate date8 = JalaliCalendar.jalaliToGregorian(new YearMonthDate(1403, 4, 31));
        YearMonthDate date9 = JalaliCalendar.jalaliToGregorian(new YearMonthDate(1403, 5, 1));
        YearMonthDate date10 = JalaliCalendar.jalaliToGregorian(new YearMonthDate(1403, 5, 31));
        YearMonthDate date11 = JalaliCalendar.jalaliToGregorian(new YearMonthDate(1403, 6, 1));
        YearMonthDate date12 = JalaliCalendar.jalaliToGregorian(new YearMonthDate(1403, 6, 31));
        YearMonthDate date13 = JalaliCalendar.jalaliToGregorian(new YearMonthDate(1403, 7, 1));
        YearMonthDate date14 = JalaliCalendar.jalaliToGregorian(new YearMonthDate(1403, 7, 30));
        YearMonthDate date15 = JalaliCalendar.jalaliToGregorian(new YearMonthDate(1403, 8, 1));
        YearMonthDate date16 = JalaliCalendar.jalaliToGregorian(new YearMonthDate(1403, 8, 30));
        YearMonthDate date17 = JalaliCalendar.jalaliToGregorian(new YearMonthDate(1403, 9, 1));
        YearMonthDate date18 = JalaliCalendar.jalaliToGregorian(new YearMonthDate(1403, 9, 30));
        YearMonthDate date19 = JalaliCalendar.jalaliToGregorian(new YearMonthDate(1403, 10, 1));
        YearMonthDate date20 = JalaliCalendar.jalaliToGregorian(new YearMonthDate(1403, 10, 30));
        YearMonthDate date21 = JalaliCalendar.jalaliToGregorian(new YearMonthDate(1403, 11, 1));
        YearMonthDate date22 = JalaliCalendar.jalaliToGregorian(new YearMonthDate(1403, 11, 30));
        YearMonthDate date23 = JalaliCalendar.jalaliToGregorian(new YearMonthDate(1403, 12, 1));
        YearMonthDate date24 = JalaliCalendar.jalaliToGregorian(new YearMonthDate(1403, 12, 30));

        assertEquals("2024/3/20", date1.getYear() + "/" + date1.getMonth() + "/" + date1.getDate());
        assertEquals("2024/4/19", date2.getYear() + "/" + date2.getMonth() + "/" + date2.getDate());
        assertEquals("2024/4/20", date3.getYear() + "/" + date3.getMonth() + "/" + date3.getDate());
        assertEquals("2024/5/20", date4.getYear() + "/" + date4.getMonth() + "/" + date4.getDate());
        assertEquals("2024/5/21", date5.getYear() + "/" + date5.getMonth() + "/" + date5.getDate());
        assertEquals("2024/6/20", date6.getYear() + "/" + date6.getMonth() + "/" + date6.getDate());
        assertEquals("2024/6/21", date7.getYear() + "/" + date7.getMonth() + "/" + date7.getDate());
        assertEquals("2024/7/21", date8.getYear() + "/" + date8.getMonth() + "/" + date8.getDate());
        assertEquals("2024/7/22", date9.getYear() + "/" + date9.getMonth() + "/" + date9.getDate());
        assertEquals("2024/8/21", date10.getYear() + "/" + date10.getMonth() + "/" + date10.getDate());
        assertEquals("2024/8/22", date11.getYear() + "/" + date11.getMonth() + "/" + date11.getDate());
        assertEquals("2024/9/21", date12.getYear() + "/" + date12.getMonth() + "/" + date12.getDate());
        assertEquals("2024/9/22", date13.getYear() + "/" + date13.getMonth() + "/" + date13.getDate());
        assertEquals("2024/10/21", date14.getYear() + "/" + date14.getMonth() + "/" + date14.getDate());
        assertEquals("2024/10/22", date15.getYear() + "/" + date15.getMonth() + "/" + date15.getDate());
        assertEquals("2024/11/20", date16.getYear() + "/" + date16.getMonth() + "/" + date16.getDate());
        assertEquals("2024/11/21", date17.getYear() + "/" + date17.getMonth() + "/" + date17.getDate());
        assertEquals("2024/12/20", date18.getYear() + "/" + date18.getMonth() + "/" + date18.getDate());
        assertEquals("2024/12/21", date19.getYear() + "/" + date19.getMonth() + "/" + date19.getDate());
        assertEquals("2025/1/19", date20.getYear() + "/" + date20.getMonth() + "/" + date20.getDate());
        assertEquals("2025/1/20", date21.getYear() + "/" + date21.getMonth() + "/" + date21.getDate());
        assertEquals("2025/2/18", date22.getYear() + "/" + date22.getMonth() + "/" + date22.getDate());
        assertEquals("2025/2/19", date23.getYear() + "/" + date23.getMonth() + "/" + date23.getDate());
        assertEquals("2025/3/20", date24.getYear() + "/" + date24.getMonth() + "/" + date24.getDate());
    }
}
