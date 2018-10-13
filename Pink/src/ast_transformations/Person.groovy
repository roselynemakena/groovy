package ast_transformations

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@EqualsAndHashCode
@ToString(excludes = ["email"])
class PersonClass {

    String first,last,email

}


