package com.string_priatice.demo1;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

/**
 * @Author: dongjie
 * @Date: 2021/5/21 14:23
 */
public class Main1 {
    @Test
    public void test1() { //1.根据索引得到字符
        String str = "www.runoob.com";
        System.out.println(str.charAt(5));//u--得到索引5对应的字符
        System.out.println(str.charAt(6));//n--得到索引6对应的字符
    }

    @Test
    public void test2() { //2.string-->>char[]
        String str = "www.runoob.com";
        char[] chars = str.toCharArray();
        System.out.println(chars);//www.runoob.com--将字符串转成字符数组
    }

    @Test
    public void test3() {
        String str = "www.runoob.com";
        System.out.println(str.indexOf("w")); //0--找到第一个w所在的索引
        System.out.println(str.indexOf("w", 1));//1--找到索引1以后第一个w所在的索引
        System.out.println(str.lastIndexOf("w"));//2--找到最后一个w所在的索引
        System.out.println(str.lastIndexOf("w", 5));//2--找到索引5以前最后一个w所在的索引
        System.out.println("--------------------------------------------");
        System.out.println(str.indexOf("runoob"));//4---找到第一个runoob所在的索引
        System.out.println(str.indexOf("runoob", 3));//64--找到索引3以后第一个runoob所在的索引
        System.out.println(str.lastIndexOf("o"));//12---找到最后一个o所在的索引
        System.out.println(str.lastIndexOf("o", 8));//8---找到索引8以前最后一个o所在的索引
    }

    @Test
    public void test4() {//4.截取字符串
        String s = "hello world";
        System.out.println(s.substring(0));//hello world---截取0~剩下的所有字符串
        System.out.println(s.substring(3));//lo world---截取3~剩下所有的字符串
        System.out.println(s.substring(0, 11));//hello world---截取0~10区间的字符串
        System.out.println(s.substring(4, 8));//o wo---截取4~7区间的字符串
    }

    /**
     * 空格匹配空格
     * /匹配/
     * \\.匹配.
     * \\*匹配*
     * \\^匹配^
     * \\:匹配：
     *
     * @匹配@ , 匹配,
     */
    @Test
    public void test5() {//4.拆分
        String s1 = "he ll o wo r l d";
        String[] arr = s1.split(" ");//以空格为分隔符
        for (String t : arr) {
            System.out.print(t);
        }
        System.out.println();
        System.out.println("------------------------------");
        String s2 = "he/ll/o/wo/r/l/d";
        String[] split = s2.split("/");//以/为分隔符
        for (String t1 : split) {
            System.out.print(t1);
        }
        System.out.println();
        System.out.println("------------------------------");
        String s3 = "he.ll.o.wo.r.ld";
        String[] split1 = s3.split("\\.");//以.为分隔符
        for (String t2 : split1) {
            System.out.print(t2);
        }

        System.out.println();
        System.out.println("------------------------------");
        String s4 = "he|ll|o|wo|r|ld";
        String[] split2 = s3.split("\\|");//以|为分隔符
        System.out.print("这是以|为分隔符：");
        for (String t2 : split1) {
            System.out.print(t2);
        }

        System.out.println();
        System.out.println("------------------------------");
        String s5 = "he*ll*o*wo*r*ld";
        String[] split3 = s5.split("\\*");//以*为分隔符
        System.out.print("这是以*为分隔符：");
        for (String t3 : split3) {
            System.out.print(t3);
        }

        System.out.println();
        System.out.println("------------------------------");
        String s6 = "上海^上海市@闵行区#吴中路";
        String[] split4 = s6.split("\\^|@|#");
        System.out.print("这是多个分隔符：");
        for (String t4 : split4) {
            System.out.print(t4);
        }
    }


    @Test
    public void test6() {
        String s1 = "hello";
        String s2 = "world";
        String s3 = "HELLO";
        System.out.println(s1.concat(s2));//helloworld--合并字符串
        System.out.println(s1.concat(s3));//helloHELLO---合并字符串
        System.out.println(s3.toLowerCase());//hello---将字符串转成小写
        System.out.println(s1.toUpperCase());//HELLO---将字符串转成大写
    }

    @Test
    public void test7() {//7.替换字符串
        String s1 = "www.google.com";
        String s2 = new String("hello runoob，I am from runoob。");
        System.out.println(s1.replace('o', '3')); //www.g33gle.c3m---用字符3替换字符3
        System.out.println(s1.replace("oo", "33"));//www.g3gle.com---用字符串33替换字符串oo
        System.out.println(s1.replace("www", "3"));//3.google,com---用字符串3替换www
        System.out.println("------------------------");
        System.out.println(s1.replaceAll("\\.", "3"));//www3google3com---用3替换.
        System.out.println(s1.replaceAll("\\.|www", "3"));//33google3com---用3替换.或者www
        System.out.println("------------------------------");
        ////hello google，I am from runoob。---替换第一个匹配项
        System.out.println(s2.replaceFirst("runoob", "google"));
        System.out.println(s2.replaceFirst(".*runoob.*", "google"));//google---匹配整个字符串

    }

