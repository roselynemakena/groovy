package main.oop

class Exceptions {

    //In groovy all exceptions are optional

    public void someJaveMethod() throws Exception {
        throw new Exception()
    }

    def somegroovyMethod() {
        throw new Exception("Some groovy Exception")
    }

    List log = []

    def testgroovyEx() {
        try {
            somegroovyMethod()
        }
        catch (Exception x) {
            log << x.message

        }
        finally {
            log << "Finito!"
        }

        println(log)
    }
}

Exceptions except = new Exceptions()
except.testgroovyEx()

//Multicatch Exception in java

try{

}catch(Exception x){

}