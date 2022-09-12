import java.util.Scanner

fun main(){
    val write = Scanner(System.`in`)
    print("Enter a msg: ")
    val msg = write.nextLine()
    println("find your character: ")
    val symbol = write.nextLine()

    var herfSayi = 0

    for (i in msg.indices){
        if (symbol.toString() == msg[i].toString()) {
            herfSayi++
        }
    }
    println("${msg} cumlesinde $symbol bu qederdir: $herfSayi")
}