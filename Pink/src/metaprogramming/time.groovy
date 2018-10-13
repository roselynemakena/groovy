package metaprogramming

import groovy.time.TimeCategory



use(TimeCategory) {
    println(10.hours.ago)

    def someDate = new Date()
    println(someDate - 8.months)
}
