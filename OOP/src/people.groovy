class Person {

    //By default - these variables get setters and getters - and are public by default
    String firstName
    String lastName
    def dob
    static country = "Kenya"
    final  static CONTINENT = "AFRICA"

    Person(fname, lname, dob){
        this.firstName = fname
        this.lastName = lname
        this.dob = dob
    }

            void returnNames(){
                println(firstName)
                println "$firstName  $lastName: "+dob
            }
}

def p = new Person("PEter", "Pan", "10th Jan")
println(p.class)

//Accessing a static variable doesn't need instanciation
println(Person.country)
println(Person.CONTINENT)
