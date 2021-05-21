package com.json.demo1;

import net.sf.json.JSONObject;
import org.junit.Test;

/**
 * @Author: dongjie
 * @Date: 2021/5/19 22:44
 */
public class Main1 {
    //1.json对象-->>>user对象
    @Test
    public void test1() {
        String json = "{userNmae:'zhangsan'," +
                "age:23,sex:'male'}";
        JSONObject jsonObject = JSONObject.fromObject(json); //string-->>json对象
//        printUser(jsonObject);  //报错，json对象无法传入user对象，类型不匹配

        //这里得到的user对象为null
        User user = (User) JSONObject.toBean(jsonObject, User.class);  //json对象转成user对象
        System.out.println(printUser(user).toString());
    }

    public User printUser(User user) {
        return user;
    }

    //    2.user对象转成json对象
    @Test
    public void test2() {
        System.out.println(JSONObject.fromObject(new User()).toString());
    }

}
