package metaprogramming

class CategoryClass {
}

//Adding a method to a string class
//It's sporadically adding methods to a string
//Category class - helps methods to be added to a category/particular scope instead of application wide
String.metaClass.shout = { -> toUpperCase()}
println "today is an aeosme day".shout()

class StringCategoryo {
     static String shout(String s) {
         s.toUpperCase()
     }
}
