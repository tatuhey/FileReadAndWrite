/*
    Name        : Raihan Khalil Abdillah
    ID          : 30065695
    AT1 - Portofolio 1, Activity 5 Task C
    File Write Demo
 */

import java.io.File

fun main(args: Array<String>) {
    val fileName = "Kotlin.txt"
    val content = File(fileName).readText()

    println(content)

}