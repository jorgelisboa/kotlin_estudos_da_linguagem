fun main() {
    verifyCargo("Developer")
    //Operador elvis permiti que a variável possa ser null
    val teste: Int? = null
    val elvis: Int = teste ?: 10//Se "teste" for null, use 10, se não, use o seu valor
    println(elvis)
    //When
    op(10, 10, "Soma")
}

fun Math(a: Int, b: Int, c: String) {
    //Switch case melhorado
    when (c) {
        "Soma" -> {
            return a + b
        }
        "Subtração" -> {
            return a - b
        }
        else -> return "Operação não reconhecida"
    }
}
fun op(a: Int, b: Int, c: Int) {
    //Switch case melhorado
    when a > b && a > c -> "$a é o maior número" 
}
fun inRange(a: Int) : Boolean {
    when (a in 1..99){
        return true
    }
    else return false
}

fun verifyCargo(cargo:String) : Int {
var salary = 5.000
if(cargo.contains("Gerente")){
    return salary * 2
} else {
    return salary
}
}
