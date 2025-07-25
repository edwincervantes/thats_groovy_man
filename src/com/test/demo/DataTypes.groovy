package com.test.demo

//byte
byte b = 10
println(b)
println(Byte.MIN_VALUE)
println(Byte.MAX_VALUE)
println("====================")

//short
short s = 100
println(s)
println(Short.MIN_VALUE)
println(Short.MAX_VALUE)
println("====================")

//int
int i = 1000
println(i)
println(Integer.MIN_VALUE)
println(Integer.MAX_VALUE)
println("====================")

//long
long l = 100000L
println(l)
println(Long.MIN_VALUE)
println(Long.MAX_VALUE)
println("====================")

//float
float f = 100.0002F
println(f)
println(Float.MIN_VALUE)
println(Float.MAX_VALUE)
println("====================")

//double
double d = 1000.0002
println(d)
println(Double.MIN_VALUE)
println(Double.MAX_VALUE)
println("====================")

//char
char c = 'a'
println(c)
println("====================")

//Boolean
boolean flag = false
println(flag)
println("====================")

//String
String str = 'My string'
println(s)
println("====================")

//Get type and cast
def g = 10
println(b.getClass().getName())
g = (byte)g
println(b.getClass().getName())

