package com.yinjie.mine;


import java.time.LocalDateTime;

/**
 * @Author: yinjie
 * @Date: 2021/4/13 15:26
 * @description
 */
public class Main {

    public static void main(String[] args) {
        //修改设备名称只支持中文、英文、数字、_、-、.及()且长度1到30,
        //  \u4e00-\u9fa5   中文
        //  a-zA-Z  英文
        //  0-9 数字
        //  \\-_().  特殊符号匹配与转义
        //  {1,30}  长度限制
        //  ^   $   表示字符串开头结尾，主要为去空
        String test = "测试123abcABC-_.()~";
        String a = "^[\\u4e00-\\u9fa5a-zA-Z0-9\\-_().]{1,30}$";
        if (!test.matches(a)) {
            System.out.println("输入格式不正确");
        } else {
            System.out.println("输入格式正确");
        }
        //0423-yinjie分支
    }
}
