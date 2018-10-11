class Closures {
}

//Iterators
//Control structures
//Builders
//Callbacks
//Higher order functions
//Closing resources
//Threads
//DSLz
//Fluent interfaces

def sayHello = {name ->
    println("Hello ${name}")
}

sayHello("Makena")


List nums =[3,4,6,8,5,3,9,0,4,3]
nums.each { n ->
    println(n)
}

def timesTen(num, closure) {
    closure(num * 10)
}

timesTen(2, {println(it)})

4.times{
    Random x = new Random()
    println(x.nextInt())
}