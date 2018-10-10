import groovy.transform.ToString

@ToString
class Joys {
    String firstName
    String lastName

    def makeJoyfulSound(sound) {
        println("Sound: $sound")
    }
}

j = new Joys(firstName: "Holo", lastName: "Didi")
println(j)
j.firstName = "Kian"
j.lastName = "Kolo"

j.makeJoyfulSound("Alilililiiii")

//Ternary operator
int x = 1
result = (x==1) ? "Is INE!" : "nope"
print result

//safe operator
j2 = new Joys()
println j2.firstName
