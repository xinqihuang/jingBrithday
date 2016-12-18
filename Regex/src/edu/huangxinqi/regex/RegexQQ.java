package edu.huangxinqi.regex;

import com.sun.org.apache.regexp.internal.RE;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by huangxinqi on 2016/12/18/0018.
 */
public class RegexQQ {
    private static final String REGEX_QQ = "\\d{9,10}";

    public static void main(String[] args) {
        String testQQ="849489325";
        Pattern pattern=Pattern.compile(REGEX_QQ);
        Matcher matcher=pattern.matcher(testQQ);

        System.out.println(matcher.matches());

    }
}
