import groovy.json.JsonBuilder
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

    static printWords(){
        def words = ["solution",
                 "coalition",
                 "visual",
                 "reference",
                 "medium",
                 "species",
                 "spot",
                 "confine",
                 "door",
                 "burst"]
        for(x in words){
            println(x)
        }
    }


}
def buildJSON() {
    JsonBuilder build = new JsonBuilder()

    build.books {
        book {
            name 'Rose'
            age '56'
            related 'A stitch in time', 'the man of the people'
        }
    }
}

//Contructors are created on the fly in groovy
//def people = new People(first: "Rose", last: "mc", age:34,salary: 233,sex:"male")
//println(people)

def person2 = new People("George Washington")
println(person2)
assert person2.first == "George"

People.sayHi()
//People.printWords()

println buildJSON().toString()




