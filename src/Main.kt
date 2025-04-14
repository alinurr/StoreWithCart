fun main() {
    val physicalProduct1 = PhysicalProduct("gdg", 355.0, 1, State.NEW)
    val subscription1 = Subscription(
        "gdg", 3, 55.0, true)

    PhysicalProductCart cart1 = PhysicalProduct(physicalProduct1)

}