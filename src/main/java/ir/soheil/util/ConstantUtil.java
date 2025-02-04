package ir.soheil.util;

public class ConstantUtil {

    // تبدیل برج عربی به نام
    public static String zodiacSignToName(int sign) {
        String[] signs = {"حمل", "ثور", "جوزا", "سرطان", "اسد", "سنبله", "میزان", "عقرب", "قوس", "جدی", "دلو", "حوت"};
        return signs[sign];
    }
}
