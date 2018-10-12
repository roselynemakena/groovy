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

nums.eachWithIndex{num,index ->
    println("${index}: ${num}")

}

def timesTen(num, closure) {
    closure(num * 10)
}

timesTen(2, {println(it)})

4.times{
    Random x = new Random()
    println(x.nextInt())
}

def noParamsAccepted = { ->
    println("no params")
}
noParamsAccepted()

def twoParams = { first, last ->
    println("$first $last")
}
twoParams("Rose", "makena")

//default values

def greet = {greeting, name= "Rosah" ->
    println("$greeting $name")
}
greet("Holla")
//No name given to param - it takes 'it'

//Closures - sample log

def log = { String type, Date createdOn, String msg ->
    println("[${type}]: ${createdOn} : ${msg}")

}

log("DEBUG", new Date(), "Failure on the if statement")

//Using a curry
def bugLog = log.curry("BUG")
bugLog(new Date(), "Bug caught!!")

//rcurry - right curry
def rcurryLog = log.rcurry("This is from the end")
rcurryLog("ERROR", new Date())

//indexed based currying
def typeMsgLog = log.ncurry(1,new Date())
typeMsgLog("QA LOG", "Skipped date index to print this log")

//Owner delegate and this - in closures
//this - corresponds to the enclosing class where the closure is defined -
//Owner - correspods to the object where the closure is defined - class/closure]
//delegate - 3rd party object whenever the receiver of the message is not defined

class sample {
    def outerClosure = {
        println(this.class.name)
        println(owner.class.name)
        println(delegate.class.name)

        def nestedClosure = {
            println(this.class.name)
            println(owner.class.name)
            println(delegate.class.name)
        }
        nestedClosure()
    }
}

def sample = new sample()
sample.outerClosure()

def append = {
    println("APEEND"+it)
}
//Delegates in groovy
def writer = {
    append 'Makena'
    append 'is an awesome person'
}


StringBuffer sb = new StringBuffer()
writer.resolveStrategy = Closure.DELEGATE_FIRST
writer.delegate = sb
writer()

//method that accepts closure as an argumetn

def makeTea(Closure closure) {
println(closure)
}

def mixmilk = { cups ->
    println("${cups} of tea and ${cups} of water mixed")
}

mixmilk(3)

makeTea {mixmilk}

List colors = ["blue", "green", "red", "yellow", "navy"]

colors.each {
    println(it)
}

//map of data - loopinf

Map user = [
    username: "Jules" ,
    age: 23 ,
    gender: "married"
]

user.each{ item, key ->
    println(key)
}

println user.find {u -> user.age ==23 }