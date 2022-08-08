fun main(args: Array<String>) {
    val likes = 711

    print(likes.toString() + " " + getLikesString(likes))
}

fun getLikesString(num: Int): String? {
    val secondFromEnd = num % 100 / 10
    return if (secondFromEnd == 1) {
        "людям"
    } else when (num % 10) {
        1 -> "человеку"
        2,3,4,5,6,7,8,9 -> "людям"
        else -> "людям"
    }
}