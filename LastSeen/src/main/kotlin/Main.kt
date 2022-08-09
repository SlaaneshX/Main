fun main() {
    val lastSeenTime = 0

    print(agoToText(60 * 60 * 3))
}

fun agoToText(seconds: Int): String {
    return when {
        seconds in 0..60 -> "������ ���"
        seconds in 61..60 * 60 -> "���(�) � ���� ${seconds / 60} ${timeEnding(seconds / 60)} �����"
        seconds in 60 * 60 + 1..60 * 60 * 24 -> "���(�) � ���� ${(seconds / 60) / 60} ${timeEndingHour((seconds / 60) / 60)} �����"
        seconds in 60 * 60 * 24 + 1..60 * 60 * 24 * 2 -> "�������"
        seconds in 60 * 60 * 24 * 2 + 1..60 * 60 * 24 * 3 -> "�����"
        seconds > 60 * 60 * 24 * 3 + 1 -> "�����"
        else -> "[default]"
    }
}

fun timeEnding(min: Int): String {
    val time = min % 100 / 10
    return if (time == 1) {
        "�����"
    } else when (min % 10) {
        1 -> "������"
        2, 3, 4 -> "������"
        else -> "�����"
    }
}

fun timeEndingHour(min: Int): String {
    val time = min % 100 / 10
    return if (time == 1) {
        "�����"
    } else when (min % 10) {
        1 -> "���"
        2, 3, 4 -> "����"
        else -> "�����"
    }
}
