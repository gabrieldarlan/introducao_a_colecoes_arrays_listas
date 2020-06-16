package br.com.alura.list

fun main() {

    val livros = listaDeLivros


    livros.imprimeComMarcadores()

    livros.imprimeComMarcadores()

    val ordenadoPorAno = livros.sorted()
    ordenadoPorAno.imprimeComMarcadores()

    val ordenadoPorTitulo = livros.sortedBy { it.titulo }
    ordenadoPorTitulo.imprimeComMarcadores()

    livros.sortedBy { it.autor }.imprimeComMarcadores()

    val titulos:List<String> = listaDeLivros
        .filter { it.autor.startsWith("J") }
        .sortedBy { it.anoPublicacao }
        .map { it.titulo }

    println(titulos)
}

fun List<Livro>.imprimeComMarcadores() {
    val textoFormatado = this.joinToString(separator = "\n") {
        " - ${it.titulo} de ${it.autor}"
    }
    println(" ### Lista de Livros ### \n${textoFormatado}")
}