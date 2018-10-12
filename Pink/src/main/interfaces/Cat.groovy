package main.interfaces

class Cat implements Animal {
    @Override
    List<String> foods() {
        return ['Fish', 'Githeri', 'Waru']
    }

    @Override
    int noOflegs() {
        return 4
    }

    @Override
    def noOfEyes() {
        return 2
    }

    @Override
    def typeOfFood() {
        return "Omnivore"
    }
}
