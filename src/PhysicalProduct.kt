data class PhysicalProduct(
    var productName: String,
    var price: Double,
    open var quantity: Int,
    var state: State
){
    init {
        stockCount += quantity
    }
    companion object{
        var stockCount: Int = 0
            private set(value){
                field = value
            }
    }
}



