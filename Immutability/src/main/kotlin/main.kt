fun main() {
    val amount = 100000
    val taxMin = 3500
    val taxPercent = 0.075
    var finalTax = if (amount * taxPercent < taxMin) taxMin / 100 else amount * taxPercent
    println(finalTax)
}
