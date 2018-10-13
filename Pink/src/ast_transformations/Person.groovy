package ast_transformations

import groovy.transform.Canonical
import groovy.transform.EqualsAndHashCode
import groovy.transform.Sortable
import groovy.transform.ToString
import groovy.transform.TupleConstructor
import groovy.transform.TypeChecked
import jdk.nashorn.internal.ir.annotations.Immutable

//@EqualsAndHashCode
//@TupleConstructor
//@ToString(excludes = ["email"])

@Canonical // Replaces the 3 above - if they do not need to be customized
@Sortable(includes = ["last", "first"])
class PersonClass {
    String first,last,email
}

@Singleton
class DbConnection{

}

@ToString
@Immutable
@TypeChecked
class ImmutePerson {
    String first,last

    String getFullName() {
        "$first $last"
    }
}


//DbConnection db = new DbConnection()
//println(db)


DbConnection db = DbConnection.instance
println(db)


