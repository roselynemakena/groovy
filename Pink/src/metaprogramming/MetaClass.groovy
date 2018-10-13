package metaprogramming

import groovy.transform.ToString

//Metaprogramming includes
//method calls in groovy
//Meta class =- adding properties to method
//Meta Project Protocol
// Collection of rules - how a request for a method call is handled by groovy runtime system
//and how to control the immediate layer


@ToString
class MetaDemo {
    String prop1 = "prop1"

    def  getProperty(String name) {
        println("print by get Property: ${name}")
        //return
        metaClass.getProperty(this, name)

    }

    def propertyMissing(String name) {
        "This kaproperty doesnt exist: ${name}"
    }

    def methodMissing(String name, def args) {
        println "Method not found yawah! : ${name}"
        println "Argumetns missing : ${args}"
        throw new Exception("Method missing EXCCEEEPTIONN")
    }

}
MetaDemo meta = new MetaDemo()
println(meta.prop1)
println(meta.prop5)

meta.someRnaomMethod(4,456.345,"Hi")



