class CollectionClass {

    def looping() {
        //For loop
        for (int i = 1; i < 10; i++) {
            println(i)
        }

        //For loop
        for (int i = 10; i >= 1; i--) {
            println(i)
        }
        def list = ["a","b","c","d","e","f","g"]
        println("-----------")
        //For loop
        for (int i = 0; i <= list.size()-1; i++) {
            println(list[i])
        }
        //Ranges)

        //
    }
}

CollectionClass col = new CollectionClass()
col.looping()
Range numbers = 1..<15
println numbers
println(numbers.class)
println(numbers.to -5)

assert numbers.contains(4)

Date now = new Date()
oneWeeklater = now + 7
println(now+7)

Range days = now..oneWeeklater
println(days)

List list = [1,2,3,4,5,6,7,8,9,10]
list.push(11)
list << 9

println(list)
println(list-10-11+23)

println(list.getAt(0..3))

for(x in list) {
//    println("No is: ${x}")
}

println(list.unique())

//maps - key value pairs
def map = [:]
println(map.getClass().getName())

def makena = [first: "makena", last: "Rpse"]
println(makena)

makena.gender = "female"
makena.'Email adress' = "rose@gmail.com"
def location = "Place of residence"
makena.(location)  = "Meru"

for(x in makena.keySet()) {
    println("${x}")
}

println(makena)

//enum
enum daysOftheWeek {
    MONDAY,
    TUES,
    WED,
    THUR,
    FRI,
    SAT,
    SUN
}
println("-------->")

Range weekdays = daysOftheWeek.MONDAY..daysOftheWeek.SUN
println("Weekdays Size: ${weekdays.size()}")
assert weekdays.contains(daysOftheWeek.WED)

println(daysOftheWeek.MONDAY..daysOftheWeek.SUN)
for(d in daysOftheWeek) {
    println(d)
}

List listDays = [ "MONDAY",
     "TUES",
     "WED",
     "THUR",
     "FRI",
     "SAT",
     "SUN"]

println(listDays)
println(listDays.size())
listDays.remove("SAT")
println(listDays)
listDays << "SAT"

println(listDays)

println(listDays[2])


Map mapDays = [ 1: "MONDAY",
                2: "TUES",
                3: "WED",
                4: "THUR",
                5: "FRI",
                6: "SAT",
                7: "SUN"]

println(mapDays)
println(mapDays.size())
println(mapDays.getClass().getName())

mapDays.each {
    println(it.value)
}