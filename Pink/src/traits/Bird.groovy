package traits

class Bird implements FlyingAbility, SpeakingAbility {
    @Override
    def mouthType() {
        return "BEAK"
    }
}
