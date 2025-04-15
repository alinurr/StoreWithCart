interface CartItem {
    fun isAvailableForCart() : Boolean
    fun calculateTotalPrice() : Int
}