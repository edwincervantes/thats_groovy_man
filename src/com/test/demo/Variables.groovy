package com.test.demo

String name = "Edwin"

println 'My name is ${name}'
// Output: println "My name is ${name}"
println "My name is ${name}"
// Output: println "My name is Edwin"

def x = 10
def y = 20
print x
println y
/*
 * print puts on same line, use println to use seperate lines
 */

// Assign multiple vars
def (a, b, c) = [30, "forty", 50.0]

println a
println b
println c


/*
 * Other types:
 * byte
 * short
 * float
 * boolean
 * char
 */
