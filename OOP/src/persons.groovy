import groovy.transform.ToString

@ToString
class People {
String first, last, sex
    int age, salary


    People(String full){
        List names = full.split(' ')
        first = names[0]
        last = names[1]

    }

    static sayHi(){
        println("Hello hello")
    }

}


//Contructors are created on the fly in groovy
//def people = new People(first: "Rose", last: "mc", age:34,salary: 233,sex:"male")
//println(people)

def person2 = new People("George Washington")
println(person2)
assert person2.first == "George"

People.sayHi()`

