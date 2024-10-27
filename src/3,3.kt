class SolarProfitCalculator(
    private val forecastedPower: Double, // Прогнозована потужність (кВт·год)
    private val actualPower: Double,     // Реальна потужність (кВт·год)
    private val tariff: Double,          // Тариф на електроенергію ($/кВт·год)
    private val operationalCosts: Double,// Операційні витрати ($)
    private val capitalCosts: Double     // Капітальні витрати ($)
) {

    // Метод для розрахунку прибутку
    fun calculateProfit(): Double {
        val revenue = actualPower * tariff // Дохід
        return revenue - operationalCosts - capitalCosts // Прибуток
    }
}
fun main() {
    // Введення даних
    val forecastedPower = 5000.0 // Прогнозована потужність (кВт·год)
    val actualPower = 4800.0     // Реальна потужність (кВт·год)
    val tariff = 0.1             // Тариф ($/кВт·год)
    val operationalCosts = 500.0 // Операційні витрати ($)
    val capitalCosts = 2000.0    // Капітальні витрати ($)

    // Ініціалізація калькулятора
    val calculator = SolarProfitCalculator(forecastedPower, actualPower, tariff, operationalCosts, capitalCosts)
    val profit = calculator.calculateProfit()
    println("Прибуток: $profit$")
}
