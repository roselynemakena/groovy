package com.src.live


Range r = 1..10
println(r)

Date date = new Date()
println(date)
println(date+10)

dateInFuture = date+10

//println(date.upto(date+10))

Range rr = (date..dateInFuture)
println(rr)

//Initiating a list
List x = ['a','b','c','d','e','f']
println(x)

//Adding an item to a list
x.push(90)
assert  x.contains(90)

//Removing last item in a list
x.pop()
assert  x.contains(90) == false

assert x.getAt(0) == 'a'

//Print range in getAt

assert x.getAt(1..2) == ['b','c']

x << 'add'

println(x)

//Sets - doesn't contain duplicates
def num = [4,3,6,7,3,7,9,2,7,5,2,7,9,2,9,4,6,8,3,6,8,36,3,3,5,4,7]
def set = num as Set
println(set)


//Maps contain a colon at the beginning of the square bracket
//Default map is a linked hash map
def map = [:]
map = [fname: "Rose", lname: "Maken"]
println(map)

map.each {}

