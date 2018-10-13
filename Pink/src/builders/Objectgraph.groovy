package builders

import groovy.transform.ToString

@ToString
class Book {
    String title
    String summary

    List<Section> sections = []
}

@ToString
class Section {
    String title
    List<Chapter> chapters = []
}

@ToString
class Chapter {
    String title
}

ObjectGraphBuilder objectGraphBuilder = new ObjectGraphBuilder()
def book = objectGraphBuilder.book(
        title:"The girl who dreamt",
        summary:"About a girl who had a dream to change the world") {

    section(title: "Section One") {
        chapter(chapter: "Chapter One")
        chapter(chapter: "Chapter Two")
        chapter(chapter: "Chapter Three")
    }

    section(title: "Section Two") {
        chapter(chapter: "Chapter Four")
        chapter(chapter: "Chapter Five")
        chapter(chapter: "Chapter Six")
    }
}

println(book)
