fun main() {
    /*
    * Kotlin possui tipagem estática, isso melhora:
    * - Performance
    * - Segurança
    * Pode ser lido pela JVM, e convertido para JS;
    *
    * Estima-se que com Kotlin a quantidade de código escrito cai cerca de 40% em relação ao Java;
    * */


    //Sem especificar o tipo da variável
    var name = "Jorge"
    var age = 17

    //Especificando o tipo da variável
    // var + nomeVariavel + : + tipoVariavel + Atribuição de valor
    var nome: String = "Jorge"
    nome = "Ana"
    var idade: Int = 17
    var peso: Float = 73.5f

    //"Val" é imutável, já "Var" é mutável
    println("Meu nome é $name e tenho $idade anos")
    println("""Olá
        |Eu sei que o texto é meio longo
        |mas não se preocupe
    """.trimMargin())


    //Estudando funções//
    bonusSalary(1250.00)
    val idadeMin = 18

    if(bebida(idadeMin)){
        println("Você pode beber pois tem $idadeMin anos")
    } else {
        println("Você não pode beber pois tem $idadeMin anos")
    }
}

//Uma função, se tiver uma entrada, deve ser especificado o tipo de dado.
fun bonusSalary(salario: Float){
    val bonus = salario * 0.10
    println("Seu bônus é de $bonus")
}

fun bebida(idadeMin) : Boolean = if(idadeMin >= 18) true else false
