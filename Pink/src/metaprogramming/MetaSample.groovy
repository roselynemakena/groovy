package metaprogramming

import groovy.transform.ToString

@ToString
class Meta {
    String fName, lName
}

Meta meta = new Meta(fName: "Rose", lName: "Lolo")
println(meta)
println(meta.metaClass)

Expando expando = new Expando()

expando.name = "Some Name"
expando.writeCode  = {println("Expando class wrote a method with a non existing method")}
expando.writeCode()

//Meta class is an expando - allows you to add methods and classes
//Every class has a metaclass attached to it
//Expando allows an instance to have additional methods on runtime

Meta meta1 = new Meta()
meta1.metaClass.name = "MAkena"
meta1.metaClass.writeCode = {println("$name loves to write code")}
meta1.writeCode()

String.metaClass.shout = { -> toUpperCase() }
println("Hii people".shout())

