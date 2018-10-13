package main.beans

EmployeeGroovy employeeOne = new EmployeeGroovy(firstName: "Tony", lastName: "Michael", gender: "Female")
println(employeeOne)

EmployeeGroovy employeeTwo = new EmployeeGroovy()
employeeTwo.setFirstName("Richard")
employeeTwo.setLastName("Lopez")
employeeTwo.gender("M")

employeeTwo.getFirstName()

void setFullName(String name) {
    fullName = name
}

void getFirstName(String name) {
    "Full name: ${fullName}"
}
