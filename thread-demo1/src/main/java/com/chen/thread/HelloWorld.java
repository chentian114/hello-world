package com.chen.thread;

/**
 * Created by ChenTian on 2018/2/9.
 * Shift+Tab 反向缩进
 */
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("hello World! I'm chentian!");
        readme();
    }

    private static void readme() {
        System.out.println("thread-demo1工程简介：\r\n" +
                "课程主要练习java多线程基础，详情参见README-多线程基础.md");
    }

}
