/*
Closures are methods that are objects. They can be passed around a program
They are used for:
 - Iterators
 - Callbacks
 - High order functions
 - Create control structures
 - Builders
 - Resource Allocation
 - Creating threads
 - Building DSLs
 - Fluent interfaces
 */

//Defining closures
def close = {

}
println(close.class)

def hi = { name ->
    println("Hi people, $name")
}

hi("Makenah")

List nums = [2,34,5,47,24,47,79,5,95,25,96]
nums.each {
    println(it)
}
println("-----------------")
nums.each { n ->
    println(n)
}

def doSomething(num,closure){
    closure(num *5)
}

doSomething(3, {println(it)})