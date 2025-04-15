fun main() {
    val physicalProduct1 = PhysicalProduct("gdg", 355, 6, State.NEW)
    val physicalProduct2 = PhysicalProduct("iPhone 15", 300, 6, State.NEW)
    val physicalProduct3 = PhysicalProduct("Samsung S25", 200, 5, State.OLD)

    val subscription1 = Subscription("Youtube", 3, 55, true)
    val subscription2 = Subscription("Yandex Plus", 2, 60, false)
    val subscription3 = Subscription("Netflix", 3, 55, true)

//    val cart1 : PhysicalProductCart = PhysicalProductCart()
//    cart1.add(physicalProduct2)
//    cart1.add(physicalProduct3)
//    println("Состояние последнего товара ${cart1.getLastCartItem().state}")
//    cart1.checkout()
//
//    val cart2 = SubscriptionCart()
//    cart2.add(subscription2)
//    cart2.add(subscription3)
//    println("Последняя подписка имеет ${cart2.getLastCartItem().countryRestriction}")
//    cart2.checkout()

    val genericCart = ProductCart<PhysicalProduct>()
    genericCart.add(physicalProduct1)
}