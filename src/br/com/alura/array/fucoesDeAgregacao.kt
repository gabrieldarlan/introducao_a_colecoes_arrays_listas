package br.com.alura.array

import java.math.BigDecimal
import java.math.RoundingMode

fun arrayDeBigDecimal() {
    val salarios = bigDecimalArrayof("1500.55", "2000.00", "5000.00", "10000.00")

    println(salarios.contentToString())

    val aumento = "1.1".toBigDecimal()
    val salariosComAumento: Array<BigDecimal> = salarios
        .map { salario ->
            calculaAumentoRelativo(salario, aumento)
        }.toTypedArray()

    println(salariosComAumento.contentToString())

    val gastoInicial = salariosComAumento.somatoria()
    println("Gasto inicial $gastoInicial")

    val meses = 6.toBigDecimal()
    val gastoTotal = salariosComAumento.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }
    println(gastoTotal)

    val media = salariosComAumento
        .sorted()
        .takeLast(3)
        .toTypedArray()
        .media()
    println("Média dos salários maiores $media")

    val mediaMenoresSalarios = salariosComAumento
        .sorted()
        .take(3)
        .toTypedArray()
        .media()
    println("Média dos salários menores: $mediaMenoresSalarios")

}

private fun calculaAumentoRelativo(
    salario: BigDecimal,
    aumento: BigDecimal
): BigDecimal {
    return if (salario < "5000.00".toBigDecimal()) {
        salario + "500".toBigDecimal()
    } else {
        (salario * aumento).setScale(2, RoundingMode.UP)
    }
}



