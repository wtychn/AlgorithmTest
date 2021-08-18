package com.algorithm.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/***
 * @Description: 判断 b 字符串代表的节点是否是 a 的子节点
 * @level easy
 * @author wtychn
 * @Date 2021/8/18
 */
public class DataDance_818_interview {
    public boolean isChild_Api(String parent, String child) {
        return child.startsWith(parent + "/");
    }

    public boolean isChild_Pattern(String parent, String child) {
        String string = "^" + parent.replace("/", "[/]") + "[/][a-z/]+";
        Pattern pattern = Pattern.compile(string);
        Matcher matcher = pattern.matcher(child);
        return matcher.matches();
    }
}
