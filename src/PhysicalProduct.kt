data class PhysicalProduct(
    var productName: String,
    var price: Int,
    open var quantity: Int,
    var state: State
) : CartItem{
    init {
        stockCount += quantity
    }
    companion object{
        var stockCount: Int = 0
            private set(value){
                field = value
            }
    }

    override fun isAvailableForCart(): Boolean {
        return this.quantity <= PhysicalProduct.stockCount
    }

    override fun calculateTotalPrice(): Int {
        return this.quantity * this.price
    }
}



