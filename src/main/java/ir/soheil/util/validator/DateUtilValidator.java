package ir.soheil.util.validator;

import ir.soheil.exception.BusinessException;
import ir.soheil.util.JalaliCalendar;
import ir.soheil.util.YearMonthDate;

public class DateUtilValidator {

    public static void yearMonthDateValidator(int year, int month, int day) throws BusinessException {

        if (String.valueOf(year).length() != 4)
            throw new BusinessException("year.is.invalid");

        boolean isLeapYear = JalaliCalendar.isLeepYear(year);

        if (month < 1 || month > 12)
            throw new BusinessException("month.is.invalid");

        int[] numberOfMonthDays = new int[]{31, 31, 31, 31, 31, 31, 30, 30, 30, 30, 30, 29};

        if (!isLeapYear && day > numberOfMonthDays[month - 1])
            throw new BusinessException("day.is.invalid");
        else if (isLeapYear && day > 30)
            throw new BusinessException("day.is.invalid");

    }

    public static void yearMonthDateValidator(YearMonthDate yearMonthDate) throws BusinessException {

        if (yearMonthDate == null)
            throw new BusinessException("data.is.not.valid");

        yearMonthDateValidator(yearMonthDate.getYear(), yearMonthDate.getMonth(), yearMonthDate.getDate());
    }
}
