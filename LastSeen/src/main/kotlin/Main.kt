fun main() {
    val lastSeenTime = 0

    print(agoToText(60*22))
}

fun agoToText(seconds: Int): String {
    return when {
        seconds in 0..60 -> "только что"
        seconds in 61..60 * 60 -> "был(а) в сети ${seconds / 60} ${timeEnding(seconds / 60)} назад."
        seconds in 60 * 60 + 1..60 * 60 * 24 -> "был(а) в сети ${(seconds / 60) / 60} ${timeEndingHour((seconds / 60) / 60)} назад."
        seconds in 60 * 60 * 24 + 1..60 * 60 * 24 * 2 -> "сегодня"
        seconds in 60 * 60 * 24 * 2 + 1..60 * 60 * 24 * 3 -> "вчера"
        seconds > 60 * 60 * 24 * 3 + 1 -> "давно"
        else -> "[default]"
    }
}

fun timeEnding(min: Int): String {
    val time = min % 100 / 10
    return if (time == 1) {
        "минут"
    } else when (min % 10) {
        1 -> "минуту"
        2, 3, 4 -> "минуты"
        else -> "минут"
    }
}

fun timeEndingHour(min: Int): String {
    val time = min % 100 / 10
    return if (time == 1) {
        "часов"
    } else when (min % 10) {
        1 -> "час"
        2, 3, 4 -> "часа"
        else -> "часов"
    }
}
