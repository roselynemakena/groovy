package rest

import groovy.json.JsonSlurper

def jsonData = '''
{
    "books": {
        "book": {
            "title": "A day in court",
            "isbn": "345-546-32-24-9",
            "author": {
                "first": "Ken",
                "last": "Murzlow",
                "twitter": "@kenMurzlow"
            },
            "related": [
                "People of the Ocean",
                "Other tales"
            ]
        },
        "anotherbook": {
            "title": "A day in court",
            "isbn": "345-546-32-24-9",
            "author": {
                "first": "Ken",
                "last": "Murzlow",
                "twitter": "@kenMurzlow"
            },
            "related": [
                "People of the Ocean",
                "Other tales"
            ]
        }
    }
}'''

JsonSlurper slurper = new JsonSlurper()
def jsonSlurped = slurper.parseText(jsonData)

println(jsonSlurped)
println(jsonSlurped.getClass().getName())
println(jsonSlurped.books.anotherbook.isbn)

//Fetching json from the file
JsonSlurper  slurper2 = new JsonSlurper()
def json = slurper.parse(new File('../json/books.json'))
println(json.books.book.author.twitter)


//Status codes - helps us underastand the status of the rewuest
//100 - informational
//200 - success status
//300 - Redirection
//400 - errors
//500 - server errors

//200 - OK - success
//201 - created
//204 - No content

//301 - moved permanently
//304 -
//307 - temporary redirect

//400 - bad request - malformed syntax
//401/403 - authorization/ bad authentication
//404 - requested resource not found

//500 - server error
//502 - bad gateway

//Content negotiation - in url extention or a header or a request parameter
