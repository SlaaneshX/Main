fun main() {
    val melomanStatus = true
    val itemPrice = 100.0
    val noDiscount = 1000
    val startDiscount = 100
    val secondDiscount = 10000
    val maxDiscountPercent = 0.05

    val itemsCount = 3


    var total = itemsCount * itemPrice

    calculateDiscount(itemPrice, itemsCount, melomanStatus)
}

fun melomanDiscount(meloman: Boolean, total: Double) {
    var summ = total
    if (meloman) {
        summ -= total * 0.01
        println("Сумма покупки с учетом скидки постоянного клиента: $summ")
    }
}

fun calculateDiscount(price: Double, count: Int, melomanStatus: Boolean) {
    var total = count * price
    if (total > 1000 && total < 10000) {
        total -= 100
        println("Сумма покупки с учетом скидки: $total")
        melomanDiscount(melomanStatus, total)
    } else if (total > 10000) {
        total -= total * 0.05
        println("Сумма покупки с учетом скидки: $total")
        melomanDiscount(melomanStatus, total)
    } else {
        println("Сумма покупки: $total")
        melomanDiscount(melomanStatus, total)
    }
}