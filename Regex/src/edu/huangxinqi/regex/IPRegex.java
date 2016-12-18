package edu.huangxinqi.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by huangxinqi on 2016/12/18/0018.
 */
public class IPRegex {
    private static final String REGEX_IP="[0,255]\\.[0,255]\\.[0,255]\\.[0,255]";
    public static void main(String[] args) {
        String testIP="127.0.0.1";
        Pattern pattern=Pattern.compile(REGEX_IP);
        Matcher matcher=pattern.matcher(testIP);

        System.out.println(matcher.matches());
    }
}
