fun main() {
    // Вхідні дані за варіантом 4
    val coalMass = 67241996.0 // Донецьке газове вугілля, т
    val mazutMass = 11163333.0 // Мазут, т
    val gasVolume = 12867468.0 // Природний газ, м³

    // Відсоткові значення компонентів вугілля
    val Ar = 25.2 // Зола вугілля, %
    val G_win = 15.0 // Горючі речовини у леткій золі, %
    val Qri_coal = 20.47 // Нижча теплота згоряння вугілля, МДж/кг

    // Показник емісії твердих частинок для вугілля
    val k_tv_coal = (Ar * (1 - G_win / 100) / Qri_coal) * 1000
    val eta_zu = 0.985 // Ефективність золовловлювальної установки

    // Валовий викид для вугілля
    val emission_coal = k_tv_coal * coalMass * (1 - eta_zu) / 1000 // в тоннах

    println("Показник емісії твердих частинок для вугілля: $k_tv_coal г/ГДж")
    println("Валовий викид для вугілля: $emission_coal т")

    // Дані для мазуту
    val Ar_mazut = 0.15 // Зольність мазуту, %
    val Qri_mazut = 40.40 // Нижча теплота згоряння мазуту, МДж/кг

    // Показник емісії твердих частинок для мазуту
    val k_tv_mazut = (Ar_mazut * 1000) / Qri_mazut
    val emission_mazut = k_tv_mazut * mazutMass * (1 - eta_zu) / 1000 // в тоннах

    println("Показник емісії твердих частинок для мазуту: $k_tv_mazut г/ГДж")
    println("Валовий викид для мазуту: $emission_mazut т")

    // Для природного газу емісія твердих частинок відсутня
    val emission_gas = 0.0
    println("Валовий викид для природного газу: $emission_gas т")
}