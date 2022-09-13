import java.util.Scanner

fun main(){
    val write = Scanner(System.`in`)
    print("Enter a char: ")
    val symbol = write.nextLine()

    when (symbol) {
        "i", "a", "e", "o", "u" -> {
           println("Bu saitdir.")
        }else -> println("Bu samitdir.")
    }
}