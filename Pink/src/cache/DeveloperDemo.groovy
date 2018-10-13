package cache


//Interept cache invoke pattern - helps to boost performance
class Developer {

    List languages =[]

    def methodMissing(String name, args) {
        println("$name is NOT available - sorry!")

        if(name.startsWith("write")){
            String language = name.split("write")[1]
            if(languages.contains(language)) {
                println(language)
                def impl = { Object[] theArgs ->
                    println("I like to write code in: $language")
                }

                getMetaClass()."$name" = impl
                return impl(args)
            }
        }
    }
}

Developer dev = new Developer()
dev.languages << "Java"
dev.languages << "Groovy"
dev.languages << "Spock"
dev.languages << "Appium"

println(dev.metaClass.methods.size())
dev.writeJava()
dev.writeGroovy()
dev.writeJava()
println(dev.metaClass.methods.size())
