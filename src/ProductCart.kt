class ProductCart<CartItemType : CartItem> {
    var list = mutableListOf<CartItemType>()
    fun add(physicalProduct: CartItemType){
        if (physicalProduct.isAvailableForCart()){
            list.add(physicalProduct)
        }else{
            println("Товар недоступен к продаже")
        }
    }

    fun getLastCartItem(): CartItemType {
        return list.last()
    }

    fun checkout(){
        var sum = 0.0
        if (list.isEmpty()){
            println("Корзина пуста")
        }else{
            for (product in list){
                product.calculateTotalPrice()
            }
            println("Товары на общую сумму $sum долларов оплачены")
            list.clear()
        }
    }
}