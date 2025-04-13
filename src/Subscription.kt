data class Subscription(
    var subscriptionName: String,
    var monthQuantity: Int,
    var priceForMonth: Double,
    var countryRestriction: Boolean
){
    companion object{
        const val quote = 20
    }
}
