class Tweeter {
    String message
    String handle
    String time
    String hashTag

    def postTweet() {
        println "$handle $message $hashTag \n $time"
    }
}

tweetOne = new Tweeter()
tweetOne.message = "So greatful to be alive and kicking in alife that's so queer"
tweetOne.handle="@mck"
tweetOne.time = "30s ago..."
tweetOne.hashTag = "#life #awesomeLife #goBig"

tweetOne.postTweet()
