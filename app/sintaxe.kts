//LINK TERMINAL KOTLIN ON LINE
//https://play.kotlinlang.org/#eyJ2ZXJzaW9uIjoiMS43LjAiLCJwbGF0Zm9ybSI6ImphdmEiLCJhcmdzIjoiIiwibm9uZU1hcmtlcnMiOnRydWUsInRoZW1lIjoiaWRlYSIsImNvZGUiOiIvKipcbiAqIFlvdSBjYW4gZWRpdCwgcnVuLCBhbmQgc2hhcmUgdGhpcyBjb2RlLlxuICogcGxheS5rb3RsaW5sYW5nLm9yZ1xuICovXG5mdW4gbWFpbigpIHtcbiAgICBwcmludGxuKFwiSGVsbG8sIHdvcmxkISEhXCIpXG59In0=

fun main() {
    println("Hello, world!!!")

    //CONSTANTES RETORNANDO VALOR MAXIMO DOS PRINCIPAIS TIPOS DE DADOS
    println(Int.MAX_VALUE)
    println(Float.MAX_VALUE)
    println(Long.MAX_VALUE)
    println(Byte.MAX_VALUE)
    println(Short.MAX_VALUE)

    //CONVERSOES EXPLICITAS PARA TIPOS DE DADOS
    toByte()
    toShort()
    toInt()
    toLong()
    toFloat()
    toDouble()
    toChar()

    //DECLARACAO DE VARIAVEIS
    var //VALOR MUTAVEL NOMEADA NO PADRAO CAMELCASE
    val //VALOR IMUTAVEL NOMEADA NO PADRAO CAMELCASE
    const val //VALOR IMUTAVEL E ATRIBUIDO EM TEMPO DE EXECUCAO E NOMEADA NO PADRAO SNAKE_CASE

    //DECLARACAO COM TIPAGEM IMPLICITA
    var idade = 37
    val idade = 23
    const val IDADE_MAXIMA = 100

    //DECLARACAO COM TIPAGEM EXPLICITA
    var idade:Int?
    var idade = 37

    val idade:Int?
    val idade = 23

    const val IDADE_MAXIMA:Int? //VALIDAR
    const val IDADE_MAXIMA = 100



}








