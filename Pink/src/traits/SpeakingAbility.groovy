package traits

trait SpeakingAbility {
    //private variables will give the traits state
    def speak() {
        println("I can speak now..!")
    }

    abstract def mouthType()

    //This will not be recommended by the class that inherits it
    private String bar() {

    }

}
