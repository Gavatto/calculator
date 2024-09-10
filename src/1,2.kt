fun main() {
    // Заданий склад компонентів палива за варіантом 4
    val H_P = 3.4
    val C_P = 70.6
    val S_P = 2.7
    val N_P = 1.2
    val O_P = 1.9
    val W_P = 5.0
    val A_P = 15.2

    // Коефіцієнт переходу від робочої до сухої маси
    val KRS = 100 / (100 - W_P)
    println("Коефіцієнт переходу від робочої до сухої маси: $KRS")

    // Коефіцієнт переходу від робочої до горючої маси
    val KRG = 100 / (100 - W_P - A_P)
    println("Коефіцієнт переходу від робочої до горючої маси: $KRG")

    // Склад сухої маси
    val H_S = H_P * KRS
    val C_S = C_P * KRS
    val S_S = S_P * KRS
    val N_S = N_P * KRS
    val O_S = O_P * KRS
    val A_S = A_P * KRS

    println("Склад сухої маси:")
    println("H_S: $H_S%")
    println("C_S: $C_S%")
    println("S_S: $S_S%")
    println("N_S: $N_S%")
    println("O_S: $O_S%")
    println("A_S: $A_S%")

    // Перевірка складу сухої маси
    val total_S = H_S + C_S + S_S + N_S + O_S + A_S
    println("Перевірка складу сухої маси: $total_S%")

    // Склад горючої маси
    val H_G = H_P * KRG
    val C_G = C_P * KRG
    val S_G = S_P * KRG
    val N_G = N_P * KRG
    val O_G = O_P * KRG

    println("Склад горючої маси:")
    println("H_G: $H_G%")
    println("C_G: $C_G%")
    println("S_G: $S_G%")
    println("N_G: $N_G%")
    println("O_G: $O_G%")

    // Перевірка складу горючої маси
    val total_G = H_G + C_G + S_G + N_G + O_G
    println("Перевірка складу горючої маси: $total_G%")

    // Розрахунок нижчої теплоти згоряння (QРН)
    val Q_RN = 339 * C_P + 1030 * H_P - 108.8 * (O_P - S_P) - 25 * W_P
    println("Нижча теплота згоряння для робочої маси: $Q_RN кДж/кг")
}
