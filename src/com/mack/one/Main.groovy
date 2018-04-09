package com.mack.one

import groovy.transform.ToString

/*
Groovy - Test
 */

/* AST transformations enable boilerplate code to be reduced.
 */

//AST transformation @ToString

@ToString(excludes = ['countryOfOrigin'])
class Person {
    def firstName
    def lastName
    def age
    def sex
    def countryOfOrigin


    Person(String fname, String lname, int a, String gender, String coo){
        firstName = fname
        lastName = lname
        age = a
        sex = gender
        countryOfOrigin = coo
    }

}

def richard = new Person("Ritchard", "Smith", 34, "male", "Uganda")
assert richard.firstName == "Ritchard"

println(richard)