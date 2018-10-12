package main.oop

import groovy.transform.ToString

class FunSection {
    //Contructors
    //Fields
    //Methods

    String firstName
    protected String f1,f2,f3
    private Date createdOn = new Date()

    final static welcomeMsg = ' Hello'

    def superStart() {
        //local variables
        String msg = "Hello"
        String firstName = "Florence"

        println("$msg, $firstName")
    }

}

println(FunSection.welcomeMsg)

FunSection fs = new FunSection()
fs.superStart()

//Constructors and methods
@ToString
class Cutlery {
    //constructor

    String cutleryName, cutleryUse
    String first,last

    Cutlery(cutleryName, cutleryUse) {
        this.cutleryName = cutleryName
        println("${cutleryName} + ${cutleryUse}")

    }

    Cutlery(fullNames) {
        List parts = fullNames.split(' ')
        first = parts[0]
        last = parts[0]
    }
}

Cutlery spoons = new Cutlery("Spoon", "Eating")
println(spoons.cutleryName)

Cutlery names = new Cutlery("Rose Makena")
println(names.first)
