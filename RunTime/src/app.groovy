

Person p = new Person(fname:"Jane",lname:"Nduta",email:"jnudas@gmial.com")
Person p2 = new Person(fname:"Jane",lname:"Nduta",email:"jnudas@gmial.com")
println(p)

assert  p1==p2
if (p == p2){
    println("Used Equals and Hashcode")
}

Person p3 = new Person("Kelly Ann Conway@gmail.com")
