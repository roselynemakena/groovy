package builders

import groovy.xml.MarkupBuilder


FileWriter fileWriter  = new FileWriter('../html/books.html')
MarkupBuilder builder = new MarkupBuilder(fileWriter)
List books = [
        [isbn: "978-1935182443", title: "Groovy in Action 2nd Edition", author: "Dierk Koenig", price: "50.58"],
                [isbn: "978-1935182948", title: "Making Java Groovy", author: "Ken Kousen", price: "33.96"],
                [isbn: "978-1937785307", title: "Programming Groovy 2: Dynamic Productivity for the Java Developer", author: "Venkat Subramaniam", price: "28.92"]
]

builder.books{
    books.each { bookItem ->
        book(isbn: bookItem.isbn){
            title bookItem.title
            author bookItem.author
            price bookItem.price
        }
    }

}

builder.html {
    head{
        title "Book List"
        description 'This is groovy htm builder'

    }
    body {
        h1 'Books'
        p 'All biiks in library'
        section {
            h1 'Books'
            table {
                tr {
                    th 'Book isbn'
                    th 'Title'
                    th 'Author'
                    th 'Price'
                }

                books.each { book ->
                    tr{
                        td book.isbn
                        td book.title
                        td book.author
                        td book.price
                    }
                }
            }
        }

    }
}
