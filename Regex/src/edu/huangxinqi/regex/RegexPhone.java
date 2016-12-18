package edu.huangxinqi.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by huangxinqi on 2016/12/18/0018.
 */
public class RegexPhone {
    private static final String REGEX_PHONE="(1[3,5,8])\\d{9}";
    public static void main(String[] args) {
        String testPhone="18682152362";
        Pattern pattern=Pattern.compile(REGEX_PHONE);
        Matcher matcher=pattern.matcher(testPhone);

        System.out.println(matcher.matches());

    }
}
