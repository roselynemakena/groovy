package main.oop

import groovy.transform.ToString

@ToString
class Phone {

    String name
    String appStore
    String os


    def powerOn = {
        println("${name}: powerd on")

    }

    def ring = {
        println("${name}: rrrrrRRRrrrringing")
    }

    def powerOff = {
        println("${name}: powerd off")

    }
}
