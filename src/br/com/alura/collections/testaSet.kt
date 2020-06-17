package br.com.alura.collections

fun testaSet() {
    val assistiramCursoAndroid: Set<String> = setOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin: Set<String> = setOf("Alex", "Paulo", "Maria")
//    val assistiramAmbos: Set<String> = assistiramCursoAndroid + assistiramCursoKotlin

    val assistiramAmbos = mutableSetOf<Any>()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)
    assistiramAmbos.add("Ana")
    assistiramAmbos.add("Ana")
    println(assistiramAmbos)

    println(assistiramCursoKotlin + assistiramCursoAndroid)
    println(assistiramCursoKotlin union assistiramCursoAndroid)

    println(assistiramCursoAndroid - assistiramCursoKotlin)
    println(assistiramCursoAndroid subtract assistiramCursoKotlin)

    println(assistiramCursoKotlin intersect assistiramCursoAndroid)

    val assistiramList = assistiramAmbos.toMutableList()
    assistiramList.add("Alex")
    println(assistiramList)
    println(assistiramList.toSet())
}
