package rest

import groovyx.net.http.RESTClient
import org.apache.http.entity.ContentType

@Grab('org.codehaus.groovy.modules.http-builder:http-builder:0.7.1' )
String base = 'http://api.icndb.com'

def chuck = new RESTClient(base)
chuck.contentType = ContentType.APPLICATION_JSON

def params = [
        firstName: "Roselyne",
        lastName: "Makena"
]

chuck.get(path: '/jokes/random', query: params){response, json ->
    println(response.status)
    println(json)
}

chuck.post()