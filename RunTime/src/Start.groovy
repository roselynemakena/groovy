import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import groovy.transform.TupleConstructor

@ToString(includeNames = true)
@EqualsAndHashCode

@TupleConstructor // Allows construction of a constructor with un-named params
class Person {

    String fname,lname,email


}
