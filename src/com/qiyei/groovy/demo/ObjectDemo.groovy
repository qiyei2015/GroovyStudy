package com.qiyei.groovy.demo

/**
 * @author Created by qiyei2015 on 2020/2/3.
 * @version: 1.0 <br>
 * @email: 1273482124@qq.com
 * @description:
 */
class ObjectDemo {

    String name

    int age

    def say(){
        return "hello"
    }

    public static void main(String[] args) {
        ObjectDemo demo = new ObjectDemo()
        println demo.say()
    }
}
