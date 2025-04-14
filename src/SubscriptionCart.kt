class SubscriptionCart(val data: Subscription) {
    var list = mutableListOf<Subscription>()
    fun add(subscription: Subscription){
        if (data.monthQuantity <= Subscription.quote){
            list.add(subscription)
        }else{
            println("Подписка недоступна")
        }
    }

    fun getLastCartItem(): Subscription {
        return list.last()
    }

    fun checkout(){
        var sum = 0.0
        if (list.isEmpty()){
            println("Корзина пуста")
        }else{
            for (product in list){
                sum += data.monthQuantity * data.priceForMonth
            }
            println("Подписки на общую сумму $sum долларов оплачены")
            list.clear()
        }
    }
}