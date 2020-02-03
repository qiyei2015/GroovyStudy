package com.qiyei.groovy.demo

/**
 * @author Created by qiyei2015 on 2020/2/3.
 * @version: 1.0 <br>
 * @email: 1273482124@qq.com
 * @description:
 */
class ClosureDemo {


    public static void main(String[] args) {
        //使用闭包
        def list = [1,2,3,4,5,6]
        list.each {
            println it
        }

        //定义闭包
        def printer = {
            println it
        }
        //call调用
        printer.call("hello Closure")
        //类似于普通方法调用
        printer("hello Closure")

        getPrinter().call("我是闭包")

        def printer2 = { String name,int age ->
            println "闭包：$name ,$age"
        }
        printer2.call("哈哈",23)

        1.upto(9){
            println it
        }

        def str = "hello groovy";
        //遍历
        str.each {
            println it
        }
        //查找
        def res = str.find {
            return it == 'o'
        }
        println res

        def closure = {
            println "this:" + this
            println "owner:" + owner
            println "delegate:" + delegate;
        }
        closure()

        User user = new User();
        user.say()

        //修改其委托策略
        closure.resolveStrategy = Closure.DELEGATE_FIRST
    }

    static def Closure getPrinter(){
        return {line -> println line}
    }

    static class User{

        def say(){
            def closure = {
                def temp = {
                    println "this:" + this
                    println "owner:" + owner
                    println "delegate:" + delegate;
                }
                temp.call()
            }
            closure.call()
        }
    }
}
