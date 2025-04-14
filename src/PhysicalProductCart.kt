class PhysicalProductCart(val data: PhysicalProduct) {
    var list = mutableListOf<PhysicalProduct>()
    fun add(physicalProduct: PhysicalProduct){
        if (data.quantity <= PhysicalProduct.stockCount){
            list.add(physicalProduct)
        }else{
            println("Товар недоступен к продаже")
        }
    }

    fun getLastCartItem(): PhysicalProduct {
        return list.last()
    }

    fun checkout(){
        var sum = 0.0
        if (list.isEmpty()){
            println("Корзина пуста")
        }else{
            for (product in list){
                sum += data.quantity * data.price
            }
            println("Товары на общую сумму $sum долларов оплачены")
            list.clear()
        }
    }
}