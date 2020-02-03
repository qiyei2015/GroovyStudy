package com.qiyei.groovy.demo

/**
 * @author Created by qiyei2015 on 2020/2/3.
 * @version: 1.0 <br>
 * @email: 1273482124@qq.com
 * @description:
 */
class DataStructDemo {


    public static void main(String[] args) {

        def list = [];
        def list2 = ["1","aa"]
        println list.class
        println list2.class

        def sortList = [1,5,2,8,3,78,4,7,10]
        sortList.sort()
        println sortList

        def res = sortList.findAll {
            it > 5
        }
        println res

        //定义map
        def map = ["1":2,"he":"Str"]
        println map.getClass()
        println map["1"]
        println map.he
        //遍历
        map.each {
            println it.key
            println it.value
        }

        def range = 1..10
        println range[1]
        println range.contains(10)
        println "from=$range.from,to=$range.to"

        def num = 34
        switch (num){
            case 0..<10:
                println "一般"
                break
            case 11..<20:
                println "中等"
                break
            case 21..<30:
                println "良好"
                break
            case 31..<100:
                println "优秀"
                break
        }
    }
}
