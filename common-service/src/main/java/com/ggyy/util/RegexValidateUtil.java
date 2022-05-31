package com.ggyy.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * 使用正则表达式进行表单验证
 */
public class RegexValidateUtil {
    static boolean flag = false;
    static String regex = "";

    public static boolean check(String str, String regex) {
        try {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(str);
            flag = matcher.matches();
        } catch (Exception e) {
            flag = false;
        }
        return flag;
    }

    /**
     * 验证手机号码
     *
     * @param mobile
     * @return
     */
    public static boolean checkMobile(String mobile) {
        String regex = "^((19[0-9])|(17[0-9])|(13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(18[0,5-9]))\\d{8}$";
        return check(mobile, regex);
    }
}
