package br.com.alura.collections

fun main() {
    val pedidos: MutableMap<Int, Double> = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 34.0),
        3 to 50.0
    )
    println(pedidos)
    val pedido = pedidos[1]
    pedido?.let {
        println("pedido $it")
    }
    for (p: Map.Entry<Int, Double> in pedidos) {
        println("número do pedido: ${p.key}")
        println("valor do pedido: ${p.value}")
    }
    pedidos[4] = 70.0
    println(pedidos)
    pedidos.put(5, 70.0)
    println(pedidos)
    pedidos[1]=100.0
    println(pedidos)
    pedidos.putIfAbsent(6,200.0)
    println(pedidos)
    pedidos.putIfAbsent(6,200.0)
    println(pedidos)

    pedidos.remove(6)
    println(pedidos)
    pedidos.remove(3,100.0)
    println(pedidos)
}



