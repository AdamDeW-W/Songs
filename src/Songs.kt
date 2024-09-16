class Song ( val title: String, val artist: String)  {
    fun play() {
        println("playing the song $title by $artist")
    }

    fun stop() {
        println("stopped playing $title")
    }
}

fun main(args: Array<String>) {
    val songOne = Song (" The Mesopotamians", "They Might Be Giants")
    val songTwo = Song ("Going Underground", "The Jam")
    val songThree = Song ("Make me Smile", "Steve Harley")
    songTwo.play()
    songTwo.stop ()
    songThree.play()



}
