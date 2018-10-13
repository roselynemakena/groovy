package ast_transformations


//Hash and Equals
PersonClass p1 = new PersonClass(first: "Roes", last: "Makena",email: "Rose@gmail")
PersonClass p2 = new PersonClass(first: "Roes", last: "Makena",email: "Rose@gmail")
println(p1)

assert p1 == p2

//Tuple constructor
PersonClass p3 = new PersonClass("Tom", "Hawkins", "Super#gmail,cpm")
println(p3)

PersonClass p4 = new PersonClass("Jiji", "Amber", "Super#gmail,cpm")
PersonClass p5 = new PersonClass("Alias", "Mimi", "duda#gmail,cpm")
PersonClass p6 = new PersonClass("Haley", "Lee", "leehaille#gmail,cpm")
PersonClass p7 = new PersonClass("Kai", "Boss", "kaibaoos#gmail,cpm")

def people = [p4,p5,p6,p7]
println(people.toSorted())

ImmutePerson p10 = new ImmutePerson(first: "Lilian", last: "Muli")
p10.first = "Another name"
println(p10)

p10.first = "Another name"


