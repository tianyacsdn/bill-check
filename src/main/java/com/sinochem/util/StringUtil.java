package com.sinochem.util;

import org.springframework.util.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: zhanghl
 * @date: 2018/8/4 12:01
 */
public class StringUtil {
    private static Pattern pattern =  Pattern.compile("\\s*|\t|\r|\n");
    public static String replaceBlank(String str) {
        if(!StringUtils.isEmpty(str)) {
            Matcher m = pattern.matcher(str);
            return m.replaceAll("");
        }
        return str;
    }
}
