data class Subscription(
    var subscriptionName: String,
    var monthQuantity: Int,
    var priceForMonth: Int,
    var countryRestriction: Boolean
) : CartItem{
    companion object{
        const val quote = 20
    }

    override fun isAvailableForCart(): Boolean {
        return this.monthQuantity <= Subscription.quote
    }

    override fun calculateTotalPrice(): Int {
        return this.monthQuantity * this.priceForMonth
    }
}