    @Test
    public void test8() {//8.比较大小
        System.out.println("h".compareTo("w"));//-15---比较h和w的ascii码差值
        //-15---比较HELLO和WORLD的ascii码差值，忽略大小写，比较首字符相等比较第二个字符还想等比较第三个字符，不等直接返回ascii差值
        System.out.println("HELLO".compareToIgnoreCase("WORLD"));
    }

    @Test
    public void test9() {
        //hello runoob---返回该字符数组表示的字符串
        System.out.println(String.copyValueOf(new char[]{'h', 'e', 'l', 'l', 'o', ' ', 'r', 'u', 'n', 'o', 'o', 'b'}));
        //lo ru---初始偏移量3，长度为5,返回该字符数组表示的字符串
        System.out.println(String.copyValueOf(new char[]{'h', 'e', 'l', 'l', 'o', ' ', 'r', 'u', 'n', 'o', 'o', 'b'},
                3, 5));
    }

    @Test
    public void test10() {
        System.out.println("hello".equals("hello"));//true---比较字符串是否相等
        System.out.println("hello".equalsIgnoreCase("HELLO"));//TRUE---忽略大小写比较字符串是否相等
    }

    @Test
    public void test11() throws UnsupportedEncodingException {
        //[B@4ec6a292--使用utf-8将字符串编码为byte[]
        System.out.println("hello".getBytes("utf-8"));
        //[B@1b40d5f0---使用iso-8859-1将字符串编码为byte[]
        System.out.println("hello".getBytes("iso-8859-1"));
        //[B@ea4a92b--使用java默认的编码将字符串编码为byte[]
        System.out.println("hello".getBytes());
    }

    @Test
    public void test12() {
        String str = "www.runoob.com";
        char[] ch = new char[8];
        //【，，r,u,n,o,o,b】---runoob---从索引4开始到索引9复制字符到字符数组中，且偏移量是2
        str.getChars(4, 10, ch, 2);
        System.out.println(ch);
        System.out.println("-------------");
        char[] ch2 = new char[8];
        //【,w,.,r,u】---w.ru从索引2开始到索引5复制字符到字符数组中，偏移量是1
        str.getChars(2, 6, ch2, 1);
        System.out.println(ch2);
        System.out.println("-----------------------");
        char[] chars = {'a', 'b'};
        System.out.println(chars); //字符打印出来值--ab
        String[] sr = {"abc"};
        System.out.println(sr);//字符串打印出来地址值--[Ljava.lang.String;@3d0f8e03
    }

    /**
     * [a-z]--匹配a~z中的任一字符
     * [abcd]--匹配abcd中的任一字符
     */
    @Test
    public void test13() {
        System.out.println("123".matches("\\d*"));//true--124是否匹配正则表达式
        System.out.println("abcd".matches("[a-z]*"));//true--abcd是否匹配正则表达式
        System.out.println("abcd".matches("[abcd]*"));//true---abcd是否匹配正则表达式
    }

    @Test
    public void test14() {
        String str = "www.runoob.com";
        System.out.println(str.startsWith("www"));//true--判断字符串是否以www开头
        System.out.println(str.startsWith("com"));//false--判断字符串是否以com开头
        System.out.println(str.startsWith("runoob", 4));//true--判断字符串是否从索引4开始以runoob开头
    }

    @Test
    public void test15() {
        String str = "www.runoob.com";
        System.out.println(str.subSequence(4, 10));//runoob--返回索引4~9的字符序列
        System.out.println(str.subSequence(0, 3));//www--返回索引0~2的字符序列
    }

    @Test
    public void test16() {
        String str = "   www.runoob.com   ";
        System.out.println(str.trim());//www.runoob.com--取出字符串前面和后面的空白部分
    }

    @Test
    public void test17() {
        String str = "   www.runoob.com   ";
        System.out.println(str.trim());
    }

    @Test
    public void test18() {
        System.out.println(String.valueOf(12));//12--int转成字符串
        System.out.println(String.valueOf('a'));//a--字符转成字符串
        System.out.println(String.valueOf(121L));//121--long转成字符串
        System.out.println(String.valueOf(12.12f));//12.12--float转成字符串
        System.out.println(String.valueOf(12.122d));//12.122--double转成字符串
        System.out.println(String.valueOf(true));//true--boolean转成字符串
        System.out.println(String.valueOf(new char[]{'a', 'b'}));//ab--字符数组转成字符串
        System.out.println(String.valueOf(new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g'},
                2, 4));//cdef--偏移量是2，长度是4，字符数组转成字符串
    }

    @Test
    public void test19() {
        System.out.println("hello".isEmpty());//false
        System.out.println("hello".contains("llo"));//true--判断字符串是否包含llo
        System.out.println("hello".contains("ll"));//true--判断字符串是否包含ll
    }

}
