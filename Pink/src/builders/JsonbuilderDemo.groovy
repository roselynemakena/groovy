package builders

import groovy.json.JsonBuilder


JsonBuilder builder = new JsonBuilder()

builder.books{
    book{
        title "A day in court"
        isbn '345-546-32-24-9'
        author (first: 'Ken', last: 'Murzlow', twitter: '@kenMurzlow')
        related ('People of the Ocean', 'Other tales')
    }
    anotherbook{
        title "A day in court"
        isbn '345-546-32-24-9'
        author (first: 'Ken', last: 'Murzlow', twitter: '@kenMurzlow')
        related ('People of the Ocean', 'Other tales')
    }
}

println(builder.toPrettyString())
new File('../json/books.json').write(builder.toPrettyString())