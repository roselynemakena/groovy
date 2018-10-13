package main.beans

import groovy.transform.ToString

@ToString
class EmployeeGroovy implements Serializable {

    String firstName, lastName, gender
}
