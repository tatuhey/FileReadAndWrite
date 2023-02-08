/*
    Name        : Raihan Khalil Abdillah
    ID          : 30065695
    AT1 - Portofolio 1, Activity 5 Task D
    File Write with Buffered Reader Demo
 */

import java.io.File

fun main(Args: Array<String>) {
    val fileName = "BufferedWriter.txt"
    val lines: List<String> = File(fileName).bufferedReader().readLines()

    lines.forEach {
        println(it)
    }
}