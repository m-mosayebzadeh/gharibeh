package ir.soheil.service.impl;

import ir.soheil.exception.BusinessException;
import ir.soheil.service.BaseInfoService;
import ir.soheil.service.validator.BaseInfoValidator;
import ir.soheil.util.ConstantUtil;
import ir.soheil.util.JalaliCalendar;
import ir.soheil.util.YearMonthDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import swisseph.SweConst;
import swisseph.SweDate;
import swisseph.SwissEph;

@Service
public class BaseInfoServiceImpl implements BaseInfoService {

    @Autowired
    BaseInfoValidator baseInfoValidator;

    @Override
    public Boolean isMoonInScorpio(YearMonthDate yearMonthDate) throws BusinessException {

        baseInfoValidator.isMoonInScorpioValidator(yearMonthDate);

        YearMonthDate gregorianYearMonthDate = JalaliCalendar.jalaliToGregorian(yearMonthDate);

        SweDate sweDate = new SweDate(gregorianYearMonthDate.getYear(), gregorianYearMonthDate.getMonth(), gregorianYearMonthDate.getDate(), yearMonthDate.getHour());
        SwissEph swissEph = new SwissEph();

        double[] moonPosition = new double[6];
        StringBuffer serr = new StringBuffer();

        // محاسبه موقعیت ماه
        int result = swissEph.swe_calc_ut(sweDate.getJulDay(), SweConst.SE_MOON, 0, moonPosition, serr);


        if (result == SweConst.ERR) {
            System.out.println("خطا در محاسبه: " + serr.toString());
        } else {
            double longitude = moonPosition[0]; // طول جغرافیایی ماه

            // تبدیل طول جغرافیایی به برج فلکی
            int zodiacSign = (int) (longitude / 30); // هر برج 30 درجه است

            // بررسی برج عقرب
            if (zodiacSign == 7) { // برج عقرب (شماره 8 اما از 0 شروع می‌شود)
                System.out.println("ماه در برج عقرب است!");
            } else {
                System.out.println("ماه در برج " + ConstantUtil.zodiacSignToName(zodiacSign) + " است.");
            }
        }

        return false;
    }
}
