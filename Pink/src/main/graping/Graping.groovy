package main.graping

import org.apache.commons.lang3.text.WordUtils

@Grapes(
    @Grab(group='org.apache.commons', module='commons-lang3', version='3.7')
)

String name = "Rose Make g"
println(WordUtils.initials(name))






