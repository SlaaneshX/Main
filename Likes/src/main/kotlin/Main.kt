fun main(args: Array<String>) {
    val likes = 721

    print(likes.toString() + " " + getLikesString(likes))
}

fun getLikesString(num: Int): String? {
    val secondFromEnd = num % 100 / 10
    return if (secondFromEnd == 1) {
        "лайков"
    } else when (num % 10) {
        1 -> "лайк"
        2, 3, 4 -> "лайка"
        else -> "лайков"
    }
}