package edu.huangxinqi.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by huangxinqi on 2016/12/17/0017.
 */
public class RegexDemo {

    public static void main(String[] args) {
        System.out.println("please input your regex");
        Scanner scanner=new Scanner(System.in);
        String regex =scanner.nextLine();
        System.out.println("please input your example");
        String example =scanner.nextLine();
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(example);
        System.out.println(matcher.matches());

    }
}
