package com.qiyei.groovy.demo

/**
 * @author Created by qiyei2015 on 2020/2/3.
 * @version: 1.0 <br>
 * @email: 1273482124@qq.com
 * @description:
 */

//单引号，普通字符串
def line1 = 'hello'
println line1.class

//双引号，GString字符串
def line2 = "hello world"
println line2.class

//三引号，保留格式的字符串
def line3 = '''hello world

    hehheh
'''
println line3
println line3.class

def name = "张三"
//GString
def line4 = "hello $name"
println line4
println line4.class

String ss = "groovy"
println ss.center(10,"HHH")
println ss.padLeft(9,"HY")

def aa = "hello"
def bb = "cexcd"
def cc = "hello"
println(aa == cc)
println(aa > bb)

println aa[2]

def dd = "llo"

println aa.minus(dd)