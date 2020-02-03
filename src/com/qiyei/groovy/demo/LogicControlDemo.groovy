package com.qiyei.groovy.demo

/**
 * @author Created by qiyei2015 on 2020/2/3.
 * @version: 1.0 <br>
 * @email: 1273482124@qq.com
 * @description:
 */
class LogicControlDemo {


    public static void main(String[] args) {


        if (true){
            println "hello"
        } else {
            println "world"
        }

        def aa = 1.0

        switch (aa){
            case 1:
                println "number"
                break
            case "aa":
                println "aa"
                break
            case String:
                println "String"
                break
            case double:
                println "double"
            default:
                break

        }

        for (i in 0..9){
            println i
        }

        for (int i = 0;i < 10;i++){
            println "i = $i"
        }

        def list = [1,2,3]
        while (list){
            list.remove(0)
            println "size= ${list.size()}"
        }
    }

}
