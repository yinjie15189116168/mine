package com.yinjie.mine.set;


/**
 * @Author: yinjie
 * @Date: 2021/3/30 10:46
 * @description
 */
public class List {

    public static int c = 1;

    public static void main(String[] args) {
//        User user = new User("尹杰", 123);
//        List list = new List();
//        list.getUser(user);
//        System.out.println(user.getAge() + "----------" + user.getName());
//        int a = 444;
//        list.add(a);
//        System.out.println(a);
//        String a = "12";
//        String b = new String("2");
//        String c = "3";
//        String d = "1" + "2";
//        System.out.println(a);
//        System.out.println(d);
//        System.out.println(a == d);

        String aaa = "123";
        System.out.println(aaa.hashCode());

        String bbb = "333";
        System.out.println(bbb.hashCode());



    }


    public User getUser(User user) {
        user.setAge(user.getAge() + 1);
        user.setName(user.getName() + "111111111111");
        return user;
    }


    public int add(int a) {
        return a + 1;
    }
}
