package gdk

//Enables running multiple tasks at a time
def t = new Thread(){

}

Thread.start{

}

//Start thread with a name
Thread.start('Makena tread'){

}

//Start thread with a daemon
Thread.startDaemon('Makena tread'){

}

List numbers = []

10.times {
    println("Push: ${it}")
    numbers << it
}
println(numbers)

for(i in 9..0){
    println("Pop: ${i}")
    numbers.remove(i)
}

println(numbers)

