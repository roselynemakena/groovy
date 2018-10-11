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