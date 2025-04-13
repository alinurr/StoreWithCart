data class PhysicalProduct(
    var productName: String,
    var price: Double,
    var quantity: Int,
    var state: State
){
    companion object{
        const val stockCount: Int
            private set(value) =
    }


}