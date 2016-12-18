package edu.huangxinqi.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by huangxinqi on 2016/12/18/0018.
 */
public class YourName {
    private final static String REGEX_NAME ="董[\\u4E00-\\u9FA5]{1,2}";

    public static void main(String[] args) {
        String yourName="董子敬";
        String yourSonName="董三";
        Pattern pattern=Pattern.compile(REGEX_NAME);
        Matcher matcher=pattern.matcher(yourSonName);
        System.out.println(matcher.matches());
    }
}
