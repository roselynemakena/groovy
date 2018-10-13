package builders

import groovy.xml.MarkupBuilder

MarkupBuilder builder = new MarkupBuilder()
builder.setOmitEmptyAttributes(true)
builder.setOmitNullAttributes(true)
builder.sports {
    sport(id:1){
        name 'Basketball'
    }
    sport(id:2){
        name 'Hockey'
    }
    sport(id:3){
        name 'Football'
    }
    sport(id:4){
        name 'VolleyBall'
    }
    sport(id:5){
        name 'Table tennis'
    }
}

println('\n\n\n')
FileWriter writer = new FileWriter('../html/index.html')
MarkupBuilder htmlBuilder = new MarkupBuilder(writer)

List courses = [
        [id:1, name: "Groovy"],
                [id:2, name: "Java"],
                [id:3, name: "Spock"],
                [id:4, name: "Ruby"]
]

htmlBuilder.html {
    head{
        title "Wasup people"
        description 'This is groovy htm builder'

    }
    body {
        h1 'Ola Signorita'
        p 'Once upon a tim, there was groovy'
        section {
            h1 'Courses'
            table {
                tr {
                    th 'ID'
                    th 'Name'
                }

                courses.each { course ->
                    tr{
                        td course.id
                        td course.name
                    }
                }
            }
        }

    }
}

