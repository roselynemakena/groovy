package main.structures

class LoopingThrough {

    def whileTest = { x ->
        List numbers = (1..10).toList()
        println(numbers.class)
        while (numbers){
            numbers.remove(0)
        }
        assert numbers == []
    }

    def forLoopTest = {
        for(i in 1..5) {
            println(i)
        }
    }

    def returnBreakTest() {
        "This is a return statement, that does not need a return keyword"
    }

    def breakTest() {
        def a =1
        while(true) {
            a++
            break
        }

        assert  a == 2

        for(String s in 'a'..'z') {
            if (s == 'a') continue
            if (s > 'd') break
        }
    }
}

LoopingThrough loop = new LoopingThrough()
loop.whileTest(5)
loop.forLoopTest()
println(loop.returnBreakTest())
loop.breakTest()
