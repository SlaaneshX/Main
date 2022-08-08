fun main() {
    val amount = 100000
    val taxMin = 3500
    val taxPercent = 0.75
    var finalTax = if (amount * taxPercent < taxMin) taxMin else amount * taxPercent / 100
    println(finalTax)
}
