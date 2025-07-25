package com.test.demo

// Arithmetic Operators
assert  1  + 2 == 3
assert  4  - 3 == 1
assert  3  * 5 == 15
assert  3  / 2 == 1.5
assert 10  % 3 == 1
assert  2 ** 3 == 8

assert 9.intdiv(5) == 1

// Unary Operators
assert +3 == 3
assert -4 == 0 - 4
// Note the usage of parentheses 
// to surround an expression to apply the unary minus to that surrounded expression.
assert -(-1) == 1

// The postfix increment will increment a after the expression has been evaluated and assigned into b
def a = 2
def b = a++ * 3

assert a == 3 && b == 6

// The postfix decrement will decrement c after the expression has been evaluated and assigned into d

def c = 3
def d = c-- * 2

assert c == 2 && d == 6

// The prefix increment will increment e before the expression is evaluated and assigned into f

def e = 1
def f = ++e + 3

assert e == 2 && f == 5

// The prefix decrement will decrement g before the expression is evaluated and assigned into h

def g = 4
def h = --g + 1

assert g == 3 && h == 4

// The binary arithmetic operators we have seen above are also available in an assignment form:

def aa = 4
aa += 3

assert aa == 7

def bb = 5
bb -= 3

assert bb == 2

def cc = 5
cc *= 3

assert cc == 15

def dd = 10
dd /= 2

assert dd == 5

def ee = 10
ee %= 3

assert ee == 1

def ff = 3
ff **= 2

assert ff == 9

// Relational Operators
assert 1 + 2 == 3
assert 3 != 4

assert -2 < 3
assert 2 <= 2
assert 3 <= 4

assert 5 > 1
assert 5 >= -2

// Logical Operators
assert !false
assert true && true
assert true || false


// Precedence
//The logical "not" has a higher priority than the logical "and".

assert (!false && false) == false

// The logical "and" has a higher priority than the logical "or".

assert true || true && false

// Bitwise
int z = 0b00101010
assert z == 42
int y = 0b00001000
assert y == 8
assert (z & y) == z
assert (z & y) == y
assert (z | y) == z
assert (z | y) == z

int mask = 0b11111111
assert ((z ^ z) & mask) == 0b00000000
assert ((z ^ y) & mask) == 0b00100010
assert ((~z) & mask)    == 0b11010101

// Bitshift
assert 12.equals(3 << 2)
assert 24L.equals(3L << 3)
assert 48G.equals(3G << 4)

assert 4095 == -200 >>> 20
assert -1 == -200 >> 20
assert 2G == 5G >> 1
assert -3G == -5G >> 1

// https://groovy-lang.org/operators.html



