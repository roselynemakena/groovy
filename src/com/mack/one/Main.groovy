package com.mack.one

import groovy.transform.IndexedProperty
import groovy.transform.Sortable
import groovy.transform.ToString
import groovy.transform.TupleConstructor
import groovy.transform.builder.Builder
import groovy.transform.builder.SimpleStrategy
import groovy.util.logging.Log
import groovy.util.logging.Log4j

/*
Groovy - Test
 */

/* AST transformations enable boilerplate code to be reduced.
 */

//AST transformation @ToString

//@ToString(excludes = ['countryOfOrigin'])
//@ToString(ignoreNulls = true)
@ToString(includePackage = false, includeSuper = false)
@TupleConstructor
//@Builder(builderStrategy = SimpleStrategy)
@Log
class Person {
    def firstName
    def lastName
    def age
    def sex
    def countryOfOrigin

    /*
IndexedProperty AST  - used to create indexes for arrays/Lists
 */

    @IndexedProperty List someList = ["one", "two"]
    @IndexedProperty String[] anotherList = ["seven", "eight"]
    Person(String fName, String lName){

        firstName = fName
        lastName = lName

    }


    Person(String fname, String lname, int a, String gender, String coo){
        firstName = fname
        lastName = lname
        age = a
        sex = gender
        countryOfOrigin = coo
    }

    Person(String fName, int ag){
        firstName = fName
        age = ag
    }
    void sayHi(){
        log.debug "Logger Debug Saying hi"
    }
}

def richard = new Person("Ritchard", "Smith", 34, "male", null)
assert richard.firstName == "Ritchard"
richard.sayHi()

Person gertrude = new Person("Gertie", "Hills")
Person samule = new Person( "Sam", "Jones")

assert  gertrude != samule



println(richard.someList)

/* Builder AST
Builds classes that can be used for fluent API calls
 */

//def dan = new Person().setFirstName("Daniel").setLastName("Finch").setAge(23).setSex("male").setCountryOfOrigin
//("Ethiopia")
//def daniel = new Person().setFirstName("Luke")

assert gertrude.firstName == "Gertie" : "Name should be Gertie"