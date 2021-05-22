package com.string_priatice.demo2;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式
 *
 * @Author: dongjie
 * @Date: 2021/5/22 9:51
 */
public class Main1 {

    @Test
    public void test1() {
        Pattern compile1 = Pattern.compile("(\\D*)(\\d+)(.*)");
        Matcher matcher1 = compile1.matcher("This order was placed for QT3000! OK?");
        System.out.println("有几个分组：" + matcher1.groupCount());//3--正则表达式总共有3个组
        System.out.println(matcher1.find());//true--正则表达式每部分与输入字符串匹配
        System.out.println("--------------------------------");

        Pattern compile2 = Pattern.compile("(\\D*)(\\d+)(.*)");
        Matcher matcher2 = compile2.matcher("This order was placed for QT! OK?");
        System.out.println("有几个分组：" + matcher2.groupCount());//3--正则表达式总共有3个组
        System.out.println(matcher2.find());//false--正则表达式某部分与输入字符串不匹配

        System.out.println("------------------------------");
        Pattern compile3 = Pattern.compile("((A)(B(C)))");
        Matcher matcher3 = compile3.matcher("abc");
        System.out.println("有几个分组：" + matcher3.groupCount());//4---正则表达式总共有4个组
        System.out.println(matcher3.find());//false---正则表达式某部分与输入字符串不匹配

        System.out.println("-----------------");
        Matcher matcher4 = Pattern.compile("(a)(b)(c)(d)(e)").matcher("abcde");
        System.out.println("有几个分组：" + matcher4.groupCount());//5--正则表达式总共有5个组
        System.out.println(matcher4.find());//true---正则表达式每部分与输入字符串匹配
    }

    @Test
    public void test2() {
        Pattern compile = Pattern.compile("(\\D*)(\\d+)(.*)");
        Matcher matcher = compile.matcher("This order was placed for QT3000! OK?");
        if (matcher.find()) { //正则表达式每部分与输入字符串匹配
            System.out.println(matcher.group(0));  //This order was placed for QT3000! OK?--匹配整个表达式
            System.out.println(matcher.group(1));//This order was placed for QT--匹配第一组
            System.out.println(matcher.group(2));//3000--匹配第二组
            System.out.println(matcher.group(3));//! OK?--匹配第三组
        }
    }


    @Test
    public void test3() {
        Pattern compile = Pattern.compile("(\\D*)(\\d+)(.*)");
        Matcher matcher = compile.matcher("This order was placed for QT! OK?");
        System.out.println(matcher.matches());//false--正则表达式与输入字符串不匹配
        System.out.println("-------------------");

        Pattern compile1 = Pattern.compile("\\d*");
        Matcher matcher1 = compile1.matcher("18163019223");
        System.out.println(matcher1.matches());//true--正则表达式与输入字符串匹配
        System.out.println("-------------------");
    }

    @Test
    public void test4() {
        Pattern compile = Pattern.compile("\\D*");
        Matcher matcher = compile.matcher("This order was placed for QT! OK?");
        System.out.println(matcher.groupCount());//0--正则表达式有0组
        System.out.println("----------------------------");

        Pattern compile1 = Pattern.compile("(\\D*)");
        Matcher matcher1 = compile1.matcher("This order was placed for QT! OK?");
        System.out.println(matcher1.groupCount());//1--正则表达式有1组
    }

    /**
     * .匹配任意字符
     * \\.匹配.
     * ^以...开始   $以...结尾
     * *0次或者多次
     * +1次或者多次
     * ？0次或者1次
     * {n}n次
     * {n,}至少n次
     * {n,m}n~m次
     * （？：A|B|C|D）  匹配A|B|C|D
     * [XYZ] XYZ任一字符
     * [a-z] a~z任一字符
     * [^xyz]不包含xyz
     * [^a-z]不包含a~z字符
     * \d等于【0-9】
     * \D等于【^0-9】
     * x|y  匹配x或者y
     * \\匹配\
     */
    @Test
    public void test5() {
        /**
         * 移动号码段:139、138、137、136、135、134、150、151、152、157、158、159、182、183、187、188、147
         * 联通号码段:130、131、132、136、185、186、145
         * 电信号码段:133、153、180、189
         *
         */
        Pattern compile = Pattern.compile("^1(?:3\\d|4[4-9]|5[0-35-9]|6[67]|7[013-8]|8\\d|9\\d)\\d{8}$");
        Matcher matcher = compile.matcher("18163019016");
        System.out.println(matcher.matches());//true--正则表达式与输入字符串匹配
        System.out.println("-----------------");

        /**
         * 邮箱正则表达式：abcd123@sina.com.cn
         * 第一步：@之前是：字母、数字、
         * 第二步：@之后.之前是：字母、数字
         * 第三步：.之后是字母
         */
        Pattern compile1 = Pattern.compile("^[a-zA-Z0-9_]+@[a-z0-9]+(\\.[a-z]+)+$");
        Matcher matcher1 = compile1.matcher("123456@qq.com.cn");//true
        System.out.println(matcher1.matches());
        System.out.println("--------------------");

        /**用户名匹配
         * mkyong34    kyong_2002   mkyong-2002   mk3-4_yong
         */
        Pattern compile2 = Pattern.compile("^[a-z0-9_-]{3,15}$");
        Matcher matcher2 = compile2.matcher("mkyong34");
        System.out.println(matcher2.matches());//true
    }
}
