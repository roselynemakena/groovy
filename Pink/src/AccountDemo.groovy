import groovy.transform.ToString

@ToString
class Account {

    Float balance = 0
    String type
    Float plus(Account other) {
        this.balance + other.balance
    }

    def deposit(amount) {
        balance += amount
    }

    def withdraw(amount) {
        balance -= amount
    }


}

Account acc1 = new Account(type: "savings")
acc1.deposit( 400)

Account acc2 = new Account(type: "currrent")
acc2.deposit( 900)

println(acc1)
println(acc2)
acc1.withdraw(250)
double total = acc2 + acc1
println(total)

//JAva
char c = 'c'
println c.class

String g = "An awesome string"
print g.class

def x = 'e'
print x.class

//Multiline strings
String story = """
This is a story about a hare and an elephant.
The hare lived in a hole along the forest road in 
a little village called Hillo
while the elephant lived by the lake.
Tha two were very good friends.
"""

print story

///Dollar slashy
String noEscape = $///http://google.com//$

print noEscape

//Regex
def sentence = "My name is rose, and I took a rose from the garden"
def pattern = ~/rose/

sentence = sentence.replaceAll(pattern, "beta")

println(sentence)






