class ControlStructures {
    //
    def checkTests() {
        Boolean type = true
        int x;
        int y = 9;
        assert type == true
        assert x != true
        assert y == 9
        assert 4


        //Matcher
        assert ('a' =~ /a/)
        assert !('a' =~ 'b')

        //Collection
        assert [1]
        assert ![]

        //Maps
        assert [1: 'one']
        assert ![:]

        //String
        assert 'a'
        assert !''

        //Number
        assert 1
        assert !0

        //None of the above
        assert new Object()
        assert !null

    }

    //Conditional Structures
    //if
    def ifStatements = {
        def age = 18
        if (age < 18) {
            println("You are under 18 years")
        }
        else{
            println("Yaay, you are older!")
        }
    }

    def ternaryOperator = {
        def name = 'Tala'
        println(name.toLowerCase() == 'tala' ? "Yes!!" : "It aint")
    }

    def elvisOperator = {
        def msg
        def result = (msg !=null) ? msg : 'Some default message here'

        def other = msg?:"Some message here"
        println(result)
        println(other)
    }

    def switchStatements = { num ->
        switch (num) {
            case 1:
                println("One")
                break
            case 2:
                println("Two")
                break
            case 3:
                println("Three")
                break
            case 4:
                println("Four")
                break
            case 5:
                println("Five")
                break

            case Float:
                println("A float message")
                break

            case [1,2,12]:
                println("Is in list [1,2,12]")
            default:
                println("Some default message")
                break
        }
    }

    //in control structure
    def inTest = {
        def validAges = (24..34)
        assert 33 in validAges
        println("Valid age:)")
    }
}

ControlStructures cs = new ControlStructures()
cs.checkTests()
cs.ifStatements()
cs.ternaryOperator()
cs.elvisOperator()

(1..<7).each {
    println(it)
    cs.switchStatements(it)
}

cs.switchStatements(12)
cs.inTest()

