package gdk

def file = new File('../files/dummy.text')
file.write("Welcome to the file writing process in groovy")
file.append("\nThis will be the second line")

//Read file
List lines = file.readLines()
lines.each {
    println(it)
}

//List files in a directory
//def path = '/Users/roselyne/Stuff/GROOVY/Groovy/Pink'
//
//new File(path).eachFileRecurse { f ->
//    if(f.isFile()){
//        println(file.name)
//    }
//}

def files = new File('../../')

files.eachFile{ ff ->
if(ff.name.endsWith('.groovy')){
    println(ff.name)
}
}

println( files.directorySize())
//new File('one/two/three/for').mkdirs()

new File('one/two').deleteDir()